package CollectionAndMapInterface.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparable().reversed());
        students.add(new Student("Emirhan",20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Sevim",80));
        students.add(new Student("Dodo",50));

        for (Student stu: students){
            System.out.println(stu.getName());
        }
    }
}
