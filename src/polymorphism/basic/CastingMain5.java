package polymorphism.basic;

public class CastingMain5 {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 call");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 call");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child) {
            Child c = new Child();
            System.out.println("Child 인스턴스입니다.");
            child.childMethod();
        } else{
            System.out.println("Child 인스턴스 아님");
        }
    }
}
