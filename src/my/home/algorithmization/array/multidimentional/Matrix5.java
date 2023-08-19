package my.home.algorithmization.array.multidimentional;

//create square even-size matrix 
//{{1, 1 ... 1},... {n-1, n , 0...0}, {n, 0... 0}}
public class Matrix5 {
	public static void main(String [] args) {
		
		int size = 6;
		int [][] matrix = new int [size][size];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(j < matrix[i].length - i) {
					matrix[i][j] = i + 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}
		
		Calc.printMatrix(matrix);
	}

}
