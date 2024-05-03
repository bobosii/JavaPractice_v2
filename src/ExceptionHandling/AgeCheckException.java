package ExceptionHandling;

public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
        System.out.println("Hata yakalandı");
    }
    @Override
    public String toString(){
        return "Bu AgeCheck sınıfına ait bir exceptiondur";
    }
}
