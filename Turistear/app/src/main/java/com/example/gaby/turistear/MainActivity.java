package com.example.gaby.turistear;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import com.example.gaby.turistear.MapsActivity;

public class MainActivity extends AppCompatActivity {

    ArrayList <String> categorias;

    private Button mapa;
    private Button cargar;
    private Button verBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AyudaBD ayudabd = new AyudaBD(getApplicationContext());
        SQLiteDatabase db = ayudabd.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Aeropuerto");
        valores.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Aeropuerto Mariscal La Mar");
        valores.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8894554070132226");
        valores.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98441254890442");

        Long IdGuardado = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado, Toast.LENGTH_LONG).show();

        ContentValues valores1 = new ContentValues();
        valores1.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores1.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa de Ahorro y Credito Policia Nacional");
        valores1.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9006728222962397");
        valores1.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00440305269241");

        Long IdGuardado1 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores1);
        // Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado1, Toast.LENGTH_LONG).show();

        ContentValues valores2 = new ContentValues();
        valores2.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores2.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa Caja");
        valores2.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.891172515868096");
        valores2.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98446820474148");

        Long IdGuardado2 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores2);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado2, Toast.LENGTH_LONG).show();

        ContentValues valores3 = new ContentValues();
        valores3.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores3.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Mutualista Pichincha");
        valores3.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8991124362563534");
        valores3.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00311425126075");

        Long IdGuardado3 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores3);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado3, Toast.LENGTH_LONG).show();

        ContentValues valores4 = new ContentValues();
        valores4.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores4.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Pacifico");
        valores4.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8990280548040195");
        valores4.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00382235444069");

        Long IdGuardado4 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores4);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado4, Toast.LENGTH_LONG).show();

        ContentValues valores5 = new ContentValues();
        valores5.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores5.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco Solidario");
        valores5.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8993977258819577");
        valores5.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00426760113716");

        Long IdGuardado5 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores5);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado5, Toast.LENGTH_LONG).show();

        ContentValues valores6 = new ContentValues();
        valores6.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores6.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa de Ahorro y Credito 29 de Octubre");
        valores6.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898353002958717");
        valores6.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00422602689743");

        Long IdGuardado6 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores6);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado6, Toast.LENGTH_LONG).show();

        ContentValues valores7 = new ContentValues();
        valores7.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores7.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "BanEcuador");
        valores7.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898067713069712");
        valores7.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00428503549576");

        Long IdGuardado7 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores7);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado7, Toast.LENGTH_LONG).show();

        ContentValues valores8 = new ContentValues();
        valores8.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores8.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Austro");
        valores8.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898300766787237");
        valores8.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00318801200866");

        Long IdGuardado8 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores8);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado8, Toast.LENGTH_LONG).show();

        ContentValues valores9 = new ContentValues();
        valores9.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores9.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cajero Automatico Banco del Austro");
        valores9.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898295409231054");
        valores9.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00313705003738");

        Long IdGuardado9 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores9);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado9, Toast.LENGTH_LONG).show();

        ContentValues valores10 = new ContentValues();
        valores10.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores10.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco Bolivariano");
        valores10.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898036907114963");
        valores10.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00298282301902");

        Long IdGuardado10 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores10);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado10, Toast.LENGTH_LONG).show();

        ContentValues valores11 = new ContentValues();
        valores11.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores11.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco de Guayaquil");
        valores11.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8984480995724105");
        valores11.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.002797750597");

        Long IdGuardado11 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores11);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado11, Toast.LENGTH_LONG).show();

        ContentValues valores12 = new ContentValues();
        valores12.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores12.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cooperativa JEP");
        valores12.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.897144873452682");
        valores12.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00656491315841");

        Long IdGuardado12 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores12);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado12, Toast.LENGTH_LONG).show();

        ContentValues valores13 = new ContentValues();
        valores13.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores13.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Jardin Azuayo");
        valores13.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8962367663898654");
        valores13.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00477319753647");

        Long IdGuardado13 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores13);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado13, Toast.LENGTH_LONG).show();

        ContentValues valores14 = new ContentValues();
        valores14.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores14.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Austro 2");
        valores14.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8961242574995154");
        valores14.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00382101333618");

        Long IdGuardado14 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores14);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado14, Toast.LENGTH_LONG).show();

        ContentValues valores15 = new ContentValues();
        valores15.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores15.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Produbanco");
        valores15.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8975065088058978");
        valores15.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00172889030456");

        Long IdGuardado15 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores15);
        // Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado15, Toast.LENGTH_LONG).show();

        ContentValues valores16 = new ContentValues();
        valores16.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores16.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Automatic Machine Cash");
        valores16.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8973397547407123");
        valores16.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00205544925213");

        Long IdGuardado16 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores16);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado16, Toast.LENGTH_LONG).show();

        ContentValues valores17 = new ContentValues();
        valores17.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Banco");
        valores17.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Banco del Pacifico 2");
        valores17.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8998330268152426");
        valores17.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00939397311687");

        Long IdGuardado17 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores17);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado17, Toast.LENGTH_LONG).show();


        //BARES
        ContentValues valores18 = new ContentValues();
        valores18.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores18.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Pecado Morlaco");
        valores18.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9005088422412313");
        valores18.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00556227657813");

        Long IdGuardado18 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores18);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado18, Toast.LENGTH_LONG).show();

        ContentValues valores19 = new ContentValues();
        valores19.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores19.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Dubai");
        valores19.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9010887964162477");
        valores19.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00545364711303");

        Long IdGuardado19 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores19);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado19, Toast.LENGTH_LONG).show();

        ContentValues valores20 = new ContentValues();
        valores20.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores20.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Dubai");
        valores20.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9010887964162477");
        valores20.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00545364711303");

        Long IdGuardado20 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores20);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado20, Toast.LENGTH_LONG).show();

        ContentValues valores21 = new ContentValues();
        valores21.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores21.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "La Jaula Bar-Discoteca");
        valores21.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.90118121402867");
        valores21.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00548181030769");

        Long IdGuardado21 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores21);
        //Toast.makeText(getApplicationContext(), "Se guardo el dato: "+IdGuardado21, Toast.LENGTH_LONG).show();

        ContentValues valores22 = new ContentValues();
        valores22.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores22.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Sportbar 360");
        valores22.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9012937224161996");
        valores22.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00561860296744");

        Long IdGuardado22 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores22);

        ContentValues valores23 = new ContentValues();
        valores23.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores23.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Bar-Karaoke Indian Bapu");
        valores23.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9014865939116254");
        valores23.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0051237354042");

        Long IdGuardado23 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores23);

        ContentValues valores24 = new ContentValues();
        valores24.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores24.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Inca Bar and Lounge");
        valores24.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.901826797719199");
        valores24.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00509154889602");

        Long IdGuardado24 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores24);

        ContentValues valores25 = new ContentValues();
        valores25.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores25.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Rumy Lounge");
        valores25.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902011632815816");
        valores25.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00500303599853");

        Long IdGuardado25 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores25);

        ContentValues valores26 = new ContentValues();
        valores26.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores26.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Tic Tic Bar");
        valores26.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9015388299359843");
        valores26.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00440020952243");

        Long IdGuardado26 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores26);

        ContentValues valores27 = new ContentValues();
        valores27.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores27.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Persi Pipa Bar");
        valores27.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9015950841133504");
        valores27.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00437472853679");

        Long IdGuardado27 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores27);

        ContentValues valores28 = new ContentValues();
        valores28.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores28.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Amorfino Amor");
        valores28.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9006481384212663");
        valores28.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00461679790038");

        Long IdGuardado28 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores28);

        ContentValues valores29 = new ContentValues();
        valores29.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores29.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Verde Pinton y Maduro");
        valores29.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.900846367570951");
        valores29.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00372764561195");

        Long IdGuardado29 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores29);

        ContentValues valores30 = new ContentValues();
        valores30.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores30.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Plazma Bar Cuenca");
        valores30.put(AyudaBD.DatosTabla.COLUMNA_LAT, "2.9017390680069677");
        valores30.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00405822787303");

        Long IdGuardado30 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores30);

        ContentValues valores31 = new ContentValues();
        valores31.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores31.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Discoteca Nidia Fuzzion Party");
        valores31.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9019948905075843");
        valores31.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00376586709041");

        Long IdGuardado31 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores31);

        ContentValues valores32 = new ContentValues();
        valores32.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores32.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Karma Lounge Bar-2.9022493735659283");
        valores32.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9022493735659283");
        valores32.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00283111724872");

        Long IdGuardado32 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores32);

        ContentValues valores33 = new ContentValues();
        valores33.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores33.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "La Parola Bar-Restaurante");
        valores33.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902602970983454");
        valores33.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00294846389312");

        Long IdGuardado33 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores33);

        ContentValues valores34 = new ContentValues();
        valores34.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores34.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Garaje 87");
        valores34.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9000350341927272");
        valores34.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01585089508313");

        Long IdGuardado34 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores34);

        ContentValues valores35 = new ContentValues();
        valores35.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Bar-Discoteca");
        valores35.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Laos Discoteca");
        valores35.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9052264862447137");
        valores35.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00199996773023");

        Long IdGuardado35 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores35);


        //CEMENTERIOS
        ContentValues valores36 = new ContentValues();
        valores36.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Cementerio");
        valores36.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cementerio Municipal");
        valores36.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.897383012358637");
        valores36.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99140289400935");

        Long IdGuardado36 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores36);

        ContentValues valores37 = new ContentValues();
        valores37.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Cementerio");
        valores37.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Funeraria y Camposanto Santa Ana CAMPSANA S.A.");
        valores37.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9060407970145112");
        valores37.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.97494485949397");

        Long IdGuardado37 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores37);


        //CINES
        ContentValues valores38 = new ContentValues();
        valores38.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Cine");
        valores38.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Multicines Milenium Plaza");
        valores38.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9060053034473734");
        valores38.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00235837673068");

        Long IdGuardado38 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores38);

        ContentValues valores39 = new ContentValues();
        valores39.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Cine");
        valores39.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Multicines Mall del Rio");
        valores39.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.919396344254855");
        valores39.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01597863410831");

        Long IdGuardado39 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores39);

        //FARMACIAS
        ContentValues valores40 = new ContentValues();
        valores40.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores40.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Pharmacy's");
        valores40.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902011265484307");
        valores40.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99658626293063");

        Long IdGuardado40 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores40);

        ContentValues valores41 = new ContentValues();
        valores41.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores41.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Farmacia Farmolab");
        valores41.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.903819433313805");
        valores41.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00395965551257");

        Long IdGuardado41 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores41);

        ContentValues valores42 = new ContentValues();
        valores42.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores42.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Fybeca Centros Medicos");
        valores42.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9024318321858393");
        valores42.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00801247333408");

        Long IdGuardado42 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores42);

        ContentValues valores43 = new ContentValues();
        valores43.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores43.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "4Life Cuenca");
        valores43.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.899978077758811");
        valores43.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00708979343295");

        Long IdGuardado43 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores43);

        ContentValues valores44 = new ContentValues();
        valores44.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores44.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Botica Olmedo");
        valores44.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.900197737214931");
        valores44.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00393283342243");

        Long IdGuardado44 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores44);

        ContentValues valores45 = new ContentValues();
        valores45.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores45.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Farmacia CCV");
        valores45.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9008299276066034");
        valores45.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00048485373378");

        Long IdGuardado45 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores45);

        ContentValues valores46 = new ContentValues();
        valores46.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores46.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Fybeca");
        valores46.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8990431852062994");
        valores46.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98321410988689");

        Long IdGuardado46 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores46);

        ContentValues valores47 = new ContentValues();
        valores47.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores47.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Farmacia Cruz Azul");
        valores47.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.895426831385089");
        valores47.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98215195511699");

        Long IdGuardado47 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores47);

        ContentValues valores48 = new ContentValues();
        valores48.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores48.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Farmasol Totoracocha");
        valores48.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8942320926960727");
        valores48.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98385784005046");

        Long IdGuardado48 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores48);

        ContentValues valores49 = new ContentValues();
        valores49.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores49.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Farmacia Guadalupana");
        valores49.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8956304190181266");
        valores49.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.98972114895702");

        Long IdGuardado49 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores49);

        ContentValues valores50 = new ContentValues();
        valores50.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Farmacia");
        valores50.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Fybeca Bolivar");
        valores50.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.896557278042828");
        valores50.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0055139956367");

        Long IdGuardado50 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores50);


        //HOSPITALES
        ContentValues valores51 = new ContentValues();
        valores51.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores51.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hospital San Martin de Porres");
        valores51.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.891547944232523");
        valores51.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00851270531535");

        Long IdGuardado51 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores51);

        ContentValues valores52 = new ContentValues();
        valores52.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores52.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hospital Bolivar");
        valores52.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8949446500030196");
        valores52.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00950512265086");

        Long IdGuardado52 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores52);

        ContentValues valores53 = new ContentValues();
        valores53.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores53.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hospital Universitario del Rio");
        valores53.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8929683738891807");
        valores53.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.96086862658382");

        Long IdGuardado53 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores53);

        ContentValues valores54 = new ContentValues();
        valores54.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores54.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hospital IESS Jose Carrasco Arteaga");
        valores54.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8987009714785295");
        valores54.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.97011688326717");

        Long IdGuardado54 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores54);

        ContentValues valores55 = new ContentValues();
        valores55.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores55.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hospital del Instituto Ecuatoriano de Seguridad Social");
        valores55.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8990331397950255");
        valores55.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.97019198511958");

        Long IdGuardado55 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores55);

        ContentValues valores56 = new ContentValues();
        valores56.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores56.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Clinica de Especialidades Medica del Sur");
        valores56.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.900340381899855");
        valores56.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99471810435176");

        Long IdGuardado56 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores56);

        ContentValues valores57 = new ContentValues();
        valores57.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores57.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Clinica Santa Ana");
        valores57.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9077766319916796");
        valores57.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00068333720088");

        Long IdGuardado57 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores57);

        ContentValues valores58 = new ContentValues();
        valores58.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores58.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Regional del IESS");
        valores58.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.899429598625763");
        valores58.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99617186163783");

        Long IdGuardado58 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores58);

        ContentValues valores59 = new ContentValues();
        valores59.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores59.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Clinica Santa Ines");
        valores59.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9022155216248127");
        valores59.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00893381213069");

        Long IdGuardado59 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores59);

        ContentValues valores60 = new ContentValues();
        valores60.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores60.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Solca");
        valores60.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.912973405916685");
        valores60.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99246504877925");

        Long IdGuardado60 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores60);

        ContentValues valores61 = new ContentValues();
        valores61.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores61.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Aprofe");
        valores61.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8998233785430894");
        valores61.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99623355244518");

        Long IdGuardado61 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores61);

        ContentValues valores62 = new ContentValues();
        valores62.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores62.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Clinica Medica del Sur");
        valores62.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.900458247917013");
        valores62.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99404486988902");

        Long IdGuardado62 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores62);

        ContentValues valores63 = new ContentValues();
        valores63.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hospital");
        valores63.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hospital Monte Sinai");
        valores63.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9086016884209207");
        valores63.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00736471985698");

        Long IdGuardado63 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores63);


        //HOTEL
        ContentValues valores64 = new ContentValues();
        valores64.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores64.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Casa San Rafael");
        valores64.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.897870550260702");
        valores64.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00101593111873");

        Long IdGuardado64 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores64);

        ContentValues valores65 = new ContentValues();
        valores65.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores65.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Las Americas");
        valores65.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8964347237499823");
        valores65.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00065651511073");

        Long IdGuardado65 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores65);

        ContentValues valores66 = new ContentValues();
        valores66.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores66.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Yanuncay");
        valores66.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8963865056639158");
        valores66.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99951389407039");

        Long IdGuardado66 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores66);

        ContentValues valores67 = new ContentValues();
        valores67.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores67.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Los Balcones");
        valores67.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.894147041183065");
        valores67.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00219610308528");

        Long IdGuardado67 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores67);

        ContentValues valores68 = new ContentValues();
        valores68.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores68.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Portal Español");
        valores68.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.894232762393005");
        valores68.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99824789141536");

        Long IdGuardado68 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores68);

        ContentValues valores69 = new ContentValues();
        valores69.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores69.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Italia");
        valores69.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.895154264990174");
        valores69.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99642935370326");

        Long IdGuardado69 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores69);

        ContentValues valores70 = new ContentValues();
        valores70.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores70.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Ensueños");
        valores70.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.897527666483353");
        valores70.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99749220000001");

        Long IdGuardado70 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores70);

        ContentValues valores71 = new ContentValues();
        valores71.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores71.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hostal Villa del Rosario");
        valores71.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9017172705156087");
        valores71.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00224974726558");

        Long IdGuardado71 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores71);

        ContentValues valores72 = new ContentValues();
        valores72.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores72.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Black Olive | Hotel & Bistro");
        valores72.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9030512971856868");
        valores72.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00295785044551");

        Long IdGuardado72 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores72);

        ContentValues valores73 = new ContentValues();
        valores73.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores73.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Casa del Barranco");
        valores73.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9013261700287245");
        valores73.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00529137228847");

        Long IdGuardado73 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores73);

        ContentValues valores74 = new ContentValues();
        valores74.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores74.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Milan");
        valores74.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8986741837068246");
        valores74.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00605848406673");

        Long IdGuardado74 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores74);

        ContentValues valores75 = new ContentValues();
        valores75.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores75.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Tomebamba");
        valores75.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8962954270513");
        valores75.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00675049399257");

        Long IdGuardado75 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores75);

        ContentValues valores76 = new ContentValues();
        valores76.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores76.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel 4 Mundos");
        valores76.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8952667739768567");
        valores76.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00444915865779");

        Long IdGuardado76 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores76);

        ContentValues valores77 = new ContentValues();
        valores77.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores77.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hamilton");
        valores77.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8909807094501696");
        valores77.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0118520555389");

        Long IdGuardado77 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores77);

        ContentValues valores78 = new ContentValues();
        valores78.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores78.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Santiago de Campostela");
        valores78.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8905574596993717");
        valores78.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0235223469627");

        Long IdGuardado78 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores78);

        ContentValues valores79 = new ContentValues();
        valores79.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores79.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Nuestra Residencia");
        valores79.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8908682000381454");
        valores79.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.02589878414989");

        Long IdGuardado79 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores79);

        ContentValues valores80 = new ContentValues();
        valores80.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores80.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Oro Verde");
        valores80.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.889986875924689");
        valores80.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.03184255932689");

        Long IdGuardado80 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores80);

        ContentValues valores81 = new ContentValues();
        valores81.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores81.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hotel Pinar del Lago");
        valores81.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8891671635209923");
        valores81.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0336450037849");

        Long IdGuardado81 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores81);

        ContentValues valores82 = new ContentValues();
        valores82.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Hotel");
        valores82.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Hostal Chaski Wasy");
        valores82.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8921433060543564");
        valores82.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01738008831859");

        Long IdGuardado82 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores82);



        //MUSEOS
        ContentValues valores83 = new ContentValues();
        valores83.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores83.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo Remigio Crespo Toral");
        valores83.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9019610385588477");
        valores83.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.003947585572");

        Long IdGuardado83 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores83);

        ContentValues valores84 = new ContentValues();
        valores84.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores84.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo de las Culturas Aborigenes");
        valores84.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902654839624906");
        valores84.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00231143807292");

        Long IdGuardado84 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores84);

        ContentValues valores85 = new ContentValues();
        valores85.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores85.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Ruinas de Todos Santos");
        valores85.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.905121982049353");
        valores85.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99977675055385");

        Long IdGuardado85 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores85);

        ContentValues valores86 = new ContentValues();
        valores86.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores86.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo Manuel Agustin Landivar");
        valores86.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.905001437756459");
        valores86.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99916788910747");

        Long IdGuardado86 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores86);

        ContentValues valores87 = new ContentValues();
        valores87.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores87.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo Pumapungo");
        valores87.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9060809784099084");
        valores87.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99682363842845");

        Long IdGuardado87 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores87);

        ContentValues valores88 = new ContentValues();
        valores88.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores88.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Pumapungo");
        valores88.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9059577554594727");
        valores88.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99665465926051");

        Long IdGuardado88 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores88);

        ContentValues valores89 = new ContentValues();
        valores89.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores89.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Ruinas de Pumapungo");
        valores89.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.907273025822685");
        valores89.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99704626177669");

        Long IdGuardado89 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores89);

        ContentValues valores90 = new ContentValues();
        valores90.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores90.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo de Historia de la Medicina");
        valores90.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9029548615755965");
        valores90.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00484344338298");

        Long IdGuardado90 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores90);

        ContentValues valores91 = new ContentValues();
        valores91.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores91.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Instituto Azuayo de Folklore");
        valores91.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8997644455029588");
        valores91.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00365522478938");

        Long IdGuardado91 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores91);

        ContentValues valores92 = new ContentValues();
        valores92.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores92.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Casa Museo Maria Astudillo Montesinos");
        valores92.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8976776781487326");
        valores92.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00207540367961");

        Long IdGuardado92 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores92);

        ContentValues valores93 = new ContentValues();
        valores93.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores93.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Casa de la Cultura");
        valores93.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898039313331713");
        valores93.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00554618214488");

        Long IdGuardado93 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores93);

        ContentValues valores94 = new ContentValues();
        valores94.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores94.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo del Monasterio de la Conceptas");
        valores94.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.896571341649346");
        valores94.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00166502570033");

        Long IdGuardado94 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores94);

        ContentValues valores95 = new ContentValues();
        valores95.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores95.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "UNADEVI");
        valores95.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.892020081585943");
        valores95.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00700262163997");

        Long IdGuardado95 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores95);

        ContentValues valores96 = new ContentValues();
        valores96.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores96.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo Municipal de Arte Moderno");
        valores96.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8967481412593634");
        valores96.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01020786141277");

        Long IdGuardado96 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores96);

        ContentValues valores97 = new ContentValues();
        valores97.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Museo");
        valores97.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Museo de Arte Moderno");
        valores97.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8962659604397687");
        valores97.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01132634257198");
        Long IdGuardado97 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores97);


        //PARQUES
        ContentValues valores98 = new ContentValues();
        valores98.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores98.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque de la Madre");
        valores98.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9041361972319626");
        valores98.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00347015236736");
        Long IdGuardado98 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores98);

        ContentValues valores99 = new ContentValues();
        valores99.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores99.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque La Republica");
        valores99.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8998233785430894");
        valores99.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.9923658070457");
        Long IdGuardado99 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores99);

        ContentValues valores100 = new ContentValues();
        valores100.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores100.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque San Blas");
        valores100.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8985938203878794");
        valores100.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99874678229213");
        Long IdGuardado100 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores100);

        ContentValues valores101 = new ContentValues();
        valores101.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores101.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque Calderon");
        valores101.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.897167370527284");
        valores101.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00422519420505");
        Long IdGuardado101 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores101);

        ContentValues valores102 = new ContentValues();
        valores102.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores102.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque de la Americas");
        valores102.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8883595051325885");
        valores102.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01028966878772");
        Long IdGuardado102 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores102);

        ContentValues valores103 = new ContentValues();
        valores103.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores103.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque Guatana");
        valores103.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.896095857712778");
        valores103.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.9807317254436");
        Long IdGuardado103 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores103);

        ContentValues valores104 = new ContentValues();
        valores104.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores104.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque Curiquingue");
        valores104.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8923134093746223");
        valores104.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.97944426511646");
        Long IdGuardado104 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores104);

        ContentValues valores105 = new ContentValues();
        valores105.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores105.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque de la Madre");
        valores105.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9043839828988234");
        valores105.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00348490451694");
        Long IdGuardado105 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores105);

        ContentValues valores106 = new ContentValues();
        valores106.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores106.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque la Concordia Pista de Bicicross");
        valores106.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9050563523803734");
        valores106.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01258295749545");
        Long IdGuardado106 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores106);

        ContentValues valores107 = new ContentValues();
        valores107.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores107.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque San Marcos");
        valores107.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.904000919628736");
        valores107.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01593571876407");
        Long IdGuardado107 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores107);

        ContentValues valores108 = new ContentValues();
        valores108.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores108.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque de la Fogata");
        valores108.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8958092278630065");
        valores108.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01867157195926");
        Long IdGuardado108 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores108);

        ContentValues valores109 = new ContentValues();
        valores109.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores109.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque Cristo Rey");
        valores109.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8869772426774585");
        valores109.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00269633506656");
        Long IdGuardado109 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores109);

        ContentValues valores110 = new ContentValues();
        valores110.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores110.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque Miraflores");
        valores110.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.88310368428226");
        valores110.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.99387723182559");
        Long IdGuardado110 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores110);

        ContentValues valores111 = new ContentValues();
        valores111.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Parque");
        valores111.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Parque el Dragon");
        valores111.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902870480410022");
        valores111.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.03086891745448");
        Long IdGuardado111 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores111);



        //RESTAURANTES
        ContentValues valores112 = new ContentValues();
        valores112.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores112.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Burger King");
        valores112.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.905659073686844");
        valores112.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0022899804008");
        Long IdGuardado112 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores112);


        ContentValues valores113 = new ContentValues();
        valores113.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores113.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "KFC");
        valores113.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9061921469297345");
        valores113.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00219342087627");
        Long IdGuardado113 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores113);

        ContentValues valores114 = new ContentValues();
        valores114.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores114.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Pizza Hut");
        valores114.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.904729543359659");
        valores114.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00248578165889");
        Long IdGuardado114 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores114);

        ContentValues valores115 = new ContentValues();
        valores115.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores115.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "McDonalds");
        valores115.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.905495669275555");
        valores115.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00371423338771");
        Long IdGuardado115 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores115);

        ContentValues valores116 = new ContentValues();
        valores116.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores116.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Chill & Grill");
        valores116.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9061064266262537");
        valores116.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00384029721141");
        Long IdGuardado116 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores116);

        ContentValues valores117 = new ContentValues();
        valores117.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores117.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Tutto Fredo");
        valores117.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9063930538654894");
        valores117.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00350233887553");
        Long IdGuardado117 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores117);

        ContentValues valores118 = new ContentValues();
        valores118.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores118.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Doña Menestra");
        valores118.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.906239025217942");
        valores118.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00493195628047");
        Long IdGuardado118 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores118);

        ContentValues valores119 = new ContentValues();
        valores119.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores119.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Pronto Tacos");
        valores119.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9064533259392413");
        valores119.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0047388372314");
        Long IdGuardado119 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores119);

        ContentValues valores120 = new ContentValues();
        valores120.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores120.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "4 Reales");
        valores120.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9079159272753206");
        valores120.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00598338221431");
        Long IdGuardado120 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores120);

        ContentValues valores121 = new ContentValues();
        valores121.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores121.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Domino's Pizza");
        valores121.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9058532838170503");
        valores121.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00691142653346");
        Long IdGuardado121 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores121);

        ContentValues valores122 = new ContentValues();
        valores122.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores122.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Taj Mahal");
        valores122.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9008493487041416");
        valores122.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00559982632518");
        Long IdGuardado122 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores122);

        ContentValues valores123 = new ContentValues();
        valores123.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores123.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "El Mercado");
        valores123.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.901261879524775");
        valores123.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00516262625575");
        Long IdGuardado123 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores123);

        ContentValues valores124 = new ContentValues();
        valores124.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores124.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Cositas");
        valores124.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.901419927007086");
        valores124.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00485149001003");
        Long IdGuardado124 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores124);

        ContentValues valores125 = new ContentValues();
        valores125.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores125.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "La Esquina");
        valores125.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.902421786804666");
        valores125.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00282508109927");
        Long IdGuardado125 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores125);

        ContentValues valores126 = new ContentValues();
        valores126.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores126.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Moliendo Cafe");
        valores126.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9013743879042764");
        valores126.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00288006638408");
        Long IdGuardado126 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores126);

        ContentValues valores127 = new ContentValues();
        valores127.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores127.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Restaurant Pizzeria Mediterraneo");
        valores127.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9010864200058246");
        valores127.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00427749728084");
        Long IdGuardado127 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores127);

        ContentValues valores128 = new ContentValues();
        valores128.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores128.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "La Vina");
        valores128.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.9000765227032526");
        valores128.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00452560161472");
        Long IdGuardado128 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores128);

        ContentValues valores129 = new ContentValues();
        valores129.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores129.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Wraps Chalet");
        valores129.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.899629167376506");
        valores129.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0055488643539");
        Long IdGuardado129 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores129);

        ContentValues valores130 = new ContentValues();
        valores130.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores130.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Señor Yogy");
        valores130.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898733116803734");
        valores130.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00544828151584");
        Long IdGuardado130 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores130);

        ContentValues valores131 = new ContentValues();
        valores131.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores131.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Raymipampa");
        valores131.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.897283897484727");
        valores131.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0049185452354");
        Long IdGuardado131 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores131);

        ContentValues valores132 = new ContentValues();
        valores132.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores132.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "El Cantaro");
        valores132.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8968686864321636");
        valores132.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00438210343242");
        Long IdGuardado132 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores132);

        ContentValues valores133 = new ContentValues();
        valores133.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores133.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "New York Pizza");
        valores133.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8955038464479537");
        valores133.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00627708410144");
        Long IdGuardado133 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores133);

        ContentValues valores134 = new ContentValues();
        valores134.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Restaurante");
        valores134.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Pizza y Focaccia");
        valores134.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.895305616362524");
        valores134.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00260379885555");
        Long IdGuardado134 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores134);


        //TEATROS
        ContentValues valores135 = new ContentValues();
        valores135.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Teatro");
        valores135.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Teatro Casa de la Cultura");
        valores135.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.898558326586869");
        valores135.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0041795966518");
        Long IdGuardado135 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores135);

        ContentValues valores136 = new ContentValues();
        valores136.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Teatro");
        valores136.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Teatro Sucre");
        valores136.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.8981913340130436");
        valores136.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.0038201806438");
        Long IdGuardado136 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores136);

        ContentValues valores137 = new ContentValues();
        valores137.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Teatro");
        valores137.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Teatro Carlos Cueva Tamaris");
        valores137.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.900738179658544");
        valores137.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00856634949565");
        Long IdGuardado137 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores137);


        //UNIVERSIDADES
        ContentValues valores138 = new ContentValues();
        valores138.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Universidad");
        valores138.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Universidad de Cuenca");
        valores138.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.900577453308253");
        valores138.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.01032587860942");
        Long IdGuardado138 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores138);

        ContentValues valores139 = new ContentValues();
        valores139.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Universidad");
        valores139.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Universidad del Azuay");
        valores139.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.918653666679478");
        valores139.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-79.00195738648296");
        Long IdGuardado139 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores139);

        ContentValues valores140 = new ContentValues();
        valores140.put(AyudaBD.DatosTabla.COLUMNA_LUGAR,"Universidad");
        valores140.put(AyudaBD.DatosTabla.COLUMNA_NOMBRE, "Universidad Politecnica Salesiana");
        valores140.put(AyudaBD.DatosTabla.COLUMNA_LAT, "-2.885908399044618");
        valores140.put(AyudaBD.DatosTabla.COLUMNA_LONG, "-78.9893402752769");
        Long IdGuardado140 = db.insert(AyudaBD.DatosTabla.NOMBRE_TABLA, AyudaBD.DatosTabla.COLUMNA_NOMBRE, valores140);
        Toast.makeText(getApplicationContext(), "Base de Datos Creada", Toast.LENGTH_LONG).show();

        //PARA EL MAPA
        mapa=(Button)findViewById(R.id.mapa);
        mapa.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                //finSeleccionar();
                Intent inten = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(inten);

            }
        });

        //PARA VER LA BASE DE DATOS
        verBase=(Button)findViewById(R.id.verTabla);
        verBase.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent inten = new Intent(MainActivity.this,ver_base.class);
                startActivity(inten);
            }
        });

    }

    public void seleccionar(View view){

        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId()){

            case R.id.aeropuerto:
                if(checked) {
                    categorias.add("Aeropuerto");
                }else{
                    categorias.remove("Aeropuerto");
                }
                break;
            case R.id.bancos:
                if(checked) {
                    categorias.add("Bancos");
                }else{
                    categorias.remove("Bancos");
                }
                break;
            case R.id.bares:
                if(checked) {
                    categorias.add("Bar");
                }else{
                    categorias.remove("Bar");
                }
                break;
            case R.id.cementerios:
                if(checked) {
                    categorias.add("Cementerio");
                }else{
                    categorias.remove("Cementerio");
                }
                break;
            case R.id.cines:
                if(checked) {
                    categorias.add("Cine");
                }else{
                    categorias.remove("Cine");
                }
                break;
            case R.id.farmacias:
                if(checked) {
                    categorias.add("Farmacia");
                }else{
                    categorias.remove("Farmacia");
                }
                break;
            case R.id.hospitales:
                if(checked) {
                    categorias.add("Hospital");
                }else{
                    categorias.remove("Hospital");
                }
                break;
            case R.id.hoteles:
                if(checked) {
                    categorias.add("Hotel");
                }else{
                    categorias.remove("Hotel");
                }
                break;
            case R.id.museos:
                if(checked) {
                    categorias.add("Museo");
                }else{
                    categorias.remove("Museo");
                }
                break;
            case R.id.parquesPublicos:
                if(checked) {
                    categorias.add("Parque");
                }else{
                    categorias.remove("Parque");
                }
                break;
            case R.id.restaurantes:
                if(checked) {
                    categorias.add("Restaurante");
                }else{
                    categorias.remove("Restaurante");
                }
                break;
            case R.id.teatros:
                if(checked) {
                    categorias.add("Teatro");
                }else{
                    categorias.remove("Teatro");
                }
                break;
            case R.id.universidades:
                if(checked) {
                    categorias.add("Universidad");
                }else{
                    categorias.remove("Universidad");
                }
                break;
        }
        Toast.makeText(getApplicationContext(),"en el main" +categorias,Toast.LENGTH_SHORT).show();
    }

    public MainActivity() {
        this.categorias = new ArrayList<String>();
    }

    public void agregarMarcador1(String categoria){

        final AyudaBD ayudabd = new AyudaBD(getApplicationContext());
        SQLiteDatabase db = ayudabd.getWritableDatabase();

        switch(categoria){

            case "Aeropuerto":

                break;
        }
    }



}