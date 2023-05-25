/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlth.Scanner;

/**
 *
 * @author ADMIN
 */
public class HS03 extends qlth{
    private int Grade;
    
    public HS03() {
    }
    public HS03(int Grade, String Name, int Age) {
        super(Name, Age);
        this.Grade = Grade;
    }

    public String getGrade() {
        switch(Grade)
        {
            case 1: return "HK 1";
            case 2: return "Hk 2";
            default: return "Da Top Nghiep THPT";
        }
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }
    public void NhapThongTin();
    {
        super.NhapThongTin();
        System.out.println("Chon HK: (1-2)");
        Grade=sc.nextInt();
    }

    @Override
    public String toString() {
        return "HS03{"+super.toString() + "Grade=" + getGrade() + '}';
    }
    
}

