package static2;

// 스태틱은 스태틱만 접근 가능하나, 인스턴스 메서드는 인스턴스 변수, 인스턴스 메서드 다 접근 가능하다(접근지정자만 허락한다면)
public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        //instanceValue++;    // 인스턴스 변수 접근, 컴파일 에러
        //instanceMethod();   // 인스턴스 메서드 접근, 컴파일 에러


        staticValue++;  // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;      // Deco.staticValue++ 와 같은코드. 자기 클래스 내에 있는것이므로 당연히 접근가능
        staticMethod();
    }

    public void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }
}
