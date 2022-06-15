package ch11;

import java.util.*;

public class Ch11_2 {

	public static void main(String[] args) {

		// ArrayList
		
		final int LIMIT = 10;	// 자르고자 하는 글자의 개수를 지정
		String source = "0123456789abcdefghijABCDEFGHIF!@#$%^&*()ZZZ";
		int length = source.length();
//		System.out.println("source길이 :"+source.length());
		
		List list = new ArrayList(length/LIMIT + 10);	// 크기를 약간 여유롭게
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
//			System.out.println(list);
//			System.out.println(list.size());
		}
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
//		System.out.println(list.size());
	}

}
