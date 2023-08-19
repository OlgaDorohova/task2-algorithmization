package my.home.algorithmization.decomposition;

//sum every next three array elements
public class Decomp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11 };
		int[] sum = sumThreeEl(array);

		for (int i : sum) {
			System.out.print(i + " ");
		}

	}

	public static int[] sumThreeEl(int[] array) {
		int[] sum = new int[array.length - 2];
		int j = 0;
		for (int i = 1; i < array.length; i++) {
			if (i + 1 < array.length) {
				sum[j] = array[i - 1] + array[i] + array[i + 1];
				j++;
			}
		}

		return sum;
	}

}
