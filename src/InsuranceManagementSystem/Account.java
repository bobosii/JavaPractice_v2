package InsuranceManagementSystem;

import java.util.List;

public class Account {
    private User user;

    public void showInfo(){
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
