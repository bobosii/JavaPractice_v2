package BufferedStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("src/InputAndOutput/Emir.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            int i = buffInput.read();
            while (i != -1){
                System.out.print((char) i);
                i = buffInput.read();
            }
            fileInput.close();
            buffInput.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
