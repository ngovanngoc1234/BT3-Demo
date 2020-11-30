package controller;

import model.TheMuon;

import java.util.ArrayList;
import java.util.Scanner;

public class AddShowTm {
    Scanner sc = new Scanner(System.in);
     static ArrayList<TheMuon> theMuons = new ArrayList<>();

    public void add() {
        AddShowSv sv = new AddShowSv();
        String input = sc.nextLine();
        for (int i = 0; i < sv.sinhViens.size(); i++) {
            if (input.equals(sv.sinhViens.get(i).getName())) {
                TheMuon theMuon = new TheMuon();
                System.out.println("nhap phieu muon ");
                int phieumuon = Integer.parseInt(sc.nextLine());
                theMuon.setPhieumuon(phieumuon);
                System.out.println("ngay muon");
                int ngaymuon = Integer.parseInt(sc.nextLine());
                theMuon.setNgaymuon(ngaymuon);
                System.out.println("han tra");
                int ngaytra = Integer.parseInt(sc.nextLine());
                theMuon.setNgaytra(ngaytra);
                System.out.println("ten sach ");
                String tensach = sc.nextLine();
                theMuon.setSohieusach(tensach);
                theMuon.setSinhVien(sv.sinhViens.get(i));
                theMuons.add(theMuon);
            } else {
                System.out.println("b ko du dieu kien muon sach ");
            }
        }


    }

    public void show() {
        for (TheMuon t:theMuons) {
            System.out.println(t.toString());
        }
    }


}
