package polymorphism.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        Animal [] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};
        // inLine Variable : opt + cmd + N
        // 변수 선언된 걸 제거하고 합칠 수 있다.

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 코드범위 선택 후 opt + cmd + M 으로 메소드 생성 가능
    // 변하지 않은 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
/*
새로운 기능이 추가되었을 때 변하는 부분을 최소화 하는 것이 잘 작성된 코드이다. 이렇게 하기 위해서는 코드에서 변
하는 부분과 변하지 않는 부분을 명확하게 구분하는 것이 좋다.
-> 샷건 효과 : 초탄이 어디까지 퍼지냐
 */