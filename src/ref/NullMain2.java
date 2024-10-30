package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10; // NullPointerException 발생.
        System.out.println("1. data = " + data);
        System.out.println("1. data = " + data.value);
    }
}
