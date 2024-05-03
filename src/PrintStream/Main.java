package PrintStream;


import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("src/PrintStream/print.txt");
            output.print(1234);
            output.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
