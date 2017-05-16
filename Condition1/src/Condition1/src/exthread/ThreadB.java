package exthread;

import Service.MyService;

/**
 * Created by Administrator on 2017/5/16.
 */
public class ThreadB extends Thread{
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service = service;
    }
    public void run(){
        service.awaitB();
    }
}