package my.home.algorithmization.array.multidimentional;

public class Matrix12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = Calc.createMatrix(5, 5, 9);

		Calc.printMatrix(matrix);
		System.out.println();

		sortMatrixStringIncr(matrix);
		Calc.printMatrix(matrix);
		System.out.println();
		
		sortMatrixStringDecr(matrix);
		Calc.printMatrix(matrix);

	}

	private static void sortMatrixStringIncr(int[][] matrix) {
		boolean isSort;
		int temp;

		for (int i = 0; i < matrix.length; i++) {

			isSort = true;

			while (isSort) {
				isSort = false;
				for (int j = 0; j < matrix[i].length - 1; j++) {

					if (matrix[i][j] > matrix[i][j + 1]) {
						temp = matrix[i][j];
						matrix[i][j] = matrix[i][j + 1];
						matrix[i][j + 1] = temp;
						isSort = true;
					}
				}
			}
		}
	}
	
	private static void sortMatrixStringDecr(int[][] matrix) {
		boolean isSort;
		int temp;

		for (int i = 0; i < matrix.length; i++) {

			isSort = true;

			while (isSort) {
				isSort = false;
				for (int j = 0; j < matrix[i].length - 1; j++) {

					if (matrix[i][j] < matrix[i][j + 1]) {
						temp = matrix[i][j];
						matrix[i][j] = matrix[i][j + 1];
						matrix[i][j + 1] = temp;
						isSort = true;
					}
				}
			}
		}
	}

}
