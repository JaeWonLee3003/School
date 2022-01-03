public class TEST4 {

	public static void sum(String[] args) {

		// 3개의 정수를 저장

		// 배열! 나란히 데이터를 묶을 수 있는 방법

		int[] array;
		array = new int[3];
		int sum = 0;

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		for (int i = 0; i < array.length; i++) {
			sum = array[0] + array[1] + array[2];

			System.out.println(sum);

		}

	}

}
