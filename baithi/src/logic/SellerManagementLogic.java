package logic;

import entity.Item;
import entity.Seller;
import entity.SellerManagement;
import entity.SellerManagementDetail;

import java.util.Scanner;

public class SellerManagementLogic {
    private SellerManagement[] sellerManagements;

    private SellerLogic sellerLogic;
    private ItemLogic itemLogic;

    public SellerManagementLogic(SellerManagement[] sellerManagements,
                                 SellerLogic sellerLogic,
                                 ItemLogic itemLogic) {
        this.sellerManagements = sellerManagements;
        this.sellerLogic = sellerLogic;
        this.itemLogic = itemLogic;
    }

    public void phanCongBaiViet() {
        if (!coDuLieuHayChua()) {
            System.out.println("Chua co thong tin nhan vien va mat hang , vui long nhap truoc : ");
            return;
        }

        System.out.print("Ban muon lap bang tinh doanh thu cho bao nhieu nhan vien: ");
        int soLuongSeller;
        do {
            soLuongSeller = new Scanner(System.in).nextInt();
            if (soLuongSeller > 0 && soLuongSeller <= sellerLogic.getTotalSeller()) {
                break;
            }
            System.out.println("So luong nguoi ban hang phai lon > 0 va trong vung nhan vien ban hang");
        } while (true);
        for (int i = 0; i < soLuongSeller; i++) {
            System.out.print("Nhan vien thu " + (i + 1) + " muon lap bang tinh doanh thu la nhan vien co id: ");
            Seller seller = nhapSeller();

            System.out.print("Ban muon lap doanh thu cho bao nhieu mat hang: ");
            int soMatHang;
            do {
                soMatHang = new Scanner(System.in).nextInt();
                if (soMatHang >= 1 && soMatHang <= 5 && soMatHang <= itemLogic.getTotalItem()) {
                    break;
                }
                System.out.print("so mat hang cua 1 nguoi toi da la bang so du lieu da nhap , max 5 , va phai >0 , ");
            } while (true);


            SellerManagementDetail[] danhSachMatHang = nhapDanhSachMatHang(soMatHang);

            SellerManagement phanCong = new SellerManagement(seller, danhSachMatHang);
            saveSellerManagement(phanCong);
        }

        showSellerManagement();
    }

    private void showSellerManagement() {
        for (int i = 0; i < sellerManagements.length; i++) {
            if (sellerManagements[i] != null) {
                System.out.println(sellerManagements[i]);
            }
        }
    }

    private SellerManagementDetail[] nhapDanhSachMatHang(int soLoaiMatHang) {
        SellerManagementDetail[] danhSachLoaiMatHang = new SellerManagementDetail[soLoaiMatHang];
        for (int i = 0; i < soLoaiMatHang; i++) {
            System.out.print("nhap thong tin cho loai mat hang thu " + (i + 1) + ", nhap ID loai mat hang: ");

            int idLoaiMatHang;
            Item loaiMatHang;

            do {
                idLoaiMatHang = new Scanner(System.in).nextInt();
                loaiMatHang = itemLogic.searchById(idLoaiMatHang);
                if (loaiMatHang != null) {
                    break;
                }
                System.out.print("Khong tim thay loai mat hang co ma " + idLoaiMatHang + ", nhap lai: ");
            } while (true);

            System.out.print("Da ban duoc bao nhieu mat hang loai nay: ");
            int soLuongMatHangCuaLoaiNay = new Scanner(System.in).nextInt();

            SellerManagementDetail detail = new SellerManagementDetail(loaiMatHang, soLuongMatHangCuaLoaiNay);
            saveLoaiMatHangChiTiet(detail, danhSachLoaiMatHang);
        }
        return danhSachLoaiMatHang;
    }

