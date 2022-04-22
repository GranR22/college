package examples;
//《Java从入门到精通》P100 例5.29
//向字符串生成器中指定的位置添加字符，实例代码如下：
public class STRINGBUILDERINSERT {
	public static void main(String[] args) {
	StringBuilder bf = new StringBuilder("hello");  //创建字符串生成器
	bf.insert(5,"world");
	System.out.println(bf.toString());  //此时输出信息为helloword

}
}