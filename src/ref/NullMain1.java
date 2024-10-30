package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);    // null은 참조할 게 없어
        data = new Data();
        System.out.println("2. data = " + data);    // 생성하면서 초기화 하므로 어떤 값을 생성한다.
        data = null;
        System.out.println("3. data = " + data);    // 다시 초기화
    }
}
