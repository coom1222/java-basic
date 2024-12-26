package final1;

public class ConstructInit {

    final int value;

    // final을 필드에 사용할 경우엔 생성자를 통해 한번 초기화 할 수 있다.
    public ConstructInit(int value) {
        this.value = value;
    }
}
