package ArrayList;

import java.util.ArrayList;

public class Ex01_How_to_use_ArrayList {

	public static void main(String[] args) {
		//ArrayList - Array's upward compatibility
		// ※Can have different DataType
		// ※Variable Length. - Doesnt need length
		//  -> Delete or Add Data
		//  -  None Null.
		
		ArrayList al = new ArrayList();
		
		// Add data : add Method
		al.add("Dong");
		al.add("Ryu");
		
		// Insert Data in Stream
		al.add(1,"Moon");
		
		// Print whole ArrayList
		System.out.println(al);
		
		// Specific Value
		System.out.println(al.get(1));
		
		// Delete Data
		al.remove(1);
		
		System.out.println(al);
		
		//replace specific index
		al.set(0, "kim");
		
		System.out.println(al);
		
		//clear whole ArrayList
		al.clear();
		
		System.out.println(al);
		
		// ArrayList Length
		System.out.println(al.size());
		
		
		
		
	}

}
