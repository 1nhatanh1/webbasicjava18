package entity;

import java.util.Arrays;

public class SellerManagement {
    private Seller seller;
    private SellerManagementDetail[] sellerManagementDetails;
    private int totalItem;

    public SellerManagement(Seller seller, SellerManagementDetail[] sellerManagementDetails) {
        this.seller = seller;
        this.sellerManagementDetails = sellerManagementDetails;
        int tempTotal = 0;
        for (int i = 0; i < sellerManagementDetails.length; i++) {
            tempTotal += sellerManagementDetails[i].getQuantity();
        }
        this.totalItem = tempTotal;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public SellerManagementDetail[] getSellerManagementDetails() {
        return sellerManagementDetails;
    }

    public void setSellerManagementDetails(SellerManagementDetail[] sellerManagementDetails) {
        this.sellerManagementDetails = sellerManagementDetails;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    @Override
    public String toString() {
        return "SellerManagement{" +
                "seller=" + seller +
                ", sellerManagementDetails=" + Arrays.toString(sellerManagementDetails) +
                ", totalItem=" + totalItem +
                '}';
    }
}

