package javadesigning;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTestTwo {
	 public static void main(String[] args) {
	        Collection<Student> col1 = new ArrayList<>();
	        Student a = new Student("Ä«Ð¡¾Õ", 16);
	        Student b = new Student("ÎÄÜÆ", 17);
	        Student c = new Student("³ÙÇ‘", 14);
	        col1.add(a);
	        col1.add(b);
	        col1.add(c);
	        BaseDao<Student> studentBaseDao = new BaseDao<>();
	        studentBaseDao.printCollection(col1);

	        Collection<Integer> col2 = new ArrayList<>();
	        col2.add(20);
	        col2.add(30);
	        col2.add(40);
	        BaseDao<Integer> studentBaseDao2 = new BaseDao<>();
	        studentBaseDao2.printCollection(col2);
	    }
}
