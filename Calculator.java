package lastpang;

public class Calculator {
	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public int result(Operate op) {
		return op.operate(this.a, this.b);
	}

}
