public class TEST4 {

	public static void sum(String[] args) {

		// 3���� ������ ����

		// �迭! ������ �����͸� ���� �� �ִ� ���

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
