package my.home.algorithmization.array.multidimentional;



public class Calc {
	
	int[][] matrix = { { 5, 7, -1, -6, 2, 0 }, 
			   { -3, -1, 2, 6, 6, 1 }, 
			   { -2, -1, 2, -2, -1, 3 },
			   { 3, 5, -6, -3, -5, 4 }, 
			   { -1, -4, -3, 5, -2, -4 }, 
			   { 2, 6, -3, 1, 5, 4 } };

	public static int[][] createMatrix(int string, int column, int range) {
		int[][] matrix = new int[string][column];
		for (int i = 0; i < string; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = (int) (Math.random() * range + 1);
			}
		}

		return matrix;
	}
	
	public static int[][] createMatrixRange(int string, int column, 
											int rangeStart, int rangeEnd) {
		int[][] matrix = new int[string][column];
		for (int i = 0; i < string; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = (int) (Math.random() * (rangeEnd - rangeStart + 1) + rangeStart);
			}
		}

		return matrix;
	}

	public static void printMatrix(int[][] m) {
		for (int[] i : m) {
			for (int j : i) {
				
				if (j >= 0 && j < 10) {
					System.out.print(j + "   ");
				} else {
					System.out.print(j + "  ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printDecMatrix(double[][] matrix) {
		for (double[] d : matrix) {
			for (double dd : d) {
				System.out.printf("%.4f ", dd);
			}

			System.out.println();
		}

		System.out.println();
	}

	
}
