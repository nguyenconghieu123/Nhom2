/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlth.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        HS01 hs01=new HS01();
        HS02 hs02=new HS02();
        HS03 hs03=new HS03();
        qlth sc=new qlth(System.in);
        int choice;
        
        while (true) {
            System.out.println("1. Nhap Thong Tin HS Lop 10");
            System.out.println("2. Nhap Thong Tin HS Lop 11");
            System.out.println("3. Nhap Thong Tin HS Lop 12");
            System.out.println("4. Xuat Thong Tin HS");
            System.out.println("Chon Chuc Nang");
            choice=sc.nexInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Nhap Thong Tin HS");
                    hs01.NhapThongTin();
                    break;
                case 2:
                    System.out.println("Nhap Thong Tin HS");
                    hs02.NhapThongTin();
                    break;
                case 3:
                    System.out.println("Nhap Thong Tin HS");
                    hs03.NhapThongTin();
                    break;
                case 4:
                    System.out.println("Thong Tin HS");
                    System.out.println(hs01.toString());
                    System.out.println(hs02.toString());
                    System.out.println(hs03.toString());
                    break;
            }
        }
    }
}
