package oop;

public class ValueData {
    // 데이터도 여기있고
    int value;

    // 기능도 여기있다.
    void add() {
        value++;
        System.out.println("숫자 증가 value= " + value);
    }

    // 메서드는 객체를 생성해야 호출할 수 있다. 그러나 static이 붙으면 객체를 생성하지 않고도 메서드를 호출 할 수 있다.

}
