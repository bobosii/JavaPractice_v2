package Store;

public class Notebook extends Product{
    public Notebook(String name, Brand brand, int price, int discount, int stock, String screenSize, String ram) {
        super(name, brand, price, discount, stock, screenSize,ram);
    }
    public String toString(){
        return  "ID : " + this.getId() +
                "Ürün adı : " + this.getName() +
                ", Fiyat : " + this.getPrice() +
                ", Marka : " + this.getBrand() +
                ", Ekran : " + this.getScreenSize() +
                ", Ram : " + this.getRam();
    }
}
