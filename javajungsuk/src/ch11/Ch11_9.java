package ch11;

import java.util.*;

public class Ch11_9 {

	public static Stack back 	= new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {

		// 스택과 큐의 활용
		// 스택의 활용
		goURL("1. 네이트");
		goURL("2. 네이버");
		goURL("3. 다음");
		goURL("4. 구글");
		
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();

		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 =");
		printStatus();

		
		
	}
	
	// 상태보기
	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다");
		System.out.println();
	}
	
	// 해당 주소로 이동
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	// 앞으로
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	
	// 뒤로
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}

}
