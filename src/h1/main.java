package h1;
import h1.MTWriter;
import h1.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public  static  void  main(String[] args)
    {

        MTWriter mtWriter =new MTWriter();
        int[] threadnums={1,2,4,8,16,32};
        int leftindex=0;
        int datalength=2014*512*256;;
        ExecutorService threadPool = Executors.newFixedThreadPool(32);
        for(int i=0;i<threadnums.length;i++)
        {
            int threadnum=threadnums[i];
            for(int j=0;j<threadnum;j++)
            {
                int increasing=datalength/threadnum;
                threadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                       mtWriter.fliewriter(threadnum);   //把线程数传过去 让它自己拆分数组
                    }
                });

                leftindex=leftindex+increasing+1;

//                rigthindex=2014*512*256/threadnum;
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//
//                        mtWriter.fliewriter(leftindex,rigthindex);
//
//                    }
//                }).start();

            }


        }
        int leftindex=

        new Thread(new Runnable() {
            @Override
            public void run() {

                mtWriter.fliewriter();

            }
        }).start();

//        MTWriter mtWriter=new MTWriter();
//        mtWriter.write();

    }
}
