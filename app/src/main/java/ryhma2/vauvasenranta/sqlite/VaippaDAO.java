package ryhma2.vauvasenranta.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import ryhma2.vauvasenranta.model.Vaippa;

import java.util.ArrayList;
import java.util.List;


/**
 * create new table to store data for VaippaActivity
 * Insert,Update, delete data.
 */
public class VaippaDAO {
    private SQLiteDatabase db;

    public VaippaDAO(Context context){
        DBmanager dBmanager = new DBmanager(context);
        db = dBmanager.getWritableDatabase();
    }
    public long insert(Vaippa vaihto){
        ContentValues values = new ContentValues();
        values.put("VAIPPALAJI", vaihto.getmVaippaLaji());
        values.put("NOTE",vaihto.getmMuistinpano());
        values.put("AIKA",vaihto.getmAika());
        return db.insert("VAIPPA",null,values);
    }
    public List<Vaippa> getAlldata(){
        List<Vaippa> list = new ArrayList<>();
        String sql = "select * from VAIPPA ";
        Cursor cursor = db.rawQuery(sql,null);
        while (cursor.moveToNext()){
            String vaipanlaji = cursor.getString(cursor.getColumnIndex("VAIPPALAJI"));
            String note = cursor.getString(cursor.getColumnIndex("NOTE"));
            String aika = cursor.getString(cursor.getColumnIndex("AIKA"));
            list.add(new Vaippa(vaipanlaji,note,aika));
        }
        return list;
    }
    public int delete(Vaippa vaihto){
        return db.delete("VAIPPA","AIKA=?",new String[]{vaihto.getmAika()});
    }

}
