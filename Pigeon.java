package diagram;

public class Pigeon implements Flyable {

	@Override
	public void fly(int y) {
		// �Է� ���� y ��ŭ ���� y ���� �����ٰ�
		setY(getY()+y);

	}

	@Override
	public void flyMove() {
		// TODO Auto-generated method stub
		
	}
}
