package diagram;

public class Kevin extends Human implements Programmer, Swimable {

	public static void main(String[] args) {

	}

	@Override
	public void swimDown(int y) {
	  if(getY() < - 20) {
		  System.out.println("으악 나주거");
	  }
	
	}

	@Override
	public void coding() {
		System.out.println("자바가 진짜 최고 마크업? 그런거 왜 해.");

	}

}
