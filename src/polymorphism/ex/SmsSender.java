package polymorphism.ex;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS을 발송합니다 : " + message);
    }
}
