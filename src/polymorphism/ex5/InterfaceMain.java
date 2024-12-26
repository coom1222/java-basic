package polymorphism.ex5;

import polymorphism.ex4.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {
        // 인터페이스는 추상이므로 생성 불가
        // InterFaceAnimal interFaceAnimal = new InterFaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

    }


    private static void soundAnimal(InterFaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
