import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();
        Thread t1 = new Thread(() -> call(foo::first, "first,"));
        Thread t2 = new Thread(() -> call(foo::second, "second,"));
        Thread t3 = new Thread(() -> call(foo::third, "third."));

        // Start threads out of order, with delay between them, giving each thread
        // enough time to complete, if not adequately coded to ensure execution order.
        t2.start();
        Thread.sleep(500);
        t3.start();
        Thread.sleep(500);
        t1.start();

        // Wait for threads to complete
        t2.join();
        t3.join();
        t1.join();

        // At this point, the program output should be "first,second,third."
    }
    interface FooMethod {
        public void call(Runnable printFirst) throws InterruptedException;
    }
    private static void call(FooMethod method, String text) {
        try {
            method.call(() -> System.out.print(text));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Foo {

    ReentrantLock lock;
    boolean oneDone;
    boolean twoDone;
    Condition oneSignal;
    Condition twoSignal;

    public Foo() {
        lock = new ReentrantLock();
        oneDone = false;
        twoDone = false;
        oneSignal = lock.newCondition();
        twoSignal = lock.newCondition();

    }

    public void first(Runnable printFirst) throws InterruptedException {

       lock.lock();
        try {
            printFirst.run();
            oneDone = true;
            oneSignal.signal();
        } finally {
            lock.unlock();
        }

    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        // printSecond.run() outputs "second". Do not change or remove this line.
        while(!oneDone){
            oneSignal.await();
            }
        try {
            printSecond.run();
            twoDone = true;
            twoSignal.signal();
        }finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        // printThird.run() outputs "third". Do not change or remove this line
        while(!twoDone){
            twoSignal.await();
        }
        try {
            printThird.run();
        } finally {
            lock.unlock();
        }
    }
}
