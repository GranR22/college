package examples;
//《Java从入门到精通》P87 例5.17
//使用比较运算符比较两个字符串，实例代码如下：
public class STRINGBIJIAOYUNSUANFU {
        String tom = new String("I am a student");
        String jerry = new String("I am a student");
        boolean b = (tom==jerry);
}
//此时，布尔型变量b的值为false，因为字符串是对象，tom、jerry是引用
//比较运算符比较的是两个字符串的地址是否相同
//即使两个字符串的内容相同，两个对象的内存地址也是不同的，使用比较运算符仍然会返回false。