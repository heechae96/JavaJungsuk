package ch11;

import java.util.HashSet;
import java.util.Set;

public class Ch11_20 {

	public static void main(String[] args) {

		// HashSet
		
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);		// HashSet에 objArr의 요소들을 저장
		}
		
		// HashSet에 저장된 요소들을 출력
		System.out.println(set);
		
	}

}
