package logic;

import entity.Seller;

import java.util.Scanner;

public class SellerLogic {
    private Seller[] sellers;
    private int totalSeller;

    public int getTotalSeller() {
        return totalSeller;
    }

    public SellerLogic(Seller[] sellers) {
        this.sellers = sellers;
    }

    public Seller[] getSellers() {
        return sellers;
    }

    public void addNewSeller() {
        System.out.print("Nhap so luong nguoi ban hang muon them moi: ");
        int sellerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < sellerNum; i++) {
            System.out.println("Nhap thong tin cho seller thu " + (i + 1));
            Seller seller = new Seller();
            seller.inputInfo();
            saveSeller(seller);
            System.out.println("----------------------");
        }
        totalSeller += sellerNum;
    }

    private void saveSeller(Seller r) {
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] == null) {
                sellers[i] = r;
                break;
            }
        }
    }

    public void showSeller() {
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] != null) {
                System.out.println(sellers[i]);
            }
        }
    }
    public Seller searchById(int id) {
        Seller ketQua = null;
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i] != null && sellers[i].getId() == id) {
                ketQua = sellers[i];
                break;
            }
        }
        return ketQua;
    }
}