    private Seller nhapSeller() {
        int idSeller;
        Seller seller;
        // tìm kiếm xem phóng viên này có trong hệ thống tòa soạn của mình không

        do {
            idSeller = new Scanner(System.in).nextInt();
            seller = sellerLogic.searchById(idSeller);
            if (seller != null) {
                break;
            }
            System.out.print("Khong tim thay nhan vien co ma " + idSeller+ ", vui long nhap lai: ");
        } while (true);
        return seller;
    }

    private void saveSellerManagement(SellerManagement phanCong) {
        for (int i = 0; i < sellerManagements.length; i++) {
            if (sellerManagements[i] == null) {
                sellerManagements[i] = phanCong;
                break;
            }
        }
    }

    private void saveLoaiMatHangChiTiet(SellerManagementDetail detail, SellerManagementDetail[] danhSachLoaiMatHang) {
        for (int i = 0; i < danhSachLoaiMatHang.length; i++) {
            if (danhSachLoaiMatHang[i] == null) {
                danhSachLoaiMatHang[i] = detail;
                break;
            }
        }
    }
    private boolean coDuLieuHayChua() {
        boolean coDuLieuSeller = false;
        for (int i = 0; i < sellerLogic.getSellers().length; i++) {
            if (sellerLogic.getSellers()[i] != null) {
                coDuLieuSeller = true;
                break;
            }
        }

        boolean coDuLieuItem = false;
        for (int i = 0; i < itemLogic.getItems().length; i++) {
            if (itemLogic.getItems()[i] != null) {
                coDuLieuItem = true;
                break;
            }
        }

        return coDuLieuSeller && coDuLieuItem;
    }
    public void sortBySellerName() {
        if (!coDuLieuHayChua()) {
            System.out.println("Chua co thong tin , vui long nhap nhan vien va mat hang truoc");
            return;
        }
        for (int i = 0; i < sellerManagements.length - 1; i++) {
            if (sellerManagements[i] == null) {
                continue;
            }
            for (int j = i + 1; j < sellerManagements.length; j++) {
                if (sellerManagements[j] == null) {
                    continue;
                }
                if (sellerManagements[i].getSeller().getName().trim().compareToIgnoreCase(sellerManagements[j].getSeller().getName().trim()) > 0) {
                    SellerManagement temp = sellerManagements[i];
                    sellerManagements[i] = sellerManagements[j];
                    sellerManagements[j] = temp;
                }
            }
        }
        showSellerManagement();
    }

    public void sortByItemNumber() {
        if (!coDuLieuHayChua()) {
            System.out.println("Chua co thong tin , vui long nhap nhan vien va mat hang truoc");
            return;
        }
        for (int i = 0; i < sellerManagements.length - 1; i++) {
            if (sellerManagements[i] == null) {
                continue;
            }
            for (int j = i + 1; j < sellerManagements.length; j++) {
                if (sellerManagements[j] == null) {
                    continue;
                }
                if (sellerManagements[i].getTotalItem() < sellerManagements[j].getTotalItem()) {
                    SellerManagement temp = sellerManagements[i];
                    sellerManagements[i] = sellerManagements[j];
                    sellerManagements[j] = temp;
                }
            }
        }
        showSellerManagement();
    }

    public void tinhDoanhThu() {
        if (!coDuLieuHayChua()) {
            System.out.println("Chua co thong tin , vui long nhap nhan vien va mat hang truoc");
            return;
        }
        for (int i = 0; i < sellerManagements.length; i++) {
            double tongDoanhThu = 0;
            SellerManagement baoCaoMatHang = sellerManagements[i];
            SellerManagementDetail[] danhSachMatHang = baoCaoMatHang.getSellerManagementDetails();
            for (int j = 0; j < danhSachMatHang.length; j++) {
                tongDoanhThu += danhSachMatHang[j].getItem().getPrice() * danhSachMatHang[j].getQuantity();
            }
            System.out.println("Tong doanh thu " + sellerManagements[i].getSeller().getName() + " la " + tongDoanhThu);
        }
    }

}
