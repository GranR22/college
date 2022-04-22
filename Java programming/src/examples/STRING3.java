package examples;
//《Java从入门到精通》P78 例5.4
//创建字符数组，将数组中的所有元素链接成一个String对象，实例代码如下：
public class STRING3 {
  char a[]= {'s','t','u','d','e','n','t'};
  String s = new String(a);
  //上述两行代码等价于String s = new String("student")
}
//String(char[]value)  该构造方法可分配一个新的String对象，使其表示字符数组参数中所有的元素链接的结果。