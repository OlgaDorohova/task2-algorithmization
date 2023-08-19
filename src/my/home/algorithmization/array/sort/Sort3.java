package my.home.algorithmization.array.sort;

// selection sort
public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 3, 8, 9, 11, 15, 16, 18 };
		int i = 0;
		int temp = 0;
		while (i < array.length / 2) {
			// if (array[i] < array[array.length - 1-i]) {
			temp = array[i];
			array[i] = array[array.length -1 - i];
			array[array.length - 1 - i] = temp;
			i++;

			// }

		}

		MyUtil.printArray(array);
	}

}
