package Ch6;

public class Ch6_3 {
    public static void main(String[] args) {
        // 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오
        // String   name    학생이름
        // int      ban     반
        // int      no      번호
        // int      kor     국어점수
        // int      eng     영어점수
        // int      math    수학점수
    }
}

// 6-3
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    // 6-4
    Student() {
    }

    // 6-5
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 6-5
    @Override
    public String toString() {
        return name +
                ", " + ban +
                ", " + no +
                ", " + kor +
                ", " + eng +
                ", " + math +
                ", " + getTotal() +
                ", " + getAverage();
    }

    // 6-4
    int getTotal() {
        return kor + eng + math;
    }

    // 6-4
    float getAverage() {
        // 평균: 78.666664
        int avg = (int) ((getTotal() / 3f + 0.05) * 10);   // 787
        float avg_float = avg / 10.f; // 78.7
        return avg_float;
    }

    // 6-5
    String info(){
        return toString();
    }
}
