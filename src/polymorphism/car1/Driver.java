package polymorphism.car1;

public class Driver {

    private Car car;    // Driver는 멤버변수로 car를 가진다.

    // 외부에서 누군가 이 메서드를 호출해주어야 Driver는 새로운 자동차를 참조하거나 변경할 수 있다.
    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelerator();
        car.stopEngine();
    }
}
