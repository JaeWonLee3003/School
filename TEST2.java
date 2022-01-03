import day1.pack.BookVO;

public class TEST2 {

	public static void main(String[] args) {
		
		BookVO b = new BookVO();
		
		b.title = "성공하는 사람들의 7가지 습관";
		b.price = 9000;
		b.company = "창비";
		b.page = 100;
		
		System.out.println("책 제목 : " + b.title);
		System.out.println(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page+"\t");

	}

}
