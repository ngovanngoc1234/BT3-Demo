package controller;

import model.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class AddShowSv {
    Scanner sc = new Scanner(System.in);
     static ArrayList<SinhVien> sinhViens = new ArrayList<>();

    public void add() {
        SinhVien sinhVien = new SinhVien();
        System.out.println("nhap ten sv");
        String name = sc.nextLine();
        sinhVien.setName(name);
        System.out.println("nhap ma sinh vien ");
        int msv = Integer.parseInt(sc.nextLine());
        sinhVien.setMvs(msv);
        System.out.println("nhap ngay sinh");
        String ngaysinh = sc.nextLine();
        sinhVien.setNgaysinh(ngaysinh);
        System.out.println("nhap ten lop hoc");
        String tenlop = sc.nextLine();
        sinhVien.setLop(tenlop);
        sinhViens.add(sinhVien);
    }

    public void show() {
        for (SinhVien sv : sinhViens) {
            System.out.println(sv.toString());
        }
    }
}
