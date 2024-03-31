package Univercity;

public class Main {
    public static void main(String[] args) {
        Worker wr1 = new Worker("Emir DAY","05313124213","dad");
        wr1.enter();
        Instructor i1 = new Instructor("Patika Dev","05919421384213","ede","sosyoloji","Prof");
        i1.joinCourse();
        Officer of1 = new Officer("Emir say","1201231","dada.ada","IS","11-12");
        of1.work();
        Lecturer l1 = new Lecturer("Mamut Çetin","31313131","Assa.da","ENG","Prof","21");
        l1.enter();
        i1.enter();


    }
}
