package examples;
//《Java从入门到精通》P78 例5.3
//提取字符组a中的一部分创建一个字符串对象，实例代码如下：
public class STRING2 {
  char a[]= {'s','t','u','d','e','n','t'};
  String s = new String(a,2,4);
  //上述两行代码等价于String s = new String("uden");
}
/*String(char a[],int offset,int length)  
提取字符组a中的一部分创建一个字符串对象。参数offset表示开始截取字符串的位置，length表示截取字符串的长度
*/