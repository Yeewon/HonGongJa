package sec02.exam03;

public class Car {
	// 필드
	// 4개의 타이어를 가짐
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);

	// 생성자

	// 메소드
	// 각타이어의 roll()호출, 펑크가 나면 stop()
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		;
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		;
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		;
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		;
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
