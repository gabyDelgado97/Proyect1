package com.example.gaby.turistear;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.Iterator;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marcadorPosicionActual;
    private Marker marcadorRestaurante;
    private Marker marcadorRestaurante2;
    double lat = 0.0;
    double lng = 0.0;
    Integer tipo=1;
    String mapa;
    Button btnMapa;
    ArrayList<String> categorias= new ArrayList<String>();
    private final static int MY_PERMISSION_FINE_LOCATION=101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if (status == ConnectionResult.SUCCESS) {

            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
            btnMapa=(Button)findViewById(R.id.btnMapa);
            btnMapa.setOnClickListener(new View.OnClickListener(){

                //sirve para los diferentes tipos de mapa
                public void onClick(View view){

                    switch (tipo){
                        case 1: mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                            mapa="MAPA HIBRIDO";
                            tipo=2;
                            break;
                        case 2: mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                            mapa="MAPA SATELITE";
                            tipo=3;
                            break;
                        case 3: mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                            mapa="MAPA TERRENO";
                            tipo=4;
                            break;
                        case 4: mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                            mapa="MAPA NORMAL";
                            tipo=1;
                            break;
                    }
                    Toast toast=Toast.makeText(getApplicationContext(),mapa,Toast.LENGTH_SHORT);
                    toast .show();
                }
            });


        } else {

            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, (Activity) getApplicationContext(), 10);
            dialog.show();
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //es para poner la ventana de latitud y longitud
        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                View v = getLayoutInflater().inflate(R.layout.info_window,null);
                TextView latitud = (TextView)v.findViewById(R.id.tvLat);
                TextView longitud = (TextView)v.findViewById(R.id.tvLng);
                TextView texto = (TextView)v.findViewById(R.id.tvText);

                LatLng ll = marker.getPosition();
                String nuevo = "Latitud: "+ll.latitude;
                String nuevo1 = "Longitud: "+ll.longitude;
                String nuevo2 = "Mi posicion Actual";
                latitud.setText(nuevo);
                longitud.setText(nuevo1);
                texto.setText(nuevo2);
                return v;
            }
        });

        UiSettings uiSettings=mMap.getUiSettings();

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        uiSettings.setMapToolbarEnabled(true);
        uiSettings.setCompassEnabled(true);

        miUbicacion(); //sirve para poner un marcador y tener las coordenadas
        agregarMarcador();


    }

    public void marcadorGPS(double lat, double lng){

        LatLng coordenadas = new LatLng(lat,lng);
        CameraUpdate miUbicacion = CameraUpdateFactory.newLatLngZoom(coordenadas, 16);

        //MARCADOR DE MI POSICION ACTUAL
        if (marcadorPosicionActual != null) marcadorPosicionActual.remove();
        marcadorPosicionActual = mMap.addMarker(new MarkerOptions().
                position(coordenadas).title("Mi posicion actual").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.pin1)));
    }

    public void agregarMarcador() {

        String latitud="", longitud="", nombre="", a="", lugar="";
        MainActivity m = new MainActivity();
        //ArrayList <String> categorias = m.categorias;
        Iterator <String> imprime = categorias.iterator();
        final AyudaBD ayudabd = new AyudaBD(getApplicationContext());
        SQLiteDatabase db = ayudabd.getWritableDatabase();
        Toast.makeText(getApplicationContext(),"cate "+categorias.toString(),Toast.LENGTH_SHORT).show();

        for(String Categorias: categorias ){
            Toast.makeText(getApplicationContext(),"for "+Categorias,Toast.LENGTH_SHORT).show();
            switch(a){
                case "Aeropuerto":
                    //String[] args = new String[] {"Aeropuerto"};
                    Cursor c = db.rawQuery("select * from tabla",null);
                    if(c.moveToFirst()){
                        //do{
                            lugar = c.getString(0);
                            nombre = c.getString(1);
                            latitud = c.getString(2);
                            longitud = c.getString(3);
                            //Toast.makeText(getApplicationContext(),"datos " +lugar,Toast.LENGTH_SHORT).show();
                        //}while(c.moveToNext() && (lugar!="Aeropuerto"));
                    }
                    lat = Float.parseFloat(latitud);
                    lng = Float.parseFloat(longitud);
                    LatLng mAeropuerto = new LatLng(lat, lng);
                    if (marcadorRestaurante != null) marcadorRestaurante.remove();
                    marcadorRestaurante = mMap.addMarker(new MarkerOptions().
                            position(mAeropuerto).title(nombre).
                            icon(BitmapDescriptorFactory.fromResource(R.mipmap.restaurante1)));
                    break;
            }
        }
    }
    //public void agregarMarcador1(/*String lugar, String nombre, String latitud, String longitud*/) {

        /*String latitud="", longitud="", nombre="";


        SQLiteDatabase db = miBaseDatos.getWritableDatabase();
        String[] args = new String[] {"aeropuerto"};
        Cursor c = db.rawQuery(DatosTabla1.COLUMNA_LUGAR+"=?",args);
        /*if(c.moveToFirst()){
            do{
                nombre = c.getString(0);
                latitud = c.getString(1);
                longitud = c.getString(2);
                Toast.makeText(getApplicationContext(), ""+nombre+""+latitud+""+longitud, Toast.LENGTH_LONG).show();
            }while(c.moveToNext());
        }*/
        //lat = Integer.parseInt(latitud);
        //lng = Integer.parseInt(longitud);
        /*lat = Integer.parseInt(latitud);
        lng = Integer.parseInt(longitud);
        //Marcadores Aeropuerto
        if(lugar=="aeropuerto"){
            LatLng mAeropuerto = new LatLng(lat, lng);
            if (marcadorRestaurante != null) marcadorRestaurante.remove();
            marcadorRestaurante = mMap.addMarker(new MarkerOptions().
                    position(mAeropuerto).title(nombre).
                    icon(BitmapDescriptorFactory.fromResource(R.mipmap.restaurante1)));
        }*/
        /*LatLng mRestaurante = new LatLng(lat, lng);
        if (marcadorRestaurante != null) marcadorRestaurante.remove();
        marcadorRestaurante = mMap.addMarker(new MarkerOptions().
                position(mRestaurante).title(nombre).
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.restaurante1)));

        /*LatLng mRestaurante2 = new LatLng(-2.900850321505161, -79.00559858825841);
        if (marcadorRestaurante2 != null) marcadorRestaurante2.remove();
        marcadorRestaurante2 = mMap.addMarker(new MarkerOptions().
                position(mRestaurante2).title("Restaurante").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.restaurante1)));*/

        //mMap.animateCamera(miUbicacion); //esto hace que de una se muestre donde esta de forma acercada*/
    //}

    //ESTE METODO SIRVE PARA OBTENER LA LATITUD Y LONGITUD DE NUESTRA POSICION ACTUAL
    private void actualizarUbicacion(Location location) {
        if (location != null) {
            lat = location.getLatitude();
            lng = location.getLongitude();
            marcadorGPS(lat, lng);
            //agregarMarcador();
        }
    }

    LocationListener locListener = new LocationListener() {

        //RECIBE LA ACTUALIZACION DE LA LOCALIZACION DE LA POSICION
        @Override
        public void onLocationChanged(Location location) {
            actualizarUbicacion(location);
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };

    private void miUbicacion() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);//PBETENER SERVICIOS DE GEO POSICIONAMIENTO EN EL DISPOSITIVO
        Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER); //OBTENGO MI UTIMA POSICION CONOCIDA
        actualizarUbicacion(location);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,15000,0,locListener); //SOLICITO AL GPS ACTUALIZACION DE POSICION CADA 15 SEG.
    }


    /*Places.GeoDataApi.getPlaceById(mGoogleApiClient, placeId)
            .setResultCallback(new ResultCallback<PlaceBuffer>() {
        @Override
        public void onResult(PlaceBuffer places) {
            if (places.getStatus().isSuccess() && places.getCount() > 0) {
                final Place myPlace = places.get(0);
                Log.i(TAG, "Place found: " + myPlace.getName());
            } else {
                Log.e(TAG, "Place not found");
            }
            places.release();
        }
    });*/
}
