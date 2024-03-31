package Univercity;

public class Worker {
    private String nameSurname;
    private String phoneNumber;
    private String email;


    public Worker(String nameSurname, String phoneNumber, String email) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName() {
        return nameSurname;
    }

    public void setName(String name) {
        this.nameSurname = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // Metotlarda aşırı yüklenme (Overloading)
    public void enter(String shift){
        System.out.println(this.nameSurname + " " + shift + " Saatinde giriş yaptı");
    }
    public void enter(){
        System.out.println(this.nameSurname + " Üniversiteye giriş yaptı");
    }
    public void enter(String shift,String exitFromWork){
        System.out.println(this.nameSurname + " " + shift + " Saatinde giriş yaptı " + exitFromWork + " Saatine kadar çalışacak");
    }
    public void exit(){
        System.out.println(this.nameSurname + " Üniversiteden çıkış yaptı");
    }
    public void dininghall(){
        System.out.println(this.nameSurname + " Yemekhaneye girdi !");
    }



}
