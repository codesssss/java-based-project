package Test;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Data data1=new Data();
        System.out.println("              |                 "+"Thread A"+"                     |                 "+"Thread B"+"                     |");
        System.out.println("    "+"Round"+"     "+"Sleep Time"+" "+"|"+" "+"Random character"+" "+"|"+" "+"Point obtained"+" "+"|"+" "+"Sleep Time"+" "+"|"+" "+"Random character"+" "+"|"+" "+"Point obtained");
      Thread cmp=new  MyThreadCmp("cmp",data1);
      Thread merge1=new Thread (new MyThread1("random1",data1));
      Thread merge2=new Thread(new MyThread1("random2",data1));

        merge1.start();
        merge2.start();
        cmp.start();

    }
}
