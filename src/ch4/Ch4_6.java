package ch4;

public class Ch4_6 {
    public static void main(String[] args) {
        // 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        System.out.println("dice1 :" + dice1);
        System.out.println("dice2 :" + dice2);
    }
}
