package ryhma2.vauvasenranta.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import ryhma2.vauvasenranta.model.Ruoka;

import java.util.ArrayList;
import java.util.List;

public class RuokaDAO {
    private SQLiteDatabase db;

    public RuokaDAO(Context context){
        DBmanager databasesManager = new DBmanager(context);
        db = databasesManager.getWritableDatabase();
    }

    public long insert(Ruoka ruoat){
        ContentValues values = new ContentValues();
        values.put("RUOKALAJI",ruoat.getRuokaLaji());
        values.put("MAARA",ruoat.getMaitoMaara());
        values.put("MUISTIPANO",ruoat.getMuistiPano());
        values.put("AIKA",ruoat.getAika());
        return db.insert("RUOKA",null,values);
    }
    public List<Ruoka> getAlldata(){
        List<Ruoka> list = new ArrayList<>();
        String sql = "select * from RUOKA ";
        Cursor cursor = db.rawQuery(sql,null);
        while (cursor.moveToNext()){
            String laji = cursor.getString(cursor.getColumnIndex("RUOKALAJI"));
            int maitomaarat = cursor.getInt(cursor.getColumnIndex("MAARA"));
            String note = cursor.getString(cursor.getColumnIndex("MUISTIPANO"));
            String aika= cursor.getString(cursor.getColumnIndex("AIKA"));
            list.add(new Ruoka(laji,maitomaarat,note,aika));
        }
        return list;
    }
    public int delete(Ruoka ruoat){
        return db.delete("RUOKA","RUOKALAJI=?", new String[]{ruoat.getRuokaLaji()});
    }

}
