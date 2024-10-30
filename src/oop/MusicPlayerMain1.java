package oop;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume) ;
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이러를 종료합니다.");
    }
    // 순서대로 흘러가도록 단순하게 작성했다. 이는 절차지향 프로그래밍이다.
}
