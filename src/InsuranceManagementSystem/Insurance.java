package InsuranceManagementSystem;

import java.time.LocalDate;
import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private int insurancePrice;
    private LocalDate startAndFinishDate;

    public Insurance(String insuranceName,int insurancePrice) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.startAndFinishDate = LocalDate.now();
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public int getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(int insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public LocalDate getStartAndFinishDate() {
        return startAndFinishDate;
    }

    public void setStartAndFinishDate(LocalDate startAndFinishDate) {
        this.startAndFinishDate = startAndFinishDate;
    }
    public abstract void calculate();
}
