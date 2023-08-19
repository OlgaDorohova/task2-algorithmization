package my.home.algorithmization.array.multidimentional;

//create a magic square
public class Matrix16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = create(9);

		if (isSquareMagic(matrix)) {
			Calc.printMatrix(matrix);
		}
	}

	public static int[][] create(int size) {
		int matr[][] = new int[size][size];

		if (size % 2 == 1) {

			return matr = createOddMagicSq(size);
		}

		if (size % 4 == 0) {
			return matr = createEvenEvenMagicSquare(size);
		}

		matr = magicSquareOfEvenOddOrder(size);

		return matr;
	}

	public static int[][] createOddMagicSq(int size) {

		int[][] mtx = new int[size][size];
		int center = (size * size + 1) / 2;
		int max = size * size;

		// fill out the main diagonal
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				if (i == j) {
					mtx[i][j] = (size / 2 + 1) + size * i;
				}
			}
		}

		// fill in other diagonals
		for (int i = 0; i < mtx.length - 2; i++) {
			for (int j = 0; j < mtx.length - 2; j++) {
				if (mtx[i][j] != 0) {

					mtx[i][j + 2] = mtx[i][j] + size + 1;
					mtx[i + 2][j] = mtx[i][j] + size - 1;

				}
			}
		}

		// finish the magic square
		int temp;
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				if (mtx[i][j] == 0) {

					if (i > j) {
						temp = mtx[i][j + 1] - center;
						mtx[i][j] = (temp > 0) ? temp : max + temp;
					}

					if (i < j) {
						temp = mtx[i][j - 1] + center;
						mtx[i][j] = (temp < max) ? temp : temp - max;
					}
				}
			}
		}

		return mtx;
	}

	public static int[][] createEvenEvenMagicSquare(int size) {
		int[][] mtx = new int[size][size];
		int[][] auxMtx = new int[size][size];
		int c;

		// create base matrix
		c = 1;
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				mtx[i][j] = c;
				c++;
			}
		}

		// create auxiliary matrix
		c = size * size;
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				auxMtx[i][j] = c;
				c--;
			}
		}

		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {

				if ((i < size / 2 && j < size / 2) || (i >= size / 2 && j >= size / 2)) {
					if ((i + j) % 2 != 0) {
						mtx[i][j] = 0;
					}
				} else {
					if ((i + j) % 2 == 0) {
						mtx[i][j] = 0;
					}
				}

			}
		}

		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				if (mtx[i][j] == 0) {
					mtx[i][j] = auxMtx[i][j];
				}
			}
		}

		return mtx;
	}

	public static int[][] createEvenOddMagicSquare(int size) {
		int[][] mtx = new int[size][size];
		int[][] auxMtx = new int[size][size];
		int c;

		// create base matrix
		c = 1;
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				mtx[i][j] = c;
				c++;
			}
		}

		// create auxiliary matrix
		c = size * size;
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				auxMtx[i][j] = c;
				c--;
			}
		}

		// Calc.printMatrix(auxMtx);
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				if ((i == j) || ((i + j) == (mtx.length - 1))) {
					mtx[i][j] = 0;
				}

				if (i < size / 2) {
					if (j < size / 2 && i + j == size / 2 - 1) {
						mtx[i][j] = 0;
					}
					if (j >= size / 2 && j - i == size / 2) {
						mtx[i][j] = 0;
					}
				}

				if (i >= size / 2) {
					if (j < size / 2 && i - j == size / 2) {
						mtx[i][j] = 0;
					}
					if (j >= size / 2 && i - j == size / 2 - 1) {
						mtx[i][j] = 0;
					}
				}

			}
		}

		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx.length; j++) {
				if (mtx[i][j] == 0) {
					mtx[i][j] = auxMtx[i][j];
				}
			}
		}

		return mtx;
	}

	public static boolean isSquareMagic(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int sumCol = 0;
			int sumStr = 0;
			int sumDia = 0;

			for (int j = 0; j < matrix.length; j++) {
				sumStr += matrix[i][j];
				sumCol += matrix[j][i];
				sumDia += matrix[j][j];
			}

			if (sumCol != sumStr || sumCol != sumDia || sumStr != sumDia) {
				System.out.println("Square isn't magic");
				System.out.println("String " + i);
				return false;
			}
		}
		System.out.println("Square is magic");
		return true;
	}

	private static int[][] magicSquareOfEvenOddOrder(int n) {
		
		int half = n / 2;

		int[][] matrix = new int[n][n];
		int[][] tempMatrix;
		tempMatrix = createOddMagicSq(half);

		// 1/4 matrix
		for (int i = 0; i < half; i++) {
			for (int j = 0; j < half; j++) {
				matrix[i][j] = tempMatrix[i][j];
			}
		}
		// 2/4 matrix
		for (int i = 0; i < half; i++) {
			for (int j = half; j < n; j++) {
				int x = j - half;
				matrix[i][j] = (tempMatrix[i][x] + 2 * half * half);
			}
		}
		// 3/4 matrix
		for (int i = half; i < n; i++) {
			for (int j = 0; j < half; j++) {
				int x = i - half;

				matrix[i][j] = (tempMatrix[x][j] + 3 * half * half);
			}
		}
		// 4/4 matrix
		for (int i = half; i < n; i++) {
			for (int j = half; j < n; j++) {
				int x = i - half, y = j - half;
				matrix[i][j] = (tempMatrix[x][y] + half * half);
			}
		}
		int move = 0;
		for (int i = 6; i < n; i++) {
			if ((i % 4 != 0) && (i % 2 == 0))
				move++;
		}
		for (int j = matrix.length / 2 - move; j <= matrix.length / 2 + move - 1; j++) {
			for (int i = 0; i < tempMatrix.length; i++) {

				int key = matrix[i][j];
				matrix[i][j] = matrix[half + i][j];
				matrix[half + i][j] = key;
			}
		}
		for (int j = 0; j <= 1; j++) {
			if (j == 0) {
				int key = matrix[0][0];
				matrix[0][0] = matrix[half][0];
				matrix[half][0] = key;
			}
			if (j == 1) {
				int key = matrix[half - 1][0];
				matrix[half - 1][0] = matrix[n - 1][0];
				matrix[n - 1][0] = key;
			}
		}
		for (int j = half + 1; j < n - 1; j++) {
			for (int i = 1; i < half - 1; i++) {
				int key = matrix[i][1];
				matrix[i][1] = matrix[half + i][1];
				matrix[half + i][1] = key;
			}
		}
		return matrix;
	}
}
