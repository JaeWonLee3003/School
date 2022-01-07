
public class Penguin implements Flyable, Singable {

	@Override
	public void sing() {
		System.out.println("삥삥");

	}

	@Override
	public void fly() {
		System.out.println(" 바다에서만 날 수 있어요.");

	}

}
