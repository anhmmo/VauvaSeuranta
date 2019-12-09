package ryhma2.vauvasenranta.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import ryhma2.vauvasenranta.model.Mittaus;

import java.util.ArrayList;
import java.util.List;

public class MittausDAO {
    SQLiteDatabase db;


    public MittausDAO(Context context){
        DBmanager dBmanager = new DBmanager(context);
        db = dBmanager.getWritableDatabase();
    }
    public long insert(Mittaus tiedot){
        ContentValues values = new ContentValues();
        values.put("MITTAUSNOTE", tiedot.getMittausNote());
        values.put("PITUUS", tiedot.getPituus());
        values.put("PAINO", tiedot.getPaino());
        values.put("AIKA",tiedot.getAika());
        return db.insert("MITTAUS",null,values);
    }
    public List<Mittaus> getAlldata(){
        List<Mittaus> list = new ArrayList<>();
        String sql  = "select * from MITTAUS ";
        Cursor cursor = db.rawQuery(sql,null);
        while (cursor.moveToNext()){
            String note = cursor.getString(cursor.getColumnIndex("MITTAUSNOTE"));
            double pituus = cursor.getDouble(cursor.getColumnIndex("PITUUS"));
            double paino = cursor.getDouble(cursor.getColumnIndex("PAINO"));
            String aika= cursor.getString(cursor.getColumnIndex("AIKA"));
            list.add(new Mittaus(note,pituus,paino,aika));
        }
        return list;
    }
    public int delete(Mittaus mitat){
        return db.delete("MITTAUS","AIKA=?",new String[]{mitat.getAika()});
    }
}
