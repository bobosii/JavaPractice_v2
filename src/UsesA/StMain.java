package UsesA;

public class StMain {
    public static void main(String[] args) {
        Student st1 = new Student("Emirhan","Day","123","Yakacık",50);
        Student st2 = new Student("Hasan","Çelik","12345","Cevizli",50);
        Student st3 = new Student("Sevo","Fat","9831","Av",50);
        Instructor bedri = new Instructor("Bedri","Güneş","Sosyoloji");
        Student[] stu = {st1,st2,st3};

        //Composition, Aggregation
        //Course has a instructor. (Sınıfın bir öğretmeni vardır)
        Course mat = new Course("MAT101","MAT",bedri);

        System.out.println(mat.calculateAvg(stu));
        System.out.println(bedri);
    }
}
