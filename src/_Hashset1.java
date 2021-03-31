import java.util.ArrayList;
import java.util.HashSet;

public class _Hashset1 {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(100);
	al.add("abc");
	al.add('C');
	al.add(100);
	al.add(100);
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	
	HashSet hs=new HashSet(al);
	System.out.println(hs);
}
}
