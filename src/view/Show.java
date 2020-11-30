package view;

import controller.AddShowSv;
import controller.AddShowTm;

import java.util.Scanner;

public class Show {
    public static void main(String[] args) {
        AddShowSv controller = new AddShowSv();
        AddShowTm addShowTm = new AddShowTm();
        Scanner sc = new Scanner(System.in);
        int number = 6;
        do {
            System.out.println("chon chuc nang");
            System.out.println("1: them sv");
            System.out.println("2: hien thi");
            System.out.println("3: nhap ten sv de muon sach ");
            System.out.println("4: hien thi thon tin sv muon ");
            System.out.println("5: thoat");
            number = Integer.parseInt(sc.nextLine());

            switch (number) {
                case 1:
                    controller.add();
                    break;
                case 2:
                    controller.show();
                    break;
                case 3:
                    addShowTm.add();
                    break;
                case 4:
                    addShowTm.show();
                    break;
            }
        } while (number != 5);
    }
}
