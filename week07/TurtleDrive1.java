package w7_2277;

/**
 * 거북이로 정사각형을 그리는 프로그램.
 * 앞의 TurtleDrive를 반복문을 써서 더 간단하게 변형하였다.
 * 
 * @author 조성혁
 */
public class TurtleDrive1 {

	public static void main(String[] args) {

		final double STEP = 0.4;	// 이동 거리
		final int ANGLE = 90;		// 회전 각도
		final int PAUSE = 1000;		// 일시 정지 시간. milisecond 단위

		// 생성자를 실행하여 거북이 인스턴스를 하나 생성한다.
		// (x, y)는 거북이의 초기 위치이며 theta는 거북이가 초기에 향하고 있는 방향이다.
		// 방향은 각도 단위이며 오른쪽이0도이고 위가 90도이다.
		// 평면의 왼쪽 아래 모서리 좌표는 (0.0, 0.0), 오른쪽 위 모서리 좌표는 (1.0, 1.0)이다.
		Turtle turtle  = new Turtle(0.3, 0.3, 0);	// (x, y, theta)

		for(int i=0; i<4; i++) {
			turtle.pause(PAUSE);
			turtle.goForward(STEP);
			turtle.turnLeft(ANGLE);
		}

		turtle.pause(PAUSE);
		turtle.pause(1000);

	}


}
