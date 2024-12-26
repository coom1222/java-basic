package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println(("A count=" + Data3.count)); // 클래스명.변수

        Data3 data2 = new Data3("B");
        System.out.println(("B count=" + Data3.count));

        Data3 data3 = new Data3("C");
        System.out.println(("C count=" + Data3.count));

        // 추가
        Data3 data4 = new Data3("D");
        System.out.println(Data3.count);    // 이러면 count가 인스턴스변수인가? 라는 생각이 들 수도 있다. 오해가 가능하다.

        // Data3 data4 -> Data3 타입의 인스턴스(객체)를 받을 수 있다. Int 는 정수, String은 문자열을 받을 수 있는 것처럼

        // 클래스를 통한 접근
        System.out.println(Data3.count);


    }
}

// static 변수는 클래스인 붕어빵 틀이 특별히 관리하는 변수. 붕어빵 틀은 한개. 인스턴스인 붕어빵은 인스턴스의 수 만큼
// 여러 인스턴스에서 공용으로 사용하는 붕어빵 틀 -> static 변수