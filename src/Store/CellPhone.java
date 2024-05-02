package Store;

public class CellPhone extends Product{
    private int id;
    private static int nextId = 1;
    private String color;
    private int batteryCapacity;
    private String memory;


    public CellPhone(String name, Brand brand, int price, int discount, int stock, String screenSize,String ram, String color, int batteryCapacity,String memory) {
        super(name, brand, price, discount, stock, screenSize, ram);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.id = nextId;
        nextId++;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String toString(){
       return  "ID : " + this.getId() +
                ", Ürün adı : " + this.getName() +
                ", Fiyat : " + this.getPrice() +
                ", Marka : " + this.getBrand().getName() +
                ", Depolama " + this.getMemory() +
               ", Ekran : " + this.getScreenSize() +
               ", Pil : " + this.getBatteryCapacity() +
               ", Ram : " + this.getRam() +
               ", Renk : " + this.getColor();
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
