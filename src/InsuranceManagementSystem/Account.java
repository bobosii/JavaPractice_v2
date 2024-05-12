package InsuranceManagementSystem;

import java.util.List;
import java.util.Scanner;

public class Account {
    private User user;
    private Scanner inp = new Scanner(System.in);
    AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;


    public final void showInfo(){
        System.out.println("Adınız : " + user.getName() +
                ", Soy adınız : " + user.getSurname() +
                ", Emailiniz : " + user.getEmail() +
                ", Şifreniz : " + user.getPassword() +
                ", İşiniz : " + user.getJob() +
                ", Yaşınız : " + user.getAge());

        System.out.println("----Adres bilgileriniz-----");
        List<Address> addressList = user.getAddressList();
        if (addressList != null && !addressList.isEmpty()) {
            for (int i = 0; i < addressList.size(); i++) {
                System.out.println((i + 1) + ". Yaşadığınız İl :  " +
                        addressList.get(i).getCountry() +
                        ", Yaşadığınız ilçe : " + addressList.get(i).getCity() +
                        ", Yaşadığınız mahalle :" + addressList.get(i).getNeighborhood() +
                        ", Yaşadığınız sokak : " + addressList.get(i).getStreet()
                + ", Adres tipi : " + addressList.get(i).getType());
            }
        } else {
            System.out.println("Adres bilgileriniz bulunmamaktadır.");
        }
    }

    public void login() throws InvalidAuthenticationException {
        System.out.println("------GİRİŞ EKRANI-------");
        System.out.println("Lütfen kayıt olurken kullandığınız emailinizi girin : ");
        String loginMail = inp.nextLine();
        System.out.println("Lütfen şifrenizi girin : ");
        String loginPassword = inp.nextLine();
        System.out.println("İşleminiz kontrol ediliyor !!");
        if (user.getEmail().equals(loginMail) && user.getPassword().equals(loginPassword)){
            System.out.println("Hoş geldiniz " + user.getName() + " " + user.getSurname() + " !");
            System.out.println("Giriş işleminiz başarılı bir şekilde gerçekleşmiştir");
            setAuthenticationStatus(AuthenticationStatus.SUCCESS);
        }else {
            setAuthenticationStatus(AuthenticationStatus.FAIL);
            throw new InvalidAuthenticationException("Kullanıcı mailiniz veya şifreniz yanlış !!");
        }
    }
    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus){
        this.authenticationStatus = authenticationStatus;
    }
    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public Account(User user) {
        super();
        this.user = user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
