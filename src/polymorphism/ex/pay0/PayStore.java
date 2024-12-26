package polymorphism.ex.pay0;

//결제수단 보관/관리 클래스
public abstract class PayStore {

    // 결제 수단 추가시 변하는 부분
    // findPay(String option) 메서드의 반환 타입이 Pay이므로
    // 이 메서드는 호출될 때 Pay 타입의 객체를 반환.
    public static Pay findPay(String option){
        if(option.equals("kakao")){ // 옵션이 카카오라면
            return new KakaoPay();
        } else if(option.equals("naver")){  // 옵션이 네이버라면
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
/*
Pay는 추상 클래스(또는 인터페이스)로, 모든 결제 수단 클래스의 부모 클래스입니다.
findPay 메서드는 Pay를 반환 타입으로 설정함으로써, 어떤 결제 수단이 선택되더라도
Pay 타입으로 받을 수 있도록 합니다.
 */