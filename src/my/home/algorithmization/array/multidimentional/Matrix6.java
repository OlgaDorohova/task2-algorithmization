package my.home.algorithmization.array.multidimentional;

//create square even-size matrix 
//{{1, 1 ... 1},... {0, 1, ..., 1, 0}, {1, 1, ... 1}}
public class Matrix6 {
	public static void main(String [] args) {
		
		int size = 8;
		int [][] matrix = new int [size][size];
		
		for(int i = 0; i < matrix.length / 2; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(j >= i && j < matrix[i].length - i) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		for(int i = matrix.length / 2; i <matrix.length ; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(j <= i && j >= matrix[i].length - i - 1) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		
		Calc.printMatrix(matrix);
	}

}
