package CollectionAndMapInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(340);
        liste.add(110);
        liste.add(20);
        liste.add(30);
        liste.add(null);

        for (Integer integer : liste) {
            System.out.println(integer);
        }

    }
}
