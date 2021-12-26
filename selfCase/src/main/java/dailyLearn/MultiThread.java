package dailyLearn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dongchen
 * @Data 2020/9/26
 * @Time 10:57
 */
public class MultiThread {
    static Account account = new Account();

    public static void main(String[] args) {
        Withdraw withdraw = new Withdraw();
        Deposite deposite = new Deposite();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(deposite);
        executorService.execute(withdraw);

        executorService.shutdown();
        System.out.println("Thread 1\t\tThread 2\t\t Balance");
    }

    public static class Withdraw implements Runnable{

        @Override
        public void run() {
            while (true){
                int money = (int) (Math.random()*10+1);
                System.out.println("WithDraw" + money);
                account.withDraw(money);


            }
        }
    }

    public static class Deposite implements Runnable{

        @Override
        public void run() {
            while (true){

                try {
                    account.deposit((int) (Math.random()*10+1));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    private static class Account{
        private static Lock lock = new ReentrantLock();
        int balance = 0;
        Condition newDsposit = lock.newCondition();

        private int getBalance(){
            return balance;
        }

        public void withDraw(int account){
            lock.lock();
            try {
                while (balance < account){
                    System.out.println("Need wait to deposit! balance " + getBalance());
                    newDsposit.await();
                }

                balance = balance - account;
            } catch (InterruptedException e) {
                System.out.println("balance: " + balance + "\n" + "account: " + account);
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void deposit(int account){
            lock.lock();
            try {
                balance = balance + account;
                System.out.println("Deposite: " + account +"Balance: "+getBalance());
                newDsposit.signalAll();
            }finally {
                lock.unlock();
            }


        }

    }
}
