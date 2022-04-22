package javadesigning;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Copy {
    public static void main(String []args) throws IOException {
    	File myFile=new File("C://Users//24642//Pictures//表情//5a336602e7bce7250515af5d.jpg");
    	if(!myFile.isFile()){
    		System.out.println("错误：该文件不存在");
    		return;
    	}
    	FileInputStream fis=new FileInputStream(myFile);
    	FileOutputStream fos=new FileOutputStream("C:/Users/24642/Desktop/学习资料/广东理工学院/Java程序设计/实验报告/5"+myFile.getName());
    	byte bytes[]=new byte[1024];
    	int temp=0;
    	while((temp=fis.read(bytes))!=-1) {
    		fos.write(bytes,0,temp);
    	}
    	fis.close();
    	fos.close();
    	System.out.println("文件拷贝操作成功");
    }
}
