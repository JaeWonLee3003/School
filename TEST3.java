import day1.pack.CustomerVO;

public class TEST3 {

	public static void main(String[] args) {
		
		 CustomerVO c = new CustomerVO();
		
		c.id = "customer A";
		c.pw = "customoer";
		c.nickname = "ȸ��1";
		c.classs =  1;
		
		System.out.println("ȸ�� ���̵� : " + c.id);
		System.out.println("ȸ�� ��й�ȣ  " + c.pw);
		System.out.println("ȸ�� �г��� : " + c.nickname + " ��");
		System.out.println("ȸ�� ��� : " + c.classs + " ���");

	}

}
