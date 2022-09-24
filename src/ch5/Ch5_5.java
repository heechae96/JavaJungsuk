package ch5;

public class Ch5_5 {
    public static void main(String[] args) {
        // 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
        // Math.random()을 사용했기 때문에 실행결과와 다를 수 있다

        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for(int i=0; i<ballArr.length; i++){
            int j = (int)(Math.random() * ballArr.length);  // 0~8
            int tmp = 0;
            // (1)
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        // (2) for문 대신 메소드를 사용해볼것(1줄)
        for(int i=0; i<ball3.length; i++){
            ball3[i] = ballArr[i];
        }

        for(int i=0; i<ball3.length; i++){
            System.out.print(ball3[i]);
        }
    }
}
