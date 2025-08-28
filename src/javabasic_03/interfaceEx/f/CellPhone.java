package javabasic_03.interfaceEx.f;

public class CellPhone {
    String model;       // 핸드폰 모델 번호
    double battery;     // 남은 배터리 양

    // 생성자
    public CellPhone(String model) {
        this.model = model;
        this.battery = 0; // 초기 배터리 양은 0
    }

    // 통화
    public void call(int time) {
        if (time <= 0) {
            throw new IllegalArgumentException("통화시간입력오류");
        }
        System.out.println("통화 시간 : " + time + "분");

        // 배터리 감소량 계산
        battery -= time * 0.5;
        if (battery < 0) {
            battery = 0;
        }
    }

    // 충전
    public void charge(int time) {
        if (time <= 0) {
            throw new IllegalArgumentException("충전시간입력오류");
        }
        System.out.println("충전 시간 : " + time + "분");

        // 배터리 증가량 계산
        battery += time * 3;
        if (battery > 100) {
            battery = 100;
        }
    }

    // 배터리 출력
    public void printBattery() {
        System.out.println("남은 배터리 양 : " + battery);
    }
}
