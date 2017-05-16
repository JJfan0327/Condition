package exthread;

import Service.MyService;

/**
 * Created by Administrator on 2017/5/16.
 */
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service = service;
    }
    public void run(){
        service.awaitA();
    }
}
