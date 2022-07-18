package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Ch14_16 {

	public static void main(String[] args) {

		// 그룹화 분할 - groupingBy(), partioningBy()
		
		Student5[] stuArr = {
				new Student5("나자바", true,  1, 1, 300),	
				new Student5("김지미", false, 1, 1, 250),	
				new Student5("김자바", true,  1, 1, 200),	
				new Student5("이지미", false, 1, 2, 150),	
				new Student5("남자바", true,  1, 2, 100),	
				new Student5("안지미", false, 1, 2,  50),	
				new Student5("황지미", false, 1, 3, 100),	
				new Student5("강지미", false, 1, 3, 150),	
				new Student5("이자바", true,  1, 3, 200),	

				new Student5("나자바", true,  2, 1, 300),	
				new Student5("김지미", false, 2, 1, 250),	
				new Student5("김자바", true,  2, 1, 200),	
				new Student5("이지미", false, 2, 2, 150),	
				new Student5("남자바", true,  2, 2, 100),	
				new Student5("안지미", false, 2, 2,  50),	
				new Student5("황지미", false, 2, 3, 100),	
				new Student5("강지미", false, 2, 3, 150),	
				new Student5("이자바", true,  2, 3, 200)	
			};
		
		System.out.println("1. 단순그룹화(반별로 그룹화)");
		Map<Integer, List<Student5>> stuByBan = Stream.of(stuArr)
				.collect(groupingBy(Student5::getBan));
		
		for(List<Student5> ban : stuByBan.values()) {
			for(Student5 s : ban) {
				System.out.println(s);
			}
		}
		
		System.out.println("2. 단순그룹화(성적별로 그룹화)");
		Map<Student5.Level, List<Student5>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s -> {
					if(s.getScore() >= 200)
						return Student5.Level.HIGH;
					else if(s.getScore() >= 100)
						return Student5.Level.MID;
					else
						return Student5.Level.LOW;
				}));
		
		TreeSet<Student5.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		for(Student5.Level key : keySet) {
			System.out.println("[" + key + "]");
			
			for(Student5 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		
		System.out.println("3. 단순그룹화 + 통계(성적별 학생수)");
		Map<Student5.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s -> {
					if(s.getScore() >= 200)
						return Student5.Level.HIGH;
					else if(s.getScore() >= 100)
						return Student5.Level.MID;
					else
						return Student5.Level.LOW;
				}, counting()));
		
		for(Student5.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
		System.out.println();
		
		//
		for(List<Student5> level : stuByLevel.values()) {
			System.out.println();
			for(Student5 s : level) {
				System.out.println(s);
			}
		}
		
		System.out.println("4. 다중그룹화(학년별, 반별)");
		Map<Integer, Map<Integer, List<Student5>>> stuByHakAndBan = 
				Stream.of(stuArr)
					.collect(groupingBy(Student5::getHak,
							groupingBy(Student5::getBan)
					));
		
		for(Map<Integer, List<Student5>> hak : stuByHakAndBan.values()) {
			for(List<Student5> ban : hak.values()) {
				System.out.println();
				for(Student5 s : ban)
					System.out.println(s);
			}
		}
		
		System.out.println("5. 다중그룹화 + 통계(학년별, 반별 1등)");
		Map<Integer, Map<Integer, Student5>> topStuByHakAndBan = 
				Stream.of(stuArr)
					.collect(groupingBy(Student5::getHak,
								groupingBy(Student5::getBan,
									collectingAndThen(
											maxBy(comparing(Student5::getScore))
											, Optional::get
									)
							)
					));
		
		for(Map<Integer, Student5> ban : topStuByHakAndBan.values())
			for(Student5 s : ban.values())
				System.out.println(s);
		
		System.out.println("6. 다중그룹화 + 통계(학년별, 반별 성적그룹)");
		Map<String, Set<Student5.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(groupingBy(s -> s.getHak() + "-" + s.getBan(),
						mapping(s -> {
							if(s.getScore() >= 200)
								return Student5.Level.HIGH;
							else if(s.getScore() >= 100)
								return Student5.Level.MID;
							else
								return Student5.Level.LOW;
						}, toSet())
				));
		
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key : keySet2) {
			System.out.println("[" +key + "]" + stuByScoreGroup.get(key));
		}
		
	}

}

class Student5{
	String name;
	boolean isMale;	// 성별
	int hak;		// 학년
	int ban;		// 반
	int score;
	
	Student5(String name, boolean isMale, int hak, int ban, int score) {
		super();
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	String getName() {
		return name;
	}

	boolean isMale() {
		return isMale;
	}

	int getHak() {
		return hak;
	}

	int getBan() {
		return ban;
	}

	int getScore() {
		return score;
	}

	public String toString() {
		return String.format("[%s, %s, %d학년 %d반, %3d점]", 
				name, isMale ? "남" : "여", hak, ban, score);
	}		
	
	enum Level {HIGH, MID, LOW};	// 성적을 상, 중, 하 세 단계로 분류
	
}