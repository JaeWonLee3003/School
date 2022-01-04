package day2;


public class TEST7 {

	public static void main(String[] args) {

      int a = 10;
      System.out.println("1번 경우 : " +a);
      addTen(a);
      System.out.println("4번 함수 실행 후  : " + a);
		

	}
	private static void addTen(int x) {
		System.out.println("2번 함수에 전달된 x값 : " +x);
		x += 10;
		System.out.println("3번 함수 내부에서 연산이 진행된 x값 : "+x);
		
	}

}
