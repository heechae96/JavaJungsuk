package ch6;

import java.util.Arrays;

public class Ch6_23 {
    // 다음과 같이 정의된 메서드를 작성하고 테스트 하시오

    // 메서드명 : max
    // 기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환
    //      만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환
    // 반환타입 : int
    // 매개변수 : int[] arr - 최대값을 구할 배열

    // max메서드를 작성하시오
    static int max(int[] arr) {
        int max = -1;
        if (arr == null || arr.length == 0) {
            max = -999999;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {  // 오름차순
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
                max = arr[arr.length - 1];  // 오름차순이므로 마지막이 최대값
                System.out.println(Arrays.toString(arr));
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{})); // 크기가 0인 배열
    }
}
