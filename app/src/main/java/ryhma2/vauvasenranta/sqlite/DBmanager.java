package ryhma2.vauvasenranta.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Use build-in SqLiteOpenHelper class to store data with sqlite database
 * store data in different datatypes in database table(column and row)

 */


public class DBmanager extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "VAUVA_SENRANTA";

    public static final String TABLE_MAITO = "MAITO";
    public static final String TABLE_VAIPPA = "VAIPPA";
    public static final String TABLE_MITTAUS = "MITTAUS";
    public static final String TABLE_RUOKA = "RUOKA";

    public DBmanager(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String maito = "CREATE TABLE PUMPPUMAITO (" +
                "AIKA TEXT PRIMARY KEY," +
                "MAARA INTEGER," +
                "NOTE TEXT)";
        String ruoka = "CREATE TABLE RUOKA (" +
                "MAITOLAJI TEXT ," +
                "MAARA INTEGER ," +
                "AIKA TEXT PRIMARY KEY," +
                "MUISTIPANO TEXT) ";
        String vaippa = "CREATE TABLE VAIPPA (" +
                "VAIPPALAJI TEXT," +
                "NOTE TEXT," +
                "AIKA TEXT PRIMARY KEY)";
        String mittaus = "CREATE TABLE MITTAUS (" +
                "MITTAUSNOTE TEXT," +
                "PITUUS DOUBLE," +
                "AIKA TEXT  PRIMARY KEY," +
                "PAINO DOUBLE)";

        db.execSQL(maito);
        db.execSQL(ruoka);
        db.execSQL(vaippa);
        db.execSQL(mittaus);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_MITTAUS);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_MAITO);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_VAIPPA);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_RUOKA);

        onCreate(db);
    }
}
