package day2;


public class TEST9 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int c = 20;
		int d = 30;
//		System.out.println(a+b);
		System.out.println(add(a, b));
//		System.out.println(a-b);
		System.out.println(min(a, b));
//		System.out.println(a*b);
		System.out.println(multi(a, b));
//		System.out.println(a/b);
		System.out.println(divide(a, b));

	}

	public static int add(int x, int y) {
		return x + y;
	};

	public static int min(int x, int y) {
		return x - y;
	};

	public static int multi(int x, int y) {
		return x * y;
	};

	public static int divide(int x, int y) {
		return x / y;
	};
}
