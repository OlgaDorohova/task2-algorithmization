package my.home.algorithmization.array.multidimentional;

//return positive elements of the square matrix main diagonal 
public class Matrix10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matrix = Calc.createMatrixRange(8, 8, -5, 5) ;

		Calc.printMatrix(matrix);
		System.out.println();
		

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j && matrix[i][j] > 0) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}

	}

}
