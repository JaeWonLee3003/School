package day2;


public class TEST7 {

	public static void main(String[] args) {

      int a = 10;
      System.out.println("1�� ��� : " +a);
      addTen(a);
      System.out.println("4�� �Լ� ���� ��  : " + a);
		

	}
	private static void addTen(int x) {
		System.out.println("2�� �Լ��� ���޵� x�� : " +x);
		x += 10;
		System.out.println("3�� �Լ� ���ο��� ������ ����� x�� : "+x);
		
	}

}
