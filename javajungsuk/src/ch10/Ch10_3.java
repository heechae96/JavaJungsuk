package ch10;

import java.util.Calendar;

public class Ch10_3 {

	public static void main(String[] args) {

		// Calendar와 Date

		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		// 년 월 일을 따로 설정안하면 지금기준으로 잡힘
		// 10시 20분 30초로 설정
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		// 20시 30분 10초로 설정
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : "+time1.get(Calendar.HOUR_OF_DAY)+"시 "
				+ time1.get(Calendar.MINUTE)+"분 "+ time1.get(Calendar.SECOND)+"초");
	
		System.out.println("time2 : "+time2.get(Calendar.HOUR_OF_DAY)+"시 "
				+ time2.get(Calendar.MINUTE)+"분 "+ time2.get(Calendar.SECOND)+"초");
		
		// 시간차이가 음수가 생기는걸 방지하기 위해 절대값!
		long diff = 
				Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println("time1과 time2의 차이는 " + diff + "초 입니다.");
		
		String tmp = "";
		for(int i=0; i<TIME_UNIT.length; i++) {
			tmp += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			diff %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면 " + tmp + "입니다");

	
	}
	

}
