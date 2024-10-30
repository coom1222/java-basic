package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("매서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA); // 메서드호출
        // 이러면 dataA의 참조값이 넘어간다.
        System.out.println("매서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
