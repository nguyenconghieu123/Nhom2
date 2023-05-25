/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlth.Scanner;

/**
 *
 * @author ADMIN
 */
public class qlth {
    private String Name;
    private int Age;
    Scanner sc=new Scanner(System.in);
    
    public qlth() {
    }
    
    public qlth(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    public void NhapThongTin()
    {
        System.out.println("Nhap Ten Hoc Sinh");
        Name=sc.nextLine();
        System.out.println("Nhap Tuoi Hoc Sinh");
        Age=sc.netInt();
    }

    @Override
    public String toString() {
        return " Name=" + Name + ", Age=" + Age + ' ';
    }
    
}

