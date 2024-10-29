package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        MyData dataA = new MyData();
        dataA.value = 10;
        System.out.println("매서드 호출 전: dataA.value = " + dataA.value);

        changeReference(dataA); // 메서드호출


        System.out.println("매서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(MyData dataX) {
        dataX.value = 20;
    }
}
