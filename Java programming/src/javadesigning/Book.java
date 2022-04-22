package javadesigning;
import java.util.TreeSet;
public class Book {
	    private int id;
	    private String name;
	    private String editor;
	    public Book(int id, String name, String editor) {
	        this.id = id;
	        this.name = name;
	        this.editor = editor;
	    }
	    public int getID() {
	        return id;
	    }
	    public void setID(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getEditor() {
	        return editor;
	    }
	    public void setEditor(String editor) {
	        this.editor = editor;
	    }
	    public String toString(){
	        String str = "±‡∫≈£∫"+id+"  È√˚£∫"+name.toString()+"±‡º≠£∫"+editor.toString();
	        return str;
	        
	}
	    public class BookTest {
	   	 public void test1 () {
	            TreeSet<Book> ts = new TreeSet<Book>();
	            ts.add(new Book(20212021, "°∂2K21°∑", "LILY"));
	            ts.add(new Book(20202020, "°∂2K20°∑", "BOBO"));
	            ts.add(new Book(20192019, "°∂2K19°∑", "CHELLY"));
	            ts.add(new Book(20182018, "°∂2K18°∑", "MIKE"));
	            ts.add(new Book(20172017, "°∂2K17°∑", "BRAVIA"));
	                Object[] e;
	                e = ts.toArray();
	                for (int i = 0; i < ts.size(); i++) {
	                    System.out.println(e[i]);
	                }
	            }
	   	  public void main(String[] args) {
	   	        BookTest bookTest = new BookTest();
	   	        bookTest.test1();
	   	    }
	   }
}
