import java.util.HashSet;
import java.util.Iterator;

public class _Hashset {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	hs.add(100);
	hs.add("abc");
	hs.add('A');
	hs.add(100);
	hs.add(null);
	hs.add(null);
	
	
	System.out.println(hs);
	System.out.println(hs.size());
	hs.remove('A');
	System.out.println(hs);
	System.out.println(hs.isEmpty());  
	
	System.out.println(hs.contains("abc"));  //true
	
	System.out.println("-----print hashset info using foreach loop------");	
	for ( Object ele: hs) {
		System.out.println(ele);
	}
	
	
	System.out.println("-----print hashset info using iterator cursor------");	

	Iterator itr = hs.iterator();
	
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
}
}
