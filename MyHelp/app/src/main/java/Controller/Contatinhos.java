package Controller;

import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import DB.DataBase;


public class Contatinhos {

    private SQLiteDatabase db;
    private DbHelper helper;

    public Contatinhos(Context context){
        helper = new DbHelper(context);
    }
}
