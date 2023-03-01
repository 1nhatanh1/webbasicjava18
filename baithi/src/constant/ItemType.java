package constant;

public enum ItemType {
    DIEN_TU("Dien tu"),
    DIEN_LANH("Dien lanh"),
    MAY_TINH("May tinh"),
    THIET_BI_VAN_PHONG("Thiet bi van phong");
    public String value;

    ItemType(String value) {
        this.value = value;
    }
}
