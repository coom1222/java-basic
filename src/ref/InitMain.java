package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); // new 로 만드는 애들은 다 초기화가 된다.
        System.out.println("value1= " + data.value1);
        System.out.println("value2= " + data.value2);

    }
}
