package examples;
//《Java从入门到精通》P93 例5.22
//返回一个月中的天数，实例代码如下：
public class STRINGDATE {
        Date date = new Date();  //创建Date对象date
        String s = String.format("%te",date);  //通过format()方法对date进行格式化
}
//上述代码中变量s的值是当前日期中的天数，如今天是15号，则s的值为15；%te是转换符。