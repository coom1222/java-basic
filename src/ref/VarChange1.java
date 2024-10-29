package ref;

class MyData {
    int value;
}

public class VarChange1 {

    public static void main(String[] args) {
        MyData dataA = new MyData();
        dataA.value = 10;
        MyData dataB = dataA;

        System.out.println("dataA 참조값= " + dataA);  // 주소값이 나올 것
        System.out.println("dataB 참조값= " + dataB);  // 주소값이 나올 것
        System.out.println("dataA.value= " + dataA.value);
        System.out.println("dataB.value= " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value= " + dataA.value);
        System.out.println("dataB.value= " + dataB.value);

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value= " + dataA.value);
        System.out.println("dataB.value= " + dataB.value);

    }
}

