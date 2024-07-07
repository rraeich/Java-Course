import java.util.ArrayList;
import java.util.List;

public class ThreadHomework implements Runnable {

    public ArrayList<Integer> evenNumbers = new ArrayList<>();
    public ArrayList<Integer> oddNumbers = new ArrayList<>();

    static List<ArrayList> arrayLists = new ArrayList<>();

    public ThreadHomework() {
        for (int i = 0; i <= 3; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            arrayLists.add(list);
            for (int j = 1; j <= 2500; j++) {
                arrayLists.get(i).add(j + (i * 2500));
            }
        }
    }

    @Override
    public void run() {
        byte[] threadName = Thread.currentThread().getName().getBytes();
        int x = threadName[7] - 48;
        numberFinder(x);
    }

    public synchronized void numberFinder(int x) {
        for (int i = 0; i < 2500; i++) {
            if ((Integer) arrayLists.get(x).get(i) % 2 == 0) {
                evenNumbers.add((Integer) arrayLists.get(x).get(i));
            } else {
                oddNumbers.add((Integer) arrayLists.get(x).get(i));
            }
        }
    }
}
