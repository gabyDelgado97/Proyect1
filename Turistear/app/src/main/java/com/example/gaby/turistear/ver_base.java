package com.example.gaby.turistear;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ver_base extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_base);
        cargar();
    }

    public void cargar(){
        final AyudaBD ayudabd = new AyudaBD(getApplicationContext());
        SQLiteDatabase db = ayudabd.getWritableDatabase();
        if(db!=null){
            Cursor c = db.rawQuery("select * from tabla",null);
            int cantidad =c.getCount();
            Toast.makeText(getApplicationContext(), "hay "+cantidad, Toast.LENGTH_LONG).show();
            String[] arreglo = new String[cantidad];
            int i=0;
            if(c.moveToFirst()){
                do{
                    String linea = i+". Lugar: "+c.getString(0)+", Nombre: "+c.getString(1)+", Latitud: "+c.getString(2)+", Longitud: "+c.getString(3);
                    arreglo[i]=linea;
                    i++;
                }while(c.moveToNext());
            }
            ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
            ListView lista = (ListView) findViewById(R.id.Lista);
            lista.setAdapter(adapter);
        }
    }
}
