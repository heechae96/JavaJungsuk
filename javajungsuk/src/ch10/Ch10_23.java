package ch10;

import java.time.*;

public class Ch10_23 {

	public static void main(String[] args) {

		// LocalDateTime과 ZonedDateTime
		
		LocalDate date = LocalDate.of(2015, 12, 31);
		LocalTime time = LocalTime.of(12, 34, 56);
		
		// 2015년 12월 31일 12시 34분 56초
		LocalDateTime dt = LocalDateTime.of(date, time);
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
//		String strZid = zdt.getZone().getId();
		
		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		// ZonedDateTime -> OffsetDateTime
		OffsetDateTime odt = zdt.toOffsetDateTime();
		
		System.out.println(dt);
		System.out.println(zid);
		System.out.println(zdt);
		System.out.println(seoulTime);
		System.out.println(nyTime);
		System.out.println(odt);
	}

}
