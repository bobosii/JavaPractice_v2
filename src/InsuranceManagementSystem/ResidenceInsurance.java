package InsuranceManagementSystem;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(int insurancePrice) {
        super("Konut sigortası",insurancePrice);
    }

    @Override
    public void calculate() {
        this.setInsurancePrice(40*20);
    }
}
