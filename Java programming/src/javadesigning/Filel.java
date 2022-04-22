package javadesigning;
import java.io.BufferedInputStream;  
import java.io.BufferedOutputStream;  
import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
public class Filel  {  
    public void writeWriting(){  
        String fileName="C:\\Users\\24642\\Desktop\\学习资料\\广东理工学院\\Java程序设计\\实验报告\\6\\file1.dat";  
        int Num1=5;  
        int Num2=10;  
        int Num3=15;  
        try  
        {  
            DataOutputStream out=new DataOutputStream(new FileOutputStream(fileName));  
            out.writeInt(Num1);  
            out.writeInt(Num2);  
            out.writeInt(Num3);  
            out.close();  
        }catch (Exception e){  
            e.printStackTrace();  
        }  
    }    
    public void writeWriting2()  
    {  
        String fileName1=" d://file2.dat";  
        try  
        {  
            DataOutputStream out=new DataOutputStream(  
                                 new BufferedOutputStream(  
                                 new FileOutputStream(fileName1)));  
            out.writeInt(50);  
            System.out.println(out.size()+" bytes have been written.");  
            out.writeDouble(100.5);  
            System.out.println(out.size()+" bytes have been written.");  
            out.writeBytes("writeString");  
            System.out.println(out.size()+" bytes have been written.");  
            out.close();  
        } catch (Exception e){  
            e.printStackTrace();  
        }  
    }  
    public void readReading()  
    {  
        String fileName=" d://file1.dat";  
        int sum=0;  
        try{  
            DataInputStream in=new DataInputStream(  
                               new BufferedInputStream(  
                               new FileInputStream(fileName)));  
            sum+=in.readInt();  
            sum+=in.readInt();  
            sum+=in.readInt();  
            System.out.println("The sum is:"+sum);  
            in.close();  
        } catch (Exception e){  
            e.printStackTrace();  
        }  
}
public class Galaxy{
    public void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.writeMethod1();
        mainClass.writeMethod2();
        mainClass.readMethod1();
      }
  }
}
