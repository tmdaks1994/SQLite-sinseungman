package com.human.sqlite_sinseungman;

/*
StudentVO클래스는 xml과 DB와 메인엑티비티 Java와 데이터를 GET/SET하기 위해서
 */
public class StudentVO {
    //VO클래스의 멤버변수
    private int mId;
    private  int mGrade;
    private  int mNumber;
    private String mName;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
