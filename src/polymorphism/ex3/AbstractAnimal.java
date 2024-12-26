package polymorphism.ex3;

public abstract class AbstractAnimal {

    public abstract void sound();   // 불완전한 메서드(실체가 존재하지 않는 추상적인 메서드)
    // 이 메서드는 자식이 반드시 오버라이딩 해야한다.

    // 추상클래스가 하나라도 있으면 그 클래스는 추상 클래스로 선언해야 한다.
    // 추상메서드를 상속받는 애는 반드시 오버라이딩 해야한다. 안그러면 컴파일 오류가 발생한다.

    // move() 메서드는 추상메서드가 아니므로 꼭 자식클래스가 오버라이딩 하지 않아도 된다.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
