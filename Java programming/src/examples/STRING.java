package examples;
//《Java从入门到精通》P78 例5.2 
//用一个字符数组a创建String对象，实例代码如下：
public class STRING {
	char a[]= {'g','o','o','d'};
    String s = new String(a);
    //上述两行代码等价于：String s = new String("good")
}
//String(char a[])  用一个字符数组a创建String对象