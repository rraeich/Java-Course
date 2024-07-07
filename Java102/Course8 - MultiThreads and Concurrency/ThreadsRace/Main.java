import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        ThreadHomework threadProcess = new ThreadHomework();

        for (int i = 0; i <= 3; i++) {
            Thread t = new Thread(threadProcess);
            threads.add(t);
        }

        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();

        for (int i = 0; i < 5; i++){
            System.out.println("Time left for writing the lists: " + (5 - i));
            Thread.sleep(1000L);
        }
        System.out.println();

        System.out.println("Even List Length: " + threadProcess.evenNumbers.size() + " / " + "Even numbers: " + threadProcess.evenNumbers);
        System.out.println("Odd List Length: " + threadProcess.oddNumbers.size() + " / " + "Odd numbers: " + threadProcess.oddNumbers);
    }
}
