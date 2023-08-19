package my.home.algorithmization.array.multidimentional;

//print column, if a[0] > a[n]
public class Matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = { { 2, 6, 5, 5, 3 }, 
							{ 4, 5, 6, 4, 8 }, 
							{ 1, 8, 3, 7, 5 }, 
							{ 9, 5, 7, 1, 2 }, 
				  			{ 9, 3, 6, 2, 5 } };

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				if (j % 2 == 0) {
					continue;
				}
				if (matrix[0][j] > matrix[matrix.length - 1][j]) {

					System.out.print(matrix[i][j] + " ");
				}

			}

			System.out.println();
		}

	}

}
