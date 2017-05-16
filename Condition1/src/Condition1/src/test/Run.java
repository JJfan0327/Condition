package test;

import Service.MyService;
import exthread.*;
/**
 * Created by Administrator on 2017/5/16.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(3000);
        service.signalAll_A();
        service.signalAll_B();
    }
}
