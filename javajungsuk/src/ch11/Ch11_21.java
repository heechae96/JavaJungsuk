package ch11;

import java.util.*;

public class Ch11_21 {

	public static void main(String[] args) {

		// HashSet

		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);	// LinkedList(Collection c)
		Collections.sort(list);
		System.out.println(list);
	}

}
