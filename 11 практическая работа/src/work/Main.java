package work;
import java.util.ArrayList;
public class Main {


    static int sum;
    public static void main(String[] args) throws InterruptedException {

    long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int h = i;
            Thread thread = new Thread(()->work(h));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
           System.out.println(t.getState());
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(sum);

    }
    private  static  void work (int i){
        long startTime = System.currentTimeMillis();
      long result =mathOperation(i*1000, 100_000_000 );
        long endTime = System.currentTimeMillis();
        System.out.println(i+": |"+(endTime-startTime)+"|"+result);
    }

    private  synchronized static long mathOperation(int count,int k){
        long a = 0;
        for (int i = 0; i < k; i++) {
            a += (count + i) * Math.sqrt(Math.sqrt(count + i))-Math.sqrt(count+i);
            sum++;
        }
        return a;
    }
}
