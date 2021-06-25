import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class DemoCallable {
    static ExecutorService threadPool = Executors.newFixedThreadPool(100);
    public static void main(String args[]){
        findSumWithException(5);
    }
    public static void findSumWithException(int n){
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for(int i =0;i<n;i++) {
                    sum += i;
                }
                return sum;
            }
        };

        Future<Integer> f = threadPool.submit(callable);
        try {
            f.get();
        }catch(Exception e){

        }
    }

}
