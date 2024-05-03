package ExceptionHandling;

public class Main {
    public static void checkAge(int age) throws AgeCheckException{
        if (age<18){
            throw new AgeCheckException("Yaş hatası alındı");
        }
        System.out.println("Yaşınız uygundur");
    }


    public static void main(String[] args) throws AgeCheckException {

        int age = 15 ;
        try {
            checkAge(age);
        }catch (AgeCheckException e){
            System.out.println(e.toString());
        }
        System.out.println("Program bitti");

//        System.out.println("Program başladı");
//        int a = 0;
//        int b = 20;
//        try {
//            System.out.println("bölme işlemi");
//            System.out.println(b/a);
//            System.out.println("Bölme işlemi bitti");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("0 ile bölüm yapılamaz !");
//        }
//        System.out.println("Program bitti");
    }
}
