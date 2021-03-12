package com.human.sqlite_sinseungman;

import android.provider.BaseColumns;

/**
 * Databasetables 클래스는 물리테이블과 DAO클래스와 데이터연동
 */
public class DatabaseTables {
    //
    public static class StudentTable implements BaseColumns{
        public static final String TABLE_NAME = "student";
        public static final String GRADE = "grade";
        public static final String NUMBER = "number";
        public static final String NAME = "name";

    }
}
