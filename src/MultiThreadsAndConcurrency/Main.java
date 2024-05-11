package MultiThreadsAndConcurrency;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        List<Thread> threads = new ArrayList<>();

        int chunkSize = numbers.size() / 4;
        for (int i = 0; i < 4; i++) {
            List<Integer> chunk = numbers.subList(i * chunkSize, (i + 1) * chunkSize);
            Thread thread = new Thread(new NumberPartitioner(chunk, evenNumbers, oddNumbers));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

    }


}
//    public static void main(String[] args) {
////        Counter c1 = new Counter();
////        Counter c2 = new Counter();
//
////        CounterWithRunnable c1 = new CounterWithRunnable("c1");
////        CounterWithRunnable c2 = new CounterWithRunnable("c2");
////        CounterWithRunnable c3 = new CounterWithRunnable("c3");
////        Thread t1 = new Thread(c1);
////        Thread t2 = new Thread(c2);
////        Thread t3 = new Thread(c3);
////        t1.start();
////        t2.start();
////        t3.start();
//
//    }
