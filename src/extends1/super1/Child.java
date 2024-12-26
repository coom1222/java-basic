package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);   // this 생략 가능, 생략하면 내꺼에서부터 찾고 없으면 부모에서 찾는다.
        System.out.println("super value = " + super.value);  // 부모에서 찾음

        this.hello();
        super.hello();
    }


}
