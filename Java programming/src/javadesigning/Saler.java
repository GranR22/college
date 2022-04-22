package javadesigning;
import java.util.Iterator;
import java.util.TreeMap;
public class Saler implements Comparable<Object>{
	    private String name;
	    private float volume;
	    public Saler (String name, float volume) {
	        this.name = name;
	        this.volume = volume;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public float getVolume() {
	        return volume;
	    }
	    public void setVolume (float volume) {
	        this.volume = volume;
	    }
	    @Override
	    public int compareTo(Object o) {
	        Saler e = (Saler)o;
	        return ((Float)this.volume).compareTo((Float)e.volume);
	    }
	}
	class ComparableTest {
	    public static void main(String[] args) {
	        TreeMap<Saler, Integer> myTreeMap = new TreeMap<Saler, Integer>();
	        myTreeMap.put(new Saler("z", 213), 6);
	        myTreeMap.put(new Saler("n", 425), 1);
	        myTreeMap.put(new Saler("m", 558), 3);
	        myTreeMap.put(new Saler("g", 865), 4);
	        myTreeMap.put(new Saler("j", 548), 5);
	        myTreeMap.put(new Saler("d", 795), 8);
	        int n = 0;
	        Iterator<Saler> it = myTreeMap.keySet().iterator();
	        while (it.hasNext() && n < 3) {
	            System.out.println(((Saler) it.next()).getName());
	            n++;
	        }
	    }
	}

