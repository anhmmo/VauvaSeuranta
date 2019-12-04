package ryhma2.vauvasenranta.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import ryhma2.vauvasenranta.model.MaitoPumppu;

import java.util.ArrayList;
import java.util.List;

public class MaitoDAO {
    private SQLiteDatabase db;


    public MaitoDAO(Context context){
        DBmanager dBmanager = new DBmanager(context);
        db = dBmanager.getWritableDatabase();
    }
    public long insert(MaitoPumppu maitoa){
        ContentValues values = new ContentValues();
        values.put("MAITOLAJI",maitoa.getMaitoNimet());
        values.put("MAARA",maitoa.getMaitoMaara());
        values.put("NOTE",maitoa.getMaitoNote());
        return db.insert("PUMPPUMAITO",null,values);
    }
    public List<MaitoPumppu> getAlldata(){
        List<MaitoPumppu> list = new ArrayList<>();
        String sql = "select * from PUMPPUMAITO";
        Cursor cursor = db.rawQuery(sql,null);
        while (cursor.moveToNext()){
            String nimi = cursor.getString(cursor.getColumnIndex("MAITOLAJI"));
            int maara = cursor.getInt(cursor.getColumnIndex("MAARA"));
            String note = cursor.getString(cursor.getColumnIndex("NOTE"));
            list.add(new MaitoPumppu(nimi,maara,note));
        }
        return list;
    }
    public int delete(MaitoPumppu maitoa){
        return db.delete("PUMPPUMAITO","MAITOLAJI=?",new String[]{maitoa.getMaitoNimet()});
    }


}
