public class TEST5 {

	public static void main(String[] args) {

		int[][] star = new int[5][];
		star[0] = new int[1];
		star[0] = new int[2];
		star[0] = new int[3];
		star[0] = new int[4];
		star[0] = new int[5];
		
		for (int row = 0; row<star[row].length; row++) {
			for (int col = 0; col < star.length; col++) {
				star[row][col] = '*';
				System.out.println((char)star[row][col]);
				
			}
			System.out.println();
		}

		
		System.out.println(star);
		
	}

}
