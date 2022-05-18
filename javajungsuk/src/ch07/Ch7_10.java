package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch7_10 {

	public static void main(String[] args) {

		// import문의 선언
		// java.util.Date today = new java.util.Date();
		Date today = new Date();
		
		// java.text.SimpleDateFormat date 
		//				= new java.text.SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
	}

}
