package polymorphism.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        // 추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
