package h1;
public class Producer {
    public static byte[] producer()
    {
       byte[] numbers=new byte[2014*512*256];
       int index=0;
        for(int i=1;i<2014*512+1;i++)
        {
            for (int j=0;j<256;j++)
            {
                numbers[index]=(byte)i;
                index+=1;
            }
        }
        System.out.println("data created");
        return numbers;
    }
}
