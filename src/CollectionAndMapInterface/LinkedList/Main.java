package CollectionAndMapInterface.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Emirhan");
        liste.add("Hasan");
        liste.add("Dodo");
        liste.add("Elf");

        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
