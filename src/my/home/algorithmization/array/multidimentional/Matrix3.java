package my.home.algorithmization.array.multidimentional;

//output k-column and p-string of the array
public class Matrix3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = Calc.createMatrix(5, 6, 9);
		int column = 3;
		int string = 4;
		
		Calc.printMatrix(matrix);
		
		System.out.println();

		if (string < matrix.length) {
			for (int i = 0; i < matrix.length; i++) {
				if (column < matrix[i].length) {
					for (int j = 0; j < matrix[i].length; j++) {
						if (i == string || j == column) {
							System.out.print(matrix[i][j] + " ");
						} 
					}
					System.out.println();
				} else
					System.out.println("Column number is bigger than matrix size");
			}
		} else
			System.out.println("Column number is bigger than matrix size");

	}

}
