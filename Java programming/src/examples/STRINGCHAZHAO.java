package examples;
//《Java从入门到精通》P81 例5.9
//查找字符a在字符串str中的索引位置，实例代码如下：
public class STRINGCHAZHAO {
  String str ="We are students";
  int size = str.indexOf("a");  //变量size的值是3
}
/*str.indexOf(String s)
*语法如下：
*str.indexOf(substr)
*str:任意字符串对象
*substr:要搜索的字符串
*该方法用于返回参数字符串s在指定字符串中首次出现的索引位置。
*当调用字符串的indexOf（）方法时，会从当前字符串的开始位置搜索s的位置；如果没有检索到字符串s，该方法的返回值是-1
*/


/*
*lastIndexOf(String str)
*该方法用于返回指定字符串最后一次出现的索引位置。
*当调用字符串的lastIndexOf()方法时，会从字符串的结尾处，从右向左反向查找指定字符串，如果找到指定字符串，则返回该字符串中第一个字符的索引；如果没有查找到字符串，该方法返回-1
*语法如下：
*str.lastIndexOf(substr)
*str:任意字符串对象
*substr:要搜索的字符串
*
*如果lastIndexOf()方法中的参数是空字符串“”（注意没有空格），则返回的结果与调用该字符串length()方法的返回结果相同
*/