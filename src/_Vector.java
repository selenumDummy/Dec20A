import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class _Vector {
	public static void main(String[] args) {
		Vector V = new Vector();
		Vector V1 = new Vector();

		V.add(100);
		V.add("abc");
		V.add('C');
		V.add(100);
		V.add(100);
		V.add(null);
		V.add(null);
		System.out.println(V.capacity());  //10

		System.out.println(V);
		System.out.println(V.size()); // 7
		System.out.println(V.isEmpty()); // fVse
		System.out.println(V1.isEmpty()); // true

		V.add(200);
		System.out.println(V);
		System.out.println(V.get(3)); // 100

		// insert data in between V --right shift
		V.add(3, 300);
		System.out.println(V);
		System.out.println(V.size()); // 9

		// remove data from V --left shift
		V.remove(3);
		System.out.println(V);
		System.out.println(V.size()); // 8

		// modify data in V
		V.set(2, 'B');
		System.out.println(V);

		System.out.println("------Print Vector data using for loop------");
		for (int i = 0; i <= V.size() - 1; i++) {
			System.out.println(V.get(i));
		}

		System.out.println("------Print Vector data using for each loop------");
		for (Object s1 : V) {
			System.out.println(s1);
		}

		System.out.println("------Print Vector data using for Iterator cursor------");
		Iterator itr = V.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------Print Vector data using for list Iterator cursor------");
		ListIterator litr = V.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());

		}

		System.out.println("------Print Vector data using for list enumeration cursor------");
		Enumeration enu = V.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());

		}

	}
}
