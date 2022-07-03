package ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")	// 유효하지 않은 애너테이션은 무시
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101", hhmmss="235959"))
public class Ch12_13 {

	public static void main(String[] args) {

		// 애너테이션
		// 메타 애너테이션 
		
		// Ch12_13의 Class객체를 얻는다
		Class<Ch12_13> cls = Ch12_13.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = " 
												+ anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = " 
												+ anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
			System.out.println("testTools = " + str);
		System.out.println();
		
		// Ch12_13에 적용된 모든 애너테이션을 가져온다
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println();
	}

}

@Retention(RetentionPolicy.RUNTIME)	// 실행 시에 사용가능 하도록 지정
@interface TestInfo{
	int 		count() 	default 1;
	String 		testedBy();
	String[] 	testTools() default "Junit";
	TestType 	testType() 	default TestType.FIRST;
	DateTime 	testDate();
}

@Retention(RetentionPolicy.RUNTIME)	// 실행 시에 사용가능 하도록 지정
@interface DateTime{
	String yymmdd();
	String hhmmss();
}

enum TestType {FIRST, FINAL}