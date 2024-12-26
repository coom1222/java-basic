package polymorphism.ex5;

public class Cow implements InterFaceAnimal{

    @Override
    public void sound() {
        System.out.println("음메 ");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
