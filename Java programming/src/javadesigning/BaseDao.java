package javadesigning;
import java.util.Collection;
import java.util.Iterator;
class BaseDao<T> {
    public void printCollection(Collection<T> col){
        Iterator<T> it = col.iterator();
        while(it.hasNext()){
            T t = it.next();
            System.out.println(t);
        }
        System.out.println("------------------------------------");

    }
}

class Student {
    String name ;
    int age ;
    public Student() {

    }
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
