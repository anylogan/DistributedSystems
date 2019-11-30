package h1;

public class test2 {
    public  static  void main(String[] args)
    {
        byte[] b=new byte[100];
        b[0]=0;
        b[99]=100;
        for(int i=0;i<100;i++) {
            System.out.println(b[i]);
        }
    }
}
