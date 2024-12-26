package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20);  // ClassB를 상속받았으므로 이제 얘는 기본생성자가 없다. 따라서 super();을 생략할수도, 그냥 냅둘수도 없다.
        // 개발자가 따로 ClassB에 있는 형식에 맞추어 지정을 해주어야 한다.
        System.out.println("ClassC 생성자");
    }
}
