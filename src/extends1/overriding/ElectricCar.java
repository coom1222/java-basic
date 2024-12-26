package extends1.overriding;

public class ElectricCar extends Car {

    @Override   // 부모의 기능 재정의
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }

}
// 부모의 기능을 자식이 새로 재정의 하는것.

// @이 붙은 부분을 애노테이션이라 한다. 주석과 비슷한데, 프로그램이 읽을 수 있는 특별한 주석이다.
