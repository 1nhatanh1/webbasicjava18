package entity;

import constant.ItemType;

import java.util.Scanner;

public class Item implements Inputable {
    private int id;
    private String nameItem;
    private ItemType itemType;
    private double price;
    private int quantity;
    private static int AUTO_ID = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nameItem='" + nameItem + '\'' +
                ", itemType=" + itemType +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.println("Nhap ten mat hang: ");
        this.nameItem = new Scanner(System.in).nextLine();
        System.out.println("Nhap loai mat hang la 1 trong cac mat hang duoi day");
        System.out.println("1. Dien tu");
        System.out.println("2. Dien lanh");
        System.out.println("3. May tinh");
        System.out.println("4. Thiet bi van phong");
        System.out.print("Xin moi chon: ");

        int temp = 0;
        System.out.print("Xin moi chon: ");
        do {
            temp = new Scanner(System.in).nextInt();
            if (temp >= 1 && temp <= 4) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);

        switch (temp) {
            case 1:
                this.itemType = ItemType.DIEN_TU;
                break;
            case 2:
                this.itemType = ItemType.DIEN_LANH;
                break;
            case 3:
                this.itemType = ItemType.MAY_TINH;
                break;
            case 4:
                this.itemType = ItemType.THIET_BI_VAN_PHONG;
                break;
        }
        System.out.println("Gia tien: ");
        this.price = new Scanner(System.in).nextDouble();
        System.out.println("So luong: ");
        this.quantity = new Scanner(System.in).nextInt();
    }
}