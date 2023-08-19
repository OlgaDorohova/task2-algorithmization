package my.home.algorithmization.array.multidimentional;

//print diagonal elements
public class Matrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = Calc.createMatrix(5, 5, 9);

		Calc.printMatrix(matrix);

		System.out.println();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

	}

}
