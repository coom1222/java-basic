package polymorphism.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자시 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 다운캐스팅(부모 타임 -> 자식타입)
        Child child = (Child) poly; // x001
        child.childMethod();
    }
}
/*
Child child = (Child) poly //다운캐스팅을 통해 부모타입을 자식 타입으로 변환한 다음에 대입 시도
Child child = (Child) x001 //참조값을 읽은 다음 자식 타입으로 지정
Child child = x001 //최종 결과
 */