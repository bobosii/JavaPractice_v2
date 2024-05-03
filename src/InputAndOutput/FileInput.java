package InputAndOutput;

import java.io.File;
import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args) {
        File dosya = new File("src/InputandOutput/Emir.txt");

        try {
            System.out.println(dosya.createNewFile());
            FileInputStream input = new FileInputStream("src/InputandOutput/Emir.txt");
            int i = input.read();
            System.out.println(input.available() + " Byte dizisi mevcut");
            while (i != -1){
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //System.out.println(dosya.mkdirs()); dosya oluşturmak için kullandım "S" in sebebi pathde 1 den fazla path belirtmiş olmam

    }
}
