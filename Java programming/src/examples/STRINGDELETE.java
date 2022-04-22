package examples;
//《Java从入门到精通》P100 例5.30
//删除指定位置的子字符串，实例代码如下：
public class STRINGDELETE {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StringBuilder bf = new StringBuilder("StringBuilder");  //创建字符串生成器
		bf.delete(5, 10);  //删除的子字符串
		System.out.println(bf.toString());  //此时输出的信息为Strinder

	}

}
