package javadesigning;

import java.util.Comparator;
import java.util.TreeSet;

public class Book2 {
	 public static void test1() {
	        Comparator comparator = new Comparator() {
	            @Override
	            public int compare(Object o1, Object o2) {
	                return compare(((Book)o1).getName(), ((Book)o2).getName());
	            }
	            public int compare(String o1, String o2) {
	                String s1 = (String) o1;
	                String s2 = (String) o2;
	                int len1 = s1.length();
	                int len2 = s2.length();
	                int n = Math.min(len1, len2);
	                char v1[] = s1.toCharArray();
	                char v2[] = s2.toCharArray();
	                int pos = 0;

	                while (n-- != 0) {
	                    char c1 = v1[pos];
	                    char c2 = v2[pos];
	                    if (c1 != c2) {
	                        return c1 - c2;
	                    }
	                    pos++;
	                }
	                return len1 - len2;
	            }
	        };
	        TreeSet<Book> ts = new TreeSet<Book>(comparator);
	        ts.add(new Book(20212021, "¡¶2K21¡·", "LILY"));
            ts.add(new Book(20202020, "¡¶2K20¡·", "BOBO"));
            ts.add(new Book(20192019, "¡¶2K19¡·", "CHELLY"));
            ts.add(new Book(20182018, "¡¶2K18¡·", "MIKE"));
            ts.add(new Book(20172017, "¡¶2K17¡·", "BRAVIA"));
	        Object[] e;
	        e = ts.toArray();
	        for (int i = 0; i < ts.size(); i++) {
	            System.out.println(e[i]);
	        }
	    }
	 public static void main(String[] args) {
	        Book2 bookTest = new Book2();
	        Book2.test1();
	    }
}
