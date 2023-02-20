package constant;

public enum BookType {
    KHTN("Khoa học tự nhiên"),
    VHNT("Văn học nghệ thuật"),
    DTVT("Điện tử viễn thông"),
    CNTT("Công nghệ thông tin");
    public String value;

    BookType(String value) {
        this.value = value;
    }
}
