package restaurant;

public class MenuItems {

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
}
