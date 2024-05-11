package MultiThreadsAndConcurrency;

public class CounterWithRunnable implements Runnable{

    private String name;

    @Override
    public void run() {
        System.out.println(this.getName() + " : Sayacı başladı");
        for (int i = 0; i<= 100; i++) {
            System.out.println(this.getName() + " : " + i);
        }
    }

    public CounterWithRunnable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
