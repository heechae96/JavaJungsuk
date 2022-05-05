package ch05;

import java.util.Arrays;

public class Ch5_3 {

	public static void main(String[] args) {

		// 배열의 복사
		// for문을 이용해서 배열을 복사하는 방법
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = i + 1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length: "+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]: "+arr[i]);
		
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		arr = tmp;
		
		System.out.println("[변경후]");
		System.out.println("arr.length: "+arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
	}

}
