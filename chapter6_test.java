
public class chapter6_test {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
