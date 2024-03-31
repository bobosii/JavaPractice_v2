package InterfaceExample;
import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price = inp.nextDouble();
        System.out.print("Kart numarası giriniz : ");
        String cardNumber = inp.next();
        System.out.print("Son kullanım tarihi giriniz : ");
        String expireDate = inp.next();
        System.out.print("Güvenlik kodu giriniz : ");
        String cvc = inp.next();

        System.out.println("1- A bankası");
        System.out.println("2- B bankası");
        System.out.println("3- C bankası");
        System.out.println("Banka seçiniz: ");

        int selectBank = inp.nextInt();

        switch (selectBank){
            case 1:
                ABank aPos = new ABank("A bankası","21312312321","1234123123");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,expireDate,cvc);
                break;
            case 2:
                BBank bPos = new BBank("B bankası","21312312321","1234123123");
                bPos.connect("127.3.3.3");
                bPos.payment(price,cardNumber,expireDate,cvc);
                break;
            case 3:
                CBank cPos = new CBank("C bankası","21312312321","1234123123");
                cPos.connect("127.3.3.3");
                cPos.payment(price,cardNumber,expireDate,cvc);
            default:
                System.out.println("Geçerli banka seçiniz");
        }
    }
}
