package InsuranceManagementSystem;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName, int insurancePrice) {
        super("Seyahat Sigortası", insurancePrice);
    }

    @Override
    public void calculate() {
        this.setInsurancePrice(50*20);
    }
}
