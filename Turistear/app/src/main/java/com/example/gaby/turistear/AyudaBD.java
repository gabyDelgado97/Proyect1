package com.example.gaby.turistear;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Gaby on 12/4/2017.
 */

public class AyudaBD extends SQLiteOpenHelper {

    public static abstract class DatosTabla implements BaseColumns {

        //Esto va a contener mi Tabla
        public static final String NOMBRE_TABLA = "Tabla";
        public static final String COLUMNA_LUGAR = "lugar";
        public static final String COLUMNA_NOMBRE = "nombre";
        public static final String COLUMNA_LAT = "latitud";
        public static final String COLUMNA_LONG = "longitud";

        //Define estas dos variables
        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA_SEP = ",";

        //Creando Tabla
        private static final String CREAR_TABLA_1 =
                "CREATE TABLE " + DatosTabla.NOMBRE_TABLA + " (" +
                        DatosTabla.COLUMNA_LUGAR + TEXT_TYPE + COMMA_SEP +
                        DatosTabla.COLUMNA_NOMBRE + " STRING PRIMARY KEY," +
                        DatosTabla.COLUMNA_LAT + TEXT_TYPE + COMMA_SEP +
                        DatosTabla.COLUMNA_LONG + TEXT_TYPE+
                        " )";

        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + DatosTabla.NOMBRE_TABLA;
    }

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MiBasedeDatos.db";

    public AyudaBD(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DatosTabla.CREAR_TABLA_1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DatosTabla.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
