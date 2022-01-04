

public class TEST11 {

	public static void main(String[] args) {
    
		int a = 30;
		int b = 50;
		TEST11 t = new TEST11();
		
		int result = t.add(a,b);
		System.out.println(result);
	
	}

	private int add(int a, int b) {
		
		return a+b;
	}
}
