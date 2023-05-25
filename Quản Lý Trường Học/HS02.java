/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlth.Scanner;

/**
 *
 * @author ADMIN
 */
public class HS02 extends qlth{
    private int Grade;
    
    public HS02(){
    }
    
    public HS02(int Grade, String Name, int Age){
        super(Name, Age);
        this.Grade = Grade;
    }

    public String getGrade() {
        switch(Grade)
        {
            case 1: return "HK1";
            case 2: return "HK2";
            default: return "Da Len Lop";
        }
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }
    public void NhapThongTin()
    {
        super.NhapThongTin();
        System.out.println("chon HK: (1-2)");
        Grade=sc.nextInt();
    }

    @Override
    public String toString() {
        return "HS02{"+super.toString() + "Grade=" + getGrade() + '}';
    }
    
}
