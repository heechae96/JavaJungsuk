package ch09;

import java.util.StringJoiner;

public class Ch9_14 {

	public static void main(String[] args) {

		// join()과 StringJoiner
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr) {
			sj.add(s);
		}
		
		System.out.println(sj.toString());
		
		System.out.println("-----------------");
		
		String animals2 = "dog,cat,bear";
		String[] arr2 = animals2.split(".");
		
		System.out.println(String.join("***", arr2));
		
		StringJoiner sj2 = new StringJoiner("###","{{{","]]]");
		for(String s : arr2) {
			sj2.add(s);
		}
		
		System.out.println(sj2.toString());

		
	}

}
