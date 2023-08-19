package my.home.algorithmization.array.sort;

//show the places where the elements of another array should occupy
public class Sort7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arrayB = { 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 15, 16 };

		int k = 0;
		int j = 1;
		int index = 0;

		for (int i = 0; i < arrayB.length; i++) {
			for (; j < arrayA.length; j++) {

				if (index > arrayA.length || arrayB[i] >= arrayA[arrayA.length - 1]) {
					while (i < arrayB.length) {

						index = arrayA.length + k;
						System.out.print((index) + " ");
						k++;
						i++;
					}
					return;
				}
				if (arrayB[i] >= arrayA[j - 1] && arrayB[i] < arrayA[j]) {
					index = j + k;
					System.out.print((index) + " ");
					k++;
					break;
				}

			}
		}

	}

}
