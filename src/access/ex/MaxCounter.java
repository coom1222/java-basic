package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다. 최대값은 " + max + "입니다.");
            return; // 해줘야 밑으로 내려가서 카운트가 안된다.
        }
        // 실행 로직
        // 검증을 통과 못하면 실행을 못하도록
        count++;
    }

    public int getCount() {
        return count;
    }

}
