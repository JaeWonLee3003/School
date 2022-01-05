package poly;

public class TEST01 {

	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		
		Dog chiwawa = new Dog();
		chiwawa.say();
		chiwawa.walk();
		
		System.out.println("---Dog---");
		d.say();
		d.walk();
		
		System.out.println("---Cat---");
		c.say();
		c.walk();
		//c.night();

	}

}
