package InputAndOutput;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStream {
    // genellikle encryption işlemlerinde kullanılıyor.
    public static void main(String[] args) {
        String data = "Java102 Dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println("Çıktı : " + newData);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }



//    public static void main(String[] args) {
//        byte[] dizi = {1,2,3,54,66,6,12,3};
//        ByteArrayInputStream input = new ByteArrayInputStream(dizi,2,4);
//        System.out.println(input.read());
//        int i = input.read();
//        while (i != -1){
//            System.out.println(i);
//            i = input.read();
//        }
//        try {
//            input.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e.getMessage());
//        }
//    }
}
