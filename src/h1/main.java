package h1;
import h1.MTWriter;
import h1.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public  static  void  main(String[] args)
    {
        MTWriter mtWriter =new MTWriter();
        int[] threadnums={4};
        ExecutorService threadPool = Executors.newFixedThreadPool(32);
        for(int i=0;i<threadnums.length;i++)
        {
            int threadnum=threadnums[i];
            for(int j=0;j<threadnum;j++)
            {
                threadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                       mtWriter.fliewriter(threadnum);   //把线程数传过去 让它自己拆分数组
                    }
                });


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
            mtWriter.setnum();
        }
        threadPool.shutdown(); // 设置线程池的状态为SHUTDOWN，然后中断所有没有正在执行任务的线程
        threadPool.shutdownNow();
//        int leftindex=
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                mtWriter.fliewriter();
//
//            }
//        }).start();

//        MTWriter mtWriter=new MTWriter();
//        mtWriter.write();

    }
}
