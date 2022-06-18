package ch11;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Ch11_10 {

	public static void main(String[] args) {

		// 스택과 큐의 활용
		// 스택의 활용

		System.out.println("Usage : \"EXPRESSION\"");
		
		Stack st = new Stack();
		System.out.println("Example : \"((2+3)*1)+3\"");
		Scanner scan = new Scanner(System.in);
		String expression = scan.nextLine();
		
		System.out.println("expression: " + expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch);
//					st.push(ch+"");
				}else if(ch == ')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치");
			}else {
				System.out.println("괄호가 일치하지 않음");
			}
		}catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않음");
		}
	}

}
