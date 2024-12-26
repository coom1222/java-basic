package static2;

import static static2.DecoData.*;   // import static 은 정적 메서드 자체를 그냥 사용할거라고 선언.
//import static static2.DecoData.staticCall    이렇게 쓰면 클래스명을 안써도 선언 가능

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        staticCall();
    }
}
