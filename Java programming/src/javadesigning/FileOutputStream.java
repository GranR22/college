package javadesigning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStream{
    public static void main(String args[]) {
        File file = new File("NunberOne.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file, true);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要写入的字符串:");
            String msg = sc.next() + "\r\n";
            byte[] bytes = msg.getBytes();
            fout.write(bytes);
            fout.flush();
            fout.close();
            System.out.println("写入完成！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.File;

public class IOTest {
    public static void main(String[] args) {
        String path = "D:\\Java";		
        File file = new File(path);		
        func(file);
    }

    private static void func(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory())	
                func(f);
            if(f.isFile())		
                System.out.println(f);
        }
    }
}
