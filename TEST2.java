package poly;

import poly.*;

public class TEST2 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();

		Animal[] r = new Animal[2];
		r[0] = new Dog();
		r[1] = new Cat();
		// r[0].say();
		// r[1].say();

		showAnimal(r); // -> 함수 구하기

		// show(d);
		// show(c);

	}

	private static void showAnimal(Animal[] r) {
		for (int i = 0; i < r.length; i++) {
			r[i].say();
			r[i].walk();

		}
	}
}