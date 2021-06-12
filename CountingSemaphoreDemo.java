public class CountingSemaphoreDemo {
    CountingSemaphore cs = new CountingSemaphore(1);
    Thread acquire = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i=0;i<5;i++){
                try {
                    cs.acquire();
                }catch(InterruptedException e){

                }
            }
        }
    });
    Thread release = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i=0;i<5;i++){
                try{
                    cs.release();
                }catch (InterruptedException e){

                }
            }
        }
    });
}
     class CountingSemaphore {
    int usedPermits = 0;
    int maxCount;
    CountingSemaphore(int count){
        maxCount = count;
    }
    public synchronized void acquire() throws InterruptedException{
        while(usedPermits == maxCount){
            wait();
        }
        usedPermits++;
        notify();

    }
    public synchronized void release() throws InterruptedException {
        while(usedPermits ==0)
            wait();
        usedPermits--;
        notify();
    }

}
