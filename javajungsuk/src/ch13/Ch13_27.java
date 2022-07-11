package ch13;

import java.util.concurrent.*;

public class Ch13_27 {
	
	static final ForkJoinPool pool = new ForkJoinPool();	// 쓰레드 풀을 생성

	public static void main(String[] args) {

		// fork()와 join()
		
		long from = 1L, to = 100_000_000L;
		
		SumTask task = new SumTask(from, to);	
		
		long start = System.currentTimeMillis(); 	// 시작시간 초기화
		Long result = pool.invoke(task);			// compute를 invoke로
		System.out.println("Elapsed time(4 core): " 
							+ (System.currentTimeMillis()-start));
		
		System.out.printf("sum of %d ~ %d%n", from, to, result);
		System.out.println();
		
		result = 0L;
		start = System.currentTimeMillis();		// 시작시간 초기화
		for(long i=from; i<=to; i++) {
			result += i;
		}
		
		System.out.println("Elapsed time(1 core): " 
						+ (System.currentTimeMillis()-start));
		System.out.printf("sum of %d ~ %d%n", from, to, result);
	}

}

class SumTask extends RecursiveTask<Long>{
	long from, to;
	
	SumTask(long from, long to){
		this.from = from;
		this.to = to;
	}
	
	public Long compute() {
		long size = to - from + 1;	// from <= i <= to
		
		if(size <= 5){		// 더할 숫자가 5개 이하면
			return sum();	// 숫자의 합을 반환
		}
		
		long half = (from + to)/2;
		
		// 범위를 반으로 나눠서 두 개의 작업을 생성
		SumTask leftSum = new SumTask(from, half);
		SumTask rigthSum = new SumTask(half+1, to);
		
		leftSum.fork();
		
		return rigthSum.compute() + leftSum.join();
	}
	
	long sum() {
		// from ~ to 의 모든 숫자를 더한 결과를 반환
		long tmp = 0L;
		
		for(long i=from; i<=to; i++){
			tmp += i;
		}
		
		return tmp;
	}
}