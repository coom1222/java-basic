package static2.ex;

public class Car {

    private static int count;   // 공용으로 되어야 할것. 카운트니까
    private String name;    // 이름은 인스턴스마다 다 다름.

    public Car(String name) {
        System.out.println("차량 구입, 이름 : " + name);
        count++;
    }


    // 클래스에서 불렀으니 static 메소드
    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }


}
