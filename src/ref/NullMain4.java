package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();  // 참조할곳이 없다면 참조할 곳을 주면 된다.
        System.out.println("1.bigData.count = " + bigData.count);
        System.out.println("1.bigData.data = " + bigData.data);

        // NullPointException
        System.out.println("bigData.data.value = " + bigData.data.value);
        //System.out.println("bigData.data.value = " + x001.null.value);
    }
}
