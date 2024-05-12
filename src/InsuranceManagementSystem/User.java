package InsuranceManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private LocalDate lastLoginDate;
    private List<Address> addressList = new ArrayList<>();
    private List<Insurance> insuranceList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);

    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.lastLoginDate = LocalDate.now();
    }
    public User(){

    }
    public void start(){
        int choice;
        boolean isContinue = true;
        User newUser = null;
        Account account = null; // Account nesnesini dışarıda tanımlayın
        System.out.println("Sigorta yönetim sistemine hoş geldiniz");
        while (isContinue){
            menu();
            choice = inp.nextInt();
            switch (choice){
                case 1:
                    newUser = createUser();
                    account = new Account(newUser);
                    AccountManager accountManager = new AccountManager();
                    accountManager.addAccount(account);
                    System.out.println("Kullanıcı başarılı şekilde oluşturuldu");
                    break;
                case 2:
                    if (newUser == null){
                        System.out.println("Öncelikle kullanıcı oluşturmalısınız !!");
                    } else {

                        account.showInfo();
                    }
                    break;
                case 3:
                    if (account == null) {
                        System.out.println("Öncelikle giriş yapmalısınız !!");
                    } else {
                        try {
                            account.login();
                        } catch (InvalidAuthenticationException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    if (account != null && account.getAuthenticationStatus() == AuthenticationStatus.SUCCESS) {
                        System.out.println("Sigorta işlemleri !!");
                        insuranceMenu(account.getUser());
                    } else {
                        System.out.println("Sigorta işlemlerine erişebilmek için giriş yapmalısınız !!");
                    }
                    break;
                case 0:
                    System.out.println("Uygulamamıza tekrar bekleriz..");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Lütfen seçiminizi düzgün yapınız !!!");
                    break;
            }
        }
    }



    public void menu(){
        System.out.println("1- Kullanıcı oluştur");
        System.out.println("2- Kullanıcı bilgilerini göster");
        System.out.println("3- Giriş Yap");
        System.out.println("4- Sigorta işlemleri");
        System.out.println("0- Çıkış");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
    }
    public void insuranceMenu(User user){
        Insurance carInsurance = new CarInsurance(100);
        Insurance healthInsurance = new HealthInsurance(150);
        Insurance residenceInsurance = new ResidenceInsurance(200);
        Insurance travelInsurance = new TravelInsurance(250);
        insuranceList.add(carInsurance);
        insuranceList.add(healthInsurance);
        insuranceList.add(residenceInsurance);
        insuranceList.add(travelInsurance);

//        for (Insurance insurance: insuranceList){
//            int index = 0;
//            System.out.println(index++ +": " +insurance.getInsuranceName() + " " + insurance.getInsurancePrice());
//        }
        for (int i = 0; i<insuranceList.size();i++){
            System.out.println(i + "- " + insuranceList.get(i).getInsuranceName() + " " + insuranceList.get(i).getInsurancePrice() + " TL");
        }
        System.out.println("Hangi sigortayı yaptırmak istersiniz ?");
        int choice = inp.nextInt();
        switch (choice){
            case 0:
                System.out.println("Araç Sigortanız başarıyla tanımlanmıştır !!");
                break;
            case 1:
                System.out.println("Sağlık sigortanız başarıyla tanımlanmıştır !!");
                break;
            case 2:
                System.out.println("Konut sigortanız başarıyla tanımlanmıştır !!");
                break;
            case 3:
                System.out.println("Seyahat sigortanız başarıyla tanımlanmıştır !!");
                break;
            default:
                System.out.println("Lütfen doğru seçim yapınız !!!");
                break;
        }
    }

    public User createUser(){
        System.out.println("-------Kullanıcı Kayıt Oluşturma Ekranı----------");
        System.out.print("Adınızı giriniz : ");
        inp.nextLine();
        String name = inp.nextLine();
        System.out.print("Soy adınızı giriniz : ");
        String surname = inp.nextLine();
        System.out.print("Emailinizi giriniz : ");
        String email = inp.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        String password = inp.nextLine();
        System.out.print("İşinizi giriniz : ");
        String job = inp.nextLine();
        System.out.print("Yaşınızı giriniz : ");
        int age = Integer.parseInt(inp.nextLine());

        User newUser = new User(name, surname, email, password, job, age);

        System.out.println("-------LÜTFEN ADRES BİLGİLERİNİZİ GİRİNİZ-------");
        System.out.print("Yaşadığınız ili girin : ");
        String country = inp.nextLine();
        System.out.print("Yaşadığınız ilçeyi girin : ");
        String city = inp.nextLine();
        System.out.print("Yaşadığınız mahalleyi girin : ");
        String neighborhood = inp.nextLine();
        System.out.print("Yaşadığınız sokağı girin : ");
        String street = inp.nextLine();
        System.out.print("1- Ev adresi\n2- İş adresi : ");
        int choice = Integer.parseInt(inp.nextLine());
        String type = null;

        if (choice == 1){
            System.out.println("Ev adresiniz olarak ayarlanmıştır");
            type = "Ev adresi";
            Address newAddress = new HomeAddress(country, city, neighborhood, street, type);
            newUser.addAddress(newAddress);

        } else if (choice == 2){
            type = "İş adresi";
            Address newAddress = new BusinessAddress(country, city, neighborhood, street, type);
            newUser.addAddress(newAddress);

        } else {
            System.out.println("Lütfen seçiminizi 1 veya 2 şeklinde gerçekleştiriniz");
        }

        return newUser;
    }


    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
    public void addAddress(Address address){
        addressList.add(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
