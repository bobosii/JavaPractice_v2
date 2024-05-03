package SerializationAndObjectStream;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW","320i");


        try {
            FileInputStream inputFile = new FileInputStream("src/SerializationAndObjectStream/araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            inputStream.close();
            inputFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }


//        try {
//            FileOutputStream outputFile = new FileOutputStream("src/SerializationAndObjectStream/araba.txt");
//            ObjectOutputStream output = new ObjectOutputStream(outputFile);
//            output.writeObject(bmw);
//            output.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e.getMessage());
//        }
    }
}
