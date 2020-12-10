package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        //Menu items
        MenuItems nasi = new MenuItems(1, "food", "Nasi", 3000);
        MenuItems ayamGoreng = new MenuItems(2, "food", "Ayam Goreng", 5000);
        MenuItems ayamBakar = new MenuItems(3, "food", "Ayam Bakar", 7000);
        MenuItems airPutih = new MenuItems(4, "drink", "Air Putih", 1000);

        //All menu array
        ArrayList<MenuItems> allItems = new ArrayList<>();
        allItems.addAll(Arrays.asList(nasi, ayamGoreng, ayamBakar, airPutih));

        //Packet items
        //All Packets
        ArrayList<ArrayList<MenuItems>> allPacket = new ArrayList<>();

        //Pack 1
        ArrayList<MenuItems> pack1 = new ArrayList<>();
        pack1.addAll(Arrays.asList(nasi, ayamGoreng, airPutih));
        allPacket.add(pack1);

        //Pack 2
        ArrayList<MenuItems> pack2 = new ArrayList<>();
        pack2.addAll(Arrays.asList(nasi, ayamBakar, airPutih));
        allPacket.add(pack2);

        //Init price
        int finalTotalPrice = 0;
        ArrayList<String> itemDetails = new ArrayList<>();

        //Scanner init
        Scanner scan = new Scanner(System.in);

        for (String index = "Y"; index.equals("Y") || index.equals("y"); ) {

            System.out.println("Select main menu please ...");
            System.out.println("All Menu : 1");
            System.out.println("Packet Menu : 2");

            System.out.print("Select menu : ");
            int inNomor = scan.nextInt();
            System.out.println("___________________________________________________________________");

            if (inNomor == 1) {
                for (String indexMenu = "Y"; indexMenu.equals("Y") || indexMenu.equals("y"); ) {
                    //Show menu
                    System.out.println("All Menu Items : ");
                    System.out.println("___________________________________________________________________");
                    for (MenuItems menu : allItems) {
                        System.out.println(menu.getId() + ". " + menu.getMenuName() + " " + menu.getPrice());
                    }
                    System.out.println("********************************************************************");
                    System.out.print("Select menu : ");
                    int menuNomor = scan.nextInt();

                    if (menuNomor > allItems.size()) {
                        System.out.println("Invalid menu!");
                    } else {
                        MenuItems selectedMenu = allItems.get(menuNomor - 1);
                        int selectedMenuPrice = selectedMenu.getPrice();
                        itemDetails.add(selectedMenu.getMenuName() + " " + selectedMenu.getPrice());
                        finalTotalPrice += selectedMenuPrice;
                    }

                    System.out.println("Temporary Price : " + finalTotalPrice);
                    System.out.println("Apakah anda mau menambah menu satuan? Y/N");
                    indexMenu = scan.next();
                }
            }

            if (inNomor == 2) {
                for (String indexMenu = "Y"; indexMenu.equals("Y") || indexMenu.equals("y"); ) {

                    System.out.println("Packet Items : ");
                    System.out.println("___________________________________________________________________");
                    int totalPricePacket = 0;
                    for (int i = 0; i < allPacket.size(); i++) {
                        System.out.print(i + 1 + ". ");
                        for (int j = 0; j < allPacket.get(i).size(); j++) {
                            String menuName = allPacket.get(i).get(j).getMenuName();
                            totalPricePacket += allPacket.get(i).get(j).getPrice();
                            System.out.print(menuName + ". ");
                        }
                        System.out.println(totalPricePacket);
                        totalPricePacket = 0;
                        System.out.println();
                    }

                    System.out.println("********************************************************************");
                    System.out.print("Select menu : ");
                    int menuNomor = scan.nextInt();

                    int countPricePacket = 0;
                    if (menuNomor > allPacket.size()) {
                        System.out.println("Invalid menu!");
                    } else {
                        ArrayList<MenuItems> selectedPacket = allPacket.get(menuNomor - 1);

                        for (MenuItems menu : selectedPacket) {
                            itemDetails.add(menu.getMenuName() + " " + menu.getPrice());
                            countPricePacket += menu.getPrice();
                        }

                    }
                    System.out.println("Diskon Paket : -2000");
                    itemDetails.add("Diskon Paket " + menuNomor + " : -2000");
                    finalTotalPrice += (countPricePacket - 2000);
                    System.out.println("Temporary Price : " + finalTotalPrice);
                    System.out.println("Apakah anda mau menambah menu paket? Y/N");
                    indexMenu = scan.next();
                }
            }

            System.out.println("Apakah anda mau melanjutkan pembelian? Y/N");
            index = scan.next();
        }
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar ");
        int ppn = (finalTotalPrice / 100) * 10;
        System.out.println("PPN (10%) : " + ppn);
        System.out.println("Total Rp." + (finalTotalPrice + ppn));
        System.out.println("--------------Item Details--------------");
        for (String item : itemDetails) {
            System.out.println(item);
        }
        System.out.println("Terimakasih atas kunjungannya.");
    }
}
