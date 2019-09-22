package com.example.bai02;

public class CauThu {
    private String name;
    private String year;
    private int hinh1;
    private int hinh2;

    public CauThu(String name, String year, int hinh1, int hinh2) {
        this.name = name;
        this.year = year;
        this.hinh1 = hinh1;
        this.hinh2 = hinh2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getHinh1() {
        return hinh1;
    }

    public void setHinh1(int hinh1) {
        this.hinh1 = hinh1;
    }

    public int getHinh2() {
        return hinh2;
    }

    public void setHinh2(int hinh2) {
        this.hinh2 = hinh2;
    }
}
