package InputAndOutput;

import java.io.File;
import java.io.FileOutputStream;


public class FileOutput {
    public static void main(String[] args) {
        String yazi = "\nOutput stream ogreniyorum \n XD";
        try {
            File dosya = new File("src/InputAndOutput/Emir.txt");
            FileOutputStream output = new FileOutputStream(dosya,false); // eğer append true olarak ayarlanırsa içeride olanın yanına ekler
            // eğer false bırakırsak ki defaultu budur. Direk üzerine yazacaktır.
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
