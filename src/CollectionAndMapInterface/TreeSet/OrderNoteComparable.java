package CollectionAndMapInterface.TreeSet;

import java.util.Comparator;

public class OrderNoteComparable implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNot() - o2.getNot();
    }
}
