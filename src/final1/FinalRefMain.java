package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();   // 참조형을 final로 선언, 변수 선언 시점에 참조값을 할당했으므로 더는 참조값을 변경할 수 없다.
        // data = new Data(); //final 변경 불가 컴파일 오류

        // 하지만 참조 대상의 객체 값은 바꿀 수 있다.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
