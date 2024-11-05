package access;

// 접근제어자를 사용해서 데이터는 다 숨길것.
// 기능은 꼭 외부에 공개해야 하는것만 공개하고 나머지는 숨길것.

public class BankAccount {

    private int balance;    //

    // 생성은 퍼블릭으로 쉽게
    public BankAccount() {
        this.balance = 0;
        // balance = 0; 으로 해도 되겠지. 겹치는 변수가 없으니 굳이 this를 쓸 이유는 없다.
    }
    // public 메서드: deoposit
    public void deposit(int amount) {
        if (isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // Public 메서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드: getBalance
    public int getBalance() {
        return balance;
    }

    // 이 기능은 내부에서만 사용하므로 막았다.
    // 들어오는 금액이 정상적으로 들어오는지 검증하는 메서드
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
