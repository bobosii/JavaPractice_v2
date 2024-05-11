package MultiThreadsAndConcurrency;

import java.util.List;

public class NumberPartitioner implements Runnable{
    private List<Integer> numbers;
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    @Override
    public void run() {
        for (Integer number : numbers){
            if (number % 2 == 0) {
                synchronized (number){
                    evenNumbers.add(number);
                }
            }
            else{
                synchronized (number){
                    oddNumbers.add(number);
                }
            }
        }
    }

    public NumberPartitioner(List<Integer> numbers, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.numbers = numbers;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public void setEvenNumbers(List<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public List<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(List<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }
}
