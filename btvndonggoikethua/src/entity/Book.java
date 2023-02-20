package entity;

import constant.BookType;
import constant.ReaderType;

import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private BookType bookType;
    private int publishedYear;
    private static int AUTO_ID = 10000;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookType=" + bookType +
                ", publishedYear=" + publishedYear +
                '}';
    }
    public void inputInfoBook(){
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên sách: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập tác giả: ");
        this.author = new Scanner(System.in).nextLine();
        System.out.println("Nhập loại sách: ");
        System.out.println("1. Công nghệ thông tin.");
        System.out.println("2. Điện tử viễn thông.");
        System.out.println("3. Khoa học tự nhiên.");
        System.out.println("4. Văn học nghệ thuật.");
        System.out.println("Chọn.");
        int temp;
        do {
            temp = new Scanner(System.in).nextInt();
            if(temp >=1 && temp <=4){
                break;
            }
            System.out.print("Giá trị không hợp lệ, vui lòng nhập lại:  ");
        } while (true);
        switch (temp) {
            case 1:
                this.bookType = BookType.CNTT;
                break;
            case 2:
                this.bookType = BookType.DTVT;
                break;
            case 3:
                this.bookType = BookType.KHTN;
                break;
            case 4:
                this.bookType = BookType.VHNT;
                break;
        }
        System.out.print("Nhập năm xuất bản: ");
        this.publishedYear = new Scanner(System.in).nextInt();
    }





}
