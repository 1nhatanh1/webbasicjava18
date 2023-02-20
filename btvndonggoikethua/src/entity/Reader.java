package entity;

import constant.ReaderType;

import java.util.Scanner;

public class Reader extends Person {
    private int readerID;
    private ReaderType readerType;

    private static int AUTO_ID = 10000;

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public ReaderType getReaderType() {
        return readerType;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        this.readerID = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập loại bạn đọc: ");
        System.out.println("1. Sinh viên.");
        System.out.println("2. Học viên cao học.");
        System.out.println("3. Giảng viên.");
        System.out.println("Chọn.");
        int temp;
        do {
            temp = new Scanner(System.in).nextInt();
            if(temp >=1 && temp <=3){
                break;
            }
            System.out.print("Giá trị không hợp lệ, vui lòng nhập lại:  ");
        } while (true);
        switch (temp) {
            case 1:
                this.readerType = ReaderType.STUDENT;
                break;
            case 2:
                this.readerType = ReaderType.POST_STUDENT;
                break;
            case 3:
                this.readerType = ReaderType.TEACHER;
                break;
        }
    }
}
