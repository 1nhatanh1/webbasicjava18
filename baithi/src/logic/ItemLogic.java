package logic;

import entity.Item;

import java.util.Scanner;

public class ItemLogic {
    private Item[] items;
    private int totalItem;

    public int getTotalItem() {
        return totalItem;
    }

    public ItemLogic(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void addNewItem() {
        System.out.print("Nhap so luong mat hang muon them moi: ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap thong tin cho mat hang thu" + (i + 1));
            Item item = new Item();
            item.inputInfo();
            saveItem(item);
            System.out.println("----------------------");
        }
        totalItem += num;
    }

    private void saveItem(Item t) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = t;
                break;
            }
        }
    }

    public void showItem() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            }
        }
    }

    public Item searchById(int id) {
        Item ketQua = null;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId() == id) {
                ketQua = items[i];
                break;
            }
        }
        return ketQua;
    }

}
