package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("1.bigData.count = " + bigData.count);
        System.out.println("1.bigData.data = " + bigData.data);

        // NullPointException
        System.out.println("bigData.data.value = " + bigData.data.value);
        //System.out.println("bigData.data.value = " + x001.null.value);
    }
}
