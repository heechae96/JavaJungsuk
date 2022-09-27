package ch7;

public class Ch7_15 {
    // 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오)
    class Unit{}
    class AirUnit extends Unit{}
    class GroundUnit extends Unit{}
    class Tank extends GroundUnit{}
    class AirCraft extends AirUnit{}

    Unit u = new GroundUnit();
    Tank t = new Tank();
    AirCraft ac = new AirCraft();

    // a. u = (Unit)ac;
    // b. u = ac;
    // c. GroundUnit gu = (GroundUnit)u;
    // d. AirUnit au = ac;
    // e. (Tank)u;
    // f. GroundUnit gu = t;

    // 답: c
    //  -> u에는 ac(AirCraft)가 담겨져 있는데 이를 GroundUnit으로 형변환 할 수 없음
    // 답: e
    //  -> u에는 ac(AirCraft)가 담겨져 있는데 이를 Tank로 형변환 할 수 없음
}
