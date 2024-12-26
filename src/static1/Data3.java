package static1;

public class Data3 {
    public String name; // 얘는 멤버 변수
    public static int count;   // static
    // 멤버 변수에 static을 붙이게 되면 static변수, 정적변수 또는 클래스 변수(클래스에 소속되어있음)라 한다.
    // static변수는 여러곳에서 공유하는 목적

    public Data3(String name) {
        this.name = name;
        count++;    // 객체가 생성되면 정적 변수 count의 값을 하나 증가시킨다.
        // Data3.count라 쓰는게 맞지만 자신의 클래스에 있는 정적변수라면 클래스명을 생략할 수 있다.
    }
}
