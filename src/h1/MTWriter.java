package h1;
import h1.Producer;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class MTWriter {
    private  byte[]data;
    private int threadnum=2;  //

    public void write() {
        data = Producer.producer();
        //将数据写入文件
        try{
        File file =new File("FileWriterWay.bin");
        //if file doesnt exists, then create it
        if(!file.exists()){
            file.createNewFile();
        }
        //true = append file
        FileWriter fileWritter = new FileWriter(file.getName(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        for(int i=0;i<data.length;i++) {
            bufferWritter.write(data[i]);
        }
        bufferWritter.close();
        System.out.println("Done");

    }catch(IOException e){
        e.printStackTrace();
    }
}

public void fliewriter(int threadnum)
{

    try{
        File file =new File("FileWriterWay.bin");
        //if file doesnt exists, then create it
        if(!file.exists()){
            file.createNewFile();
        }
        //true = append file
        FileWriter fileWritter = new FileWriter(file.getName(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        for(int i=0;i<data.length;i++) {
            bufferWritter.write(data[i]);
        }
        bufferWritter.close();
        System.out.println("Done");

    }catch(IOException e){
        e.printStackTrace();
    }


}
public static void main(String[] args)
{




}

}
