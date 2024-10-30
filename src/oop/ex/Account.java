package oop.ex;

public class Account {
    int balance = 0;

    // 입금 매서드
    void deposit(int amount) {
        balance = balance + amount;
    }
    // 출금 매서드
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액부족!");
        } else {
            balance = balance - amount;
        }
    }
}
/*
은행 계좌를 객체로 설계해야 한다.
`Account` 클래스를 만들어라.
만약 잔액이 부족하면 **잔액 부족**을 출력해야 한다.*/
