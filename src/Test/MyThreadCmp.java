package Test;

import java.util.Random;

public class MyThreadCmp extends Thread{
    private String name;
    Data data;
    int rm1;
    int rm2;
    MyThreadCmp(String name_,Data data_){
        name=name_;
        this.data=data_;
    }
    @Override
    public void run() {
        data.count++;
        data.TestIfIni();

        if (data.nowChar1>data.nowChar2){
        data.UpdateScore1();
        data.prt();
    }
        else if(data.nowChar1<data.nowChar2){
            data.UpdateScore2();
            data.prt();
        }
        else if(data.nowChar1==data.nowChar2){
            data.UpdateScoreBoth();
            data.prt();
        }

    }


}
