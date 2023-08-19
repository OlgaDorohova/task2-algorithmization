package my.home.algorithmization.array.multidimentional;

//count sum of elements in the every column
public class Matrix9 {
	public static void main(String[] args) {

		int[][] matrix = Calc.createMatrix(4, 4, 9);
		int[] sum = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum[j] = matrix[i][j];

			}
		}

		Calc.printMatrix(matrix);
		System.out.println();

		printArray(sum);

		System.out.println("Max sum is in " + maxNum(sum) + " column");

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Sum of the elements in " + i + " column: " + arr[i]);
		}
		System.out.println();
	}

	public static int maxNum(int[] arr) {
		int max = arr[0];
		int index = 0;

		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				index = i;
				break;
			}
		}

		return index;
	}

}
