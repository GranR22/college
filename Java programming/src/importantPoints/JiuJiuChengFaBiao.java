package importantPoints;
//《Java程序设计》P054例3-16
//编写程序，使用二重循环，计算并输出九九乘法表。
public class JiuJiuChengFaBiao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int x=1;x<=9;x++) {
        	for(int y=1;y<=x;y++) {
        		System.out.print(y+"*"+x+"="+(x*y)+"\t");
        		//"\t"为转义字符中的垂直制表符，将光标移到下一个制表符的位置
        	}
        	System.out.println();   //换行（有“ln后缀”）
	}       
        }
}
//以上代码不是书本上的标准代码，有经本人改动
/*
*下面的代码为《Java程序设计》P054例3-16的部分代码：
*for(int i=1;i<=9;i++) {   //第一层循环
      	for(int j=1;j<=i;j++) {   //第二层循环
      		System.out.print(i+"*"+j+"="+(i*j)+"\t");
      		//"\t"为转义字符中的垂直制表符，将光标移到下一个制表符的位置
      	}
      	System.out.print("\n");
      	//换行（转义字符）
      }   
*/