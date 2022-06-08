package ch09;

import java.io.File;
import java.util.Scanner;

public class Ch9_37 {

	public static void main(String[] args) throws Exception {

		// java.util.Scanner클래스
		
		Scanner sc = new Scanner(new File("data3.txt"));
		int cnt = 0;
		int totalSum = 0;
		
		while(sc.hasNext()) {
			String line = sc.nextLine();
			// ","로 하려면 ,뒤 공백이 없어야 함
			Scanner sc2 = new Scanner(line).useDelimiter(", ");
			int sum = 0;
			
			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			
			System.out.println(line + ", sum = " + sum);
			totalSum += sum;
			cnt++;
			
		}
		System.out.println("Line : " + cnt + ", Total: " + totalSum);
	}

}
