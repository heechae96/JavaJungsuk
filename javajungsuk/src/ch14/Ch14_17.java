package ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class ConcatCollector implements Collector<String, StringBuilder, String> {
	@Override
	public Supplier<StringBuilder> supplier() {
		return () -> new StringBuilder();
//		return StringBuilder::new;
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		return (sb, s) -> sb.append(s);
//		return StringBuilder::append;
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		return sb -> sb.toString();
//		return StringBuilder::toString;
	}

	@Override
	public BinaryOperator<StringBuilder> combiner() {
		return (sb, sb2)-> {
			sb.append(sb2);
			return sb;
		};
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	}
}


public class Ch14_17 {

	public static void main(String[] args) {

		// Collector 구현하기
		
		String[] strArr = {"aaa", "bbb", "ccc"};
		Stream<String> strStream = Stream.of(strArr);
		
		String result = strStream.collect(new ConcatCollector());
		
		System.out.println(Arrays.toString(strArr));
		System.out.println("result = " + result);
		
	}

}


