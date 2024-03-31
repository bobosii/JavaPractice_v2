package Univercity;

public class Lecturer extends Instructor{
    private String doorNo;
    public Lecturer(String nameSurname,String phoneNumber,String email,String department,String title,String doorNo){
        super(nameSurname, phoneNumber, email, department, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
}
