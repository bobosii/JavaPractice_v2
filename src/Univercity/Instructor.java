package Univercity;

public class Instructor extends Worker{

    private String department;
    private String title;


    public Instructor(String nameSurname,String phoneNumber,String email,String department,String title){
        super(nameSurname,phoneNumber,email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void joinCourse(){
        System.out.println(this.getName() + " Derse girdi");
    }
    @Override
    public void enter(){
        System.out.println(this.getName() + " akademisyeni A kapısından giriş yaptı");
    }
}
