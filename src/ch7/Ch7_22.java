//package ch7;
//
//import java.awt.*;
//
//public class Ch7_22 {
//    // 아래는 도형을 정의한 Shape클래스이다.
//    // 이 클래스를 조상으로 하는 Circle클래스와 Rectangle클래스를 작성하시오
//    // 이때, 생성자도 각 클래스에 맞게 적절히 추가해야 한다
//}
//
//// 클래스명: Circle
//// 조상클래스: Shape
//// 멤버변수: double r - 반지름
//class Circle extends Shape{
//    double r;   // 반지름
//    Circle(){
//
//    }
//
//    double calcArea(double r){
//        return r * r * 3.14;
//    }
//}
//
//// 클래스명: Rectangle
//// 조상클래스: Shape
//// 멤버변수: double width - 폭
////        double height - 높이
//// 메서드명: isSquare
//// 기능: 정사각형인지 아닌지를 알려준다
//// 반환타입: boolean
//// 매개변수: 없음
//class Rectangle extends Shape{
//    double width;   // 폭
//    double height;  // 높이
//    double calcArea(double width, double height){
//        return width * height;
//    }
//
//    boolean isSquare(){
//
//    }
//}
//
//abstract class Shape{
//    Point p;
//
//    Shape(){
//        this(new Point(0,0));
//    }
//
//    Shape(Point p){
//        this.p = p;
//    }
//
//    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
//
//    Point getPosition(){
//        return p;
//    }
//
//    void setPosition(Point p){
//        this.p = p;
//    }
//}
//
//class Point{
//    int x;
//    int y;
//
//    Point(){
//        this(0, 0);
//    }
//
//    Point(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//
//    public String toString(){
//        return "[" + x + ", " + "]";
//    }
//}
