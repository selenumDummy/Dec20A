import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _Arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();

		al.add(100);
		al.add("abc");
		al.add('C');
		al.add(100);
		al.add(100);
		al.add(null);
		al.add(null);

		System.out.println(al);
		System.out.println(al.size()); // 7
		System.out.println(al.isEmpty()); // false
		System.out.println(al1.isEmpty()); // true

		al.add(200);
		System.out.println(al);
		System.out.println(al.get(3)); // 100

		// insert data in between al --right shift
		al.add(3, 300);
		System.out.println(al);
		System.out.println(al.size()); // 9

		// remove data from al --left shift
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size()); // 8

		// modify data in al
		al.set(2, 'B');
		System.out.println(al);

		System.out.println("------Print arraylist data using for loop------");
		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
		}

		System.out.println("------Print arraylist data using for each loop------");
		for (Object s1 : al) {
			System.out.println(s1);
		}

		System.out.println("------Print arraylist data using for Iterator cursor------");
		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------Print arraylist data using for list Iterator cursor------");
		ListIterator litr = al.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());

		}

	}
}
