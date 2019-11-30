package h1;
import h1.Producer;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class MTWriter {
    private  byte[]data;
    private int num=0;
    public  MTWriter()  //构造函数
    {
        data=Producer.producer();
    }
//    public void write() {
//        data = Producer.producer();
//        //将数据写入文件
//        try{
//        File file =new File("FileWriterWay.bin");
//        //if file doesnt exists, then create it
//        if(!file.exists()){
//            file.createNewFile();
//        }
//        //true = append file
//        FileWriter fileWritter = new FileWriter(file.getName(),true);
//        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
//        for(int i=0;i<data.length;i++) {
//            bufferWritter.write(data[i]);
//        }
//        bufferWritter.close();
//        System.out.println("Done");
//
//    }catch(IOException e){
//        e.printStackTrace();
//    }
//}

public void fliewriter(int threadnum)
{
    num=num+1;
    int increasing=data.length/threadnum;
    int leftindex=(num-1)*increasing;
    int rigthindex=num*increasing-1;
    try{
        File file =new File("threadnum"+threadnum+"FileWriterWay.txt");
        //if file doesnt exists, then create it
        if(!file.exists()){
            file.createNewFile();
        }
        //true = append file
        FileWriter fileWritter = new FileWriter(file.getName(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        for(int i=leftindex;i<=rigthindex;i++) {
            bufferWritter.write((int)data[i]);
        }
        bufferWritter.close();
        System.out.println("threadnum"+threadnum+"FileWriter Done");

    }catch(IOException e){
        e.printStackTrace();
    }


}
public void  setnum()
{
    num=0;
}

}
