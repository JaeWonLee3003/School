import day1.pack.CustomerVO;

public class TEST3 {

	public static void main(String[] args) {
		
		 CustomerVO c = new CustomerVO();
		
		c.id = "customer A";
		c.pw = "customoer";
		c.nickname = "회원1";
		c.classs =  1;
		
		System.out.println("회원 아이디 : " + c.id);
		System.out.println("회원 비밀번호  " + c.pw);
		System.out.println("회원 닉네임 : " + c.nickname + " 님");
		System.out.println("회원 등급 : " + c.classs + " 등급");

	}

}
