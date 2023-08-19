package my.home.algorithmization.array.multidimentional;

//create square matrix {{1...n}, {n...1}, ...},array element step = 1
public class Matrix4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 6;
		
		int [][] matrix = new int[size][size];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0, k = matrix[i].length; 
					j < matrix[i].length; 
					j++, k--) {
				if(i % 2 == 0) {
					matrix[i][j] = j + 1;
				} else {
					matrix[i][j] = k;
				}
			}
		}
		
		Calc.printMatrix(matrix);
	}

}
