package polymorphism.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 다형적 참조: 부모는 자식을 품을 수 있다.
        System.out.println("Parent -> Parent");
        Parent poly = new Child();  // 부모타입은 자식을 참조할 수 있다.
        // Child를 생성했으므로 부모와 자식 다 생성된다. 이를 부모 타입의 변수인 poly에 담아둔다.
        // 부모는 자식을 담을 수 있는걸 자바는 허락해준다.
        poly.parentMethod();

        // Child child = new Parent(); // 컴파일 오류. 자식은 부모를 담을 수 없다.
        // poly.childMethod(); // poly는 parent타입이다. parent타입은 자기 자신만 담고있기에 불가능하다.
    }
}
