import day1.pack.BookVO;

public class TEST2 {

	public static void main(String[] args) {
		
		BookVO b = new BookVO();
		
		b.title = "�����ϴ� ������� 7���� ����";
		b.price = 9000;
		b.company = "â��";
		b.page = 100;
		
		System.out.println("å ���� : " + b.title);
		System.out.println(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page+"\t");

	}

}
