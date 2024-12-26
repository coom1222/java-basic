package polymorphism.basic;

// upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child;    // 업캐스팅은 생략 가능, 생략 권장. 아니 그냥 생략이 맞음.
        // Parent parent1 = (Parent) child;   -> 위랑 똑같은 코드다. 부모는 자식을 담을 수 있으므로
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
