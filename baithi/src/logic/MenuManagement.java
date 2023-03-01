package logic;

import entity.Item;
import entity.Seller;
import entity.SellerManagement;

import java.util.Scanner;

public class MenuManagement {

    private SellerLogic sellerLogic;
    private ItemLogic itemLogic;
    private SellerManagementLogic sellerManagementLogic;


    public MenuManagement() {
        Seller[] sellers = new Seller[1000];
        sellerLogic = new SellerLogic(sellers);
        Item[] items = new Item[1000];
        itemLogic=new ItemLogic(items);
        SellerManagement[] sellerManagements = new SellerManagement[1000];
        sellerManagementLogic = new SellerManagementLogic(sellerManagements, sellerLogic, itemLogic);




    }

    public void menu() {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    sellerLogic.addNewSeller();
                    break;
                case 2:
                    sellerLogic.showSeller();
                    break;
                case 3:
                    itemLogic.addNewItem();
                    break;
                case 4:
                    itemLogic.showItem();
                    break;
                case 5:
                    sellerManagementLogic.phanCongBaiViet();
                    break;
                case 6:
                    showMenuSort();
                    break;
                case 7:
                    sellerManagementLogic.tinhDoanhThu();
                    break;
                case 8:
                    return;
            }
        }
    }

    private void showMenuSort() {
        System.out.println("Chon chuc nang mong muon: ");
        System.out.println("1. Sap xep theo ten");
        System.out.println("2. Sap xep theo nhom mat hang");

        int choice = 0;
        System.out.print("Xin moi nhap lua chon: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice == 1 || choice == 2) {
                break;
            }
            System.out.print("Lua chon khong hop le , chon lai: ");
        } while (true);

        if (choice == 1) {
            sellerManagementLogic.sortBySellerName();
        } else {
            sellerManagementLogic.sortByItemNumber();
        }
    }


    private int chooseFunction() {

        int choice = 0;
        System.out.print("xin moi nhap lua chon: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 8) {
                break;
            }
            System.out.print("Ban chon sai roi, chon lai di: ");
        } while (true);
        return choice;

    }

    private void showMenu() {
        System.out.println("=============PHAN MEM QUAN LY BAN HANG============");
        System.out.println("1. Them danh sach nhan vien ban hang moi.");
        System.out.println("2. Hien thi danh sach nhan vien ban hang.");
        System.out.println("3. Them danh sach mat hang moi.");
        System.out.println("4. Hien thi danh sach mat hang.");
        System.out.println("5. Bang danh sach ban hang cua tung nhan vien");
        System.out.println("6. Sap xep bang danh sach ban hang");
        System.out.println("7. Doanh thu nhan vien");
        System.out.println("8. Thoat");
    }


}
