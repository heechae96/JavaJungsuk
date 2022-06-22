package ch11;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ch11_14 {

	public static void main(String[] args) {

		// ListIterator
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			// 순방향으로 진행하면서 읽어옴
			System.out.println(it.next());
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			// 역방향으로 진행하면서 읽어옴
			System.out.println(it.previous());
		}
		System.out.println();
	}

}
