package dailyLearn;


import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dongchen
 * @Data 2020/9/26
 * @Time 13:48
 */
public class ConsumerProducer {
    
    private static Buffer buffer = new Buffer();
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Consumer());
        executorService.execute(new Producer());
        executorService.shutdown();
    }
    
    private static class Consumer implements Runnable{


        @Override
        public void run() {

                try {
                    while (true) {
                        System.out.println("\t\t\tread"+ buffer.read());
                        Thread.sleep((int)(Math.random()*10000));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
    
    private static class Producer implements Runnable{
        int i =1;
        @Override
        public void run() {
           try {
               while (true){
                   System.out.println("Produce: "+i);
                   buffer.write(i);
                   i++;
                   Thread.sleep((int)(Math.random()*10000));
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }
    
    private static class Buffer{
        private final static int CAPACITY = 1;
        Lock lock = new ReentrantLock();
        Condition notEmpty = lock.newCondition();
        Condition notFull = lock.newCondition();
        private LinkedList<Integer> linkedList = new LinkedList<>();
        public void write(int i){
            lock.lock();
                try {
                    while (linkedList.size() == CAPACITY) {
                        System.out.println("无法写");
                        notFull.await();
                    }
                    linkedList.offer(i);
                    System.out.println("写入"+i);
                    notEmpty.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
            
            
        public int read(){
            int value = 0;
            lock.lock();
            try {
                while (linkedList.isEmpty()){
                    System.out.println("无法读");
                    notEmpty.await();
                }
                value = linkedList.remove();
                System.out.println("读出"+value);
                notFull.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
                return value;
            }
        }    
            
        }
    
    
    
}
