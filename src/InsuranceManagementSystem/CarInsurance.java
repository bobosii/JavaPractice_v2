package InsuranceManagementSystem;

public class CarInsurance extends Insurance{
    public CarInsurance(int insurancePrice) {
        super("Araç Sigortası",insurancePrice);
    }

    @Override
    public void calculate() {
        this.setInsurancePrice(60*20);
    }
}
