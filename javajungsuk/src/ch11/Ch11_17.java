package ch11;

import java.util.Iterator;

public class Ch11_17 {

	public static void main(String[] args) {

		// Iterator
		
		Ch11_16 v = new Ch11_16();
		// MyVector2 v = new MyVector();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println("삭제전: " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println("삭제후: " + v);
	}

}
