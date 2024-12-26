package polymorphism.ex.pay0;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true){
            System.out.println("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();
            if (option.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                return;
            }
            System.out.println("결제금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(option, amount);
        }

        /*//kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //예외처리
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);*/
    }
}
