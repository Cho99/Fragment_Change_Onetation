package com.example.fragmentchangeonetation;

import java.io.Serializable;

public class Student implements Serializable {
    private String Hoten;
    private  int NamSinh;
    private  String DiaChi;
    private  String Email;

    public Student(String hoten, int namSinh, String diaChi, String email) {
        Hoten = hoten;
        NamSinh = namSinh;
        DiaChi = diaChi;
        Email = email;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
