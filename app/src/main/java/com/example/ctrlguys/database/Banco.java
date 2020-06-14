package com.example.ctrlguys.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {
    public Banco(Context context) {
        super(context, "DADOS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScripSQL.getCreateTablePessoa());
        db.execSQL(ScripSQL.getCreateTableEmpresa());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
