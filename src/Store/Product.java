package Store;

public class Product {
    private int id;
    private String name;
    private Brand brand;
    private int price;
    private int discount;
    private int stock;
    private String screenSize;
    private String ram;

    public Product(int id, String name, Brand brand, int price, int discount, int stock, String screenSize, String ram) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.screenSize = screenSize;
        this.ram = ram;
    }

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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}