package InsuranceManagementSystem;

public class Address {
    private String country;
    private String city;
    private String neighborhood;
    private String street;
    private String type;

    public Address(String country, String city, String neighborhood, String street, String type) {
        this.country = country;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
