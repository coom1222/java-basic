package static2.ex;

public class MathArrayUtils {
    // 메서드들밖에 없는 class다. main에서 객체를 생성해봐야 메모리 낭비이다.
    // 따라서 private으로 인스턴스생성을 막아주는 적절한 제약을 주는것이 좋다.
    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }


    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
       /* for (int i = 1; i < values.length; i++) {
            min = Math.min(min, values[i]);
        }*/
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            max = Math.max(max, values[i]);
        }
        return max;
    }

}
