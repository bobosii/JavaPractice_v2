package InsuranceManagementSystem;

import java.time.LocalDate;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String insuranceName, int insurancePrice) {
        super("Sağlık sigortası", insurancePrice);
    }

    @Override
    public void calculate() {
        setInsurancePrice(20*30);
    }
}
