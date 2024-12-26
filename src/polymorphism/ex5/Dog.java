package polymorphism.ex5;

public class Dog implements InterFaceAnimal {
// 부모를 물려받았더니 다 구현해야 한다. 그래서 implemetns 키워드를 쓴다.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
