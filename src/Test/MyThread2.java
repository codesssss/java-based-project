package Test;

import java.util.Random;

import static java.lang.Thread.sleep;

public class MyThread2 implements Runnable {
    private String name;
    Data data;
    MyThread2(String name_, Data data_){
        name=name_;
        data=data_;
    }
    @Override
    public void run() {
        Random random_=new Random();
        int time=random_.nextInt(1000);
        data.Update2();
        data.setSleeptime2(time);
        try {
            Thread.currentThread().sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


