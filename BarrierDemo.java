public class BarrierDemo {
    public static void main(String args) throws InterruptedException {
        Barrier.runTest();
    }

}
class Barrier {
    int count = 0;
    int totalthreads =0;
    public Barrier( int totthreads){
        totalthreads = totthreads;
    }
    public synchronized void await() throws InterruptedException {
        count++;
        if(count == totalthreads){
            notifyAll();
            count = 0;
        } else
            wait();
    }
    public static void runTest() throws InterruptedException {
        final Barrier barrier = new Barrier(3);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread 1");
                    barrier.await();
                    System.out.println("Thread 1");
                    barrier.await();
                    System.out.println("Thread 1");
                    barrier.await();
                } catch(InterruptedException e){

                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread 2");
                    barrier.await();
                    System.out.println("Thread 2");
                    Thread.sleep(2000);
                    barrier.await();
                    System.out.println("Thread 2");
                    barrier.await();
                } catch(InterruptedException e){

                }

            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread 3");
                    barrier.await();
                    System.out.println("Thread 3");
                    Thread.sleep(2000);
                    barrier.await();
                    System.out.println("Thread 3");
                    barrier.await();
                } catch(InterruptedException e){

                }

            }
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();t2.join();t3.join();
    }

}
