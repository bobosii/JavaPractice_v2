package InsuranceManagementSystem;

import java.time.LocalDate;

public class HealthInsurance extends Insurance{
    public HealthInsurance(int insurancePrice) {
        super("Sağlık sigortası",insurancePrice);
    }

    @Override
    public void calculate() {
        this.setInsurancePrice(20*30);
    }
}
