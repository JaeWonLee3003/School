package diagram;

public class Kevin extends Human implements Programmer, Swimable {

	public static void main(String[] args) {

	}

	@Override
	public void swimDown(int y) {
	  if(getY() < - 20) {
		  System.out.println("���� ���ְ�");
	  }
	
	}

	@Override
	public void coding() {
		System.out.println("�ڹٰ� ��¥ �ְ� ��ũ��? �׷��� �� ��.");

	}

}
