package ch4;

public class Ch4_12 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            System.out.println();
            for(int j=2; j<=4; j++) {
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
        }
        System.out.println();
        for(int i=1; i<=3; i++){
            System.out.println();
            for(int j=5; j<=7; j++) {
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
        }
        System.out.println();
        for(int i=1; i<=3; i++){
            System.out.println();
            for(int j=8; j<=9; j++) {
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
        }
    }
}
