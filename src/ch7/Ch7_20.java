package ch7;

public class Ch7_20 {
    // 다음의 코드를 실행한 결과를 적으시오

    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x = " + p.x); // 100
        p.method(); // Parent2 Method

        System.out.println("c.x = " + c.x); // 200
        c.method(); // Child2 Method
    }
}

class Parent2 {
    int x = 100;

    void method() {
        System.out.println("Parent2 Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;

    void method() {
        System.out.println("Child2 Method");
    }
}
