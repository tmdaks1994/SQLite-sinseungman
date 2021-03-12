package com.human.sqlite_sinseungman;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/*
DB생성 및 테이블 생성을 처리
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    //
    private String CreateTableStudent = "Create table student(" +
            "id integer primary key" +
            ",grade INTEGER" +
            ",number INTEGER" +
            ",name TEXT" +
            ")";

    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreateTableStudent);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
