package Univercity;

public class Officer extends Worker{
    private String department;
    private String shift;
    public Officer(String nameSurname,String phoneNumber,String email,String department, String shift){
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public void work(){
        System.out.println(this.getName() + " Çalışmaya başladı.");
    }
}
