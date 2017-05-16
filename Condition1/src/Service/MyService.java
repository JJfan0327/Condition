package Service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/5/16.
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void awaitA(){
        try{
            lock.lock();
            System.out.println("begin awaitA() time:"+System.currentTimeMillis()
                                +"ThreadName:"+Thread.currentThread().getName());
            condition.await();
            System.out.println("end  awaitA() time:"+System.currentTimeMillis()
                    +"ThreadName:"+Thread.currentThread().getName());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
    public void awaitB(){
        try{
            lock.lock();
            System.out.println("begin awaitB() time:"+System.currentTimeMillis()
                    +"ThreadName:"+Thread.currentThread().getName());
            condition.await();
            System.out.println("end  awaitB() time:"+System.currentTimeMillis()
                    +"ThreadName:"+Thread.currentThread().getName());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
    public void signalAll(){
        try{
            lock.lock();
            System.out.println("sinaglAll() time:"+System.currentTimeMillis()
                    +"ThreadName:"+Thread.currentThread().getName());
            condition.signalAll();
        }
        finally{
            lock.unlock();
        }
    }
}
