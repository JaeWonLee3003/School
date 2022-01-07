package diagram;

public class Pigeon implements Flyable {

	@Override
	public void fly(int y) {
		// 입력 받은 y 만큼 원래 y 값에 더해줄것
		setY(getY()+y);

	}

	@Override
	public void flyMove() {
		// TODO Auto-generated method stub
		
	}
}
