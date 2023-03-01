package entity;

import java.util.Scanner;

public class Seller extends Person{
    private int id;
    private String ngaykyhopdong;

    private static int AUTO_ID = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNgaykyhopdong() {
        return ngaykyhopdong;
    }

    public void setNgaykyhopdong(String ngaykyhopdong) {
        this.ngaykyhopdong = ngaykyhopdong;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", ngaykyhopdong='" + ngaykyhopdong + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        this.id=AUTO_ID;
        AUTO_ID++;
        System.out.println("Nhap ngay ky hop dong: ");
        this.ngaykyhopdong = new Scanner(System.in).nextLine();


    }
}
