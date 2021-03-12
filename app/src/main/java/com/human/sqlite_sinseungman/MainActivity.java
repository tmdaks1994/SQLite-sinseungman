package com.human.sqlite_sinseungman;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.human.sqlite_sinseungman.DatabaseTables.StudentTable;

public class MainActivity extends AppCompatActivity {
    //현재클래스에서 생성할 멤버 변수 생성
    private DatabaseHelper mDatabaseHelper;
    private SQLiteDatabase mSqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabaseHelper = new DatabaseHelper(this,"school.db",null,1);
        mSqLiteDatabase = mDatabaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(StudentTable.GRADE, 2);
        contentValues.put(StudentTable.NUMBER,20210002);
        contentValues.put(StudentTable.NAME,"홍길동");
        mSqLiteDatabase.insert(StudentTable.TABLE_NAME,null,contentValues);
    }
}