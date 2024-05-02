package Store;

public class Notebook extends Product{
    private int id;
    private int nextId = 1;
    public Notebook(String name, Brand brand, int price, int discount, int stock, String screenSize, String ram) {
        super(name, brand, price, discount, stock, screenSize,ram);
        this.id = nextId;
        nextId++;
    }
    public String toString(){
        return  "ID : " + this.getId() +
                "Ürün adı : " + this.getName() +
                ", Fiyat : " + this.getPrice() +
                ", Marka : " + this.getBrand() +
                ", Ekran : " + this.getScreenSize() +
                ", Ram : " + this.getRam();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }
}
