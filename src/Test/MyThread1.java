package Test;

import java.util.Random;

import static java.lang.Thread.sleep;

public class MyThread1 implements Runnable {
    private String name;
    Data data;

    MyThread1(String name_, Data data_){
            name=name_;
            data=data_;
    }
    @Override
    public void run() {
        Random random_=new Random();
        int time=random_.nextInt(1000);
        data.Update1();
        data.setSleeptime1(time);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

