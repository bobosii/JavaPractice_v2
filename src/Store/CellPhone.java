package Store;

public class CellPhone extends Product{
    private String color;
    private int batteryCapacity;


    public CellPhone(int id, String name, Brand brand, int price, int discount, int stock, String screenSize,String ram, String color, int batteryCapacity) {
        super(id, name, brand, price, discount, stock, screenSize, ram);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
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
}
