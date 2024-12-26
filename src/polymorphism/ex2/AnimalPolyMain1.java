package polymorphism.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        /*
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        얘도 가능하다.
         */

        // 부모는 자식을 담을 수 있다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
