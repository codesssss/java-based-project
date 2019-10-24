package Test;

import java.util.Random;

public class Data {
    char RandomChar1=0;//产生的随机字符
    char RandomChar2=0;
    char nowChar1;
    char nowChar2;
    int score1;//二者得的分数
    int score2;
    int count;
    int sleeptime1;//休眠时间
    int sleeptime2;
    public synchronized void Update1(){
        while(RandomChar1!=0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
        int choice = 97;
        Random random = new Random();
        RandomChar1 = ((char) (choice + random.nextInt(26)));
        this.notify() ;
    }
    public synchronized void Update2(){
        while(RandomChar2!=0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        int choice = 97;
        Random random = new Random();
        RandomChar2 = ((char) (choice + random.nextInt(26)));
        this.notify() ;
    }
    public  synchronized  void UpdateScore1(){
    score1+=2;
}
    public  synchronized  void UpdateScore2(){
        score2+=2;
    }
    public  synchronized void UpdateScoreBoth(){
        score1++;
        score2++;
    }
    public synchronized void setSleeptime1(int t1){
        sleeptime1=t1;
    }
    public synchronized void setSleeptime2(int t2){
        sleeptime2=t2;
    }
    public synchronized void prt(){
        System.out.println("");
        System.out.println(count+"   "+sleeptime1+" "+RandomChar1+"   "+score1+"   "+sleeptime2+"   "+RandomChar2+"   "+score2);
    }
    public synchronized void TestIfIni(){
        while (RandomChar1==0||RandomChar2==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        nowChar1=RandomChar1;
        nowChar2=RandomChar2;
        RandomChar1=0;
        RandomChar2=0;
        this.notifyAll();
    }
    public  synchronized  void TestIfFin(){
                this.notify();

        }

    }


