package restaurant;

import java.util.ArrayList;

public class MenuItems implements PrintReceipt {

    private int id;

    private String menuCode;

    private String menuName;

    private int price;

    public MenuItems(int id, String menuCode, String menuName, int price) {
        this.id = id;
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.price = price;
    }

    public MenuItems() {
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuCode() {
        return menuCode;
    }

    @Override
    public void paymentReceipt(int finalTotalPrice, ArrayList<String> itemDetails) {
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar ");
        int ppn = (finalTotalPrice / 100) * 10;
        System.out.println("Total Order : Rp." + finalTotalPrice);
        System.out.println("PPN (10%) : Rp." + ppn);
        System.out.println("Total Bayar Rp." + (finalTotalPrice + ppn));
        System.out.println("--------------Item Details--------------");
        for (String item : itemDetails) {
            System.out.println(item);
        }
        System.out.println("Terimakasih atas kunjungannya.");
    }

    @Override
    public String toString() {
        return (this.getMenuName());
    }
}
