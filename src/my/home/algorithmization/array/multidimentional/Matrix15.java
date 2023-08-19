package my.home.algorithmization.array.multidimentional;

//replace all odd matrix elements with the maximum element
public class Matrix15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = Calc.createMatrix(6, 8, 12);
		int max = maxMatrixElement(matrix);
		
		Calc.printMatrix(matrix);
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] % 2 != 0) {
					matrix[i][j] = max;
				}
			}
		}
		
		Calc.printMatrix(matrix);
		

	}
	
public static int maxMatrixElement(int [][]matrix) {
	if(matrix.length == 0) {
		System.out.print("Matrix is empty");
		return -1;
	}
	
	int max = matrix[0][0];
	
	for(int [] i: matrix) {
		for(int j: i) {
			if(max < j) {
				max = j;
			}
		}
	}
	return max;
}
}
