package my.home.algorithmization.array.multidimentional;

public class Matrix13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = Calc.createMatrix(6, 6, 9); 
		Calc.printMatrix(matrix);
		System.out.println();
		
		sortMatrixColumnIncr(matrix);	
		Calc.printMatrix(matrix);
			
		sortMatrixColumnDecr(matrix);
		Calc.printMatrix(matrix);

	}

	
	public static void sortMatrixColumnIncr(int [][] matrix) {
		boolean isSort = false;
		int temp = 0;
		int i = 0;
		while(!isSort) {
			isSort = true;
			for(int j = 0; j < matrix[i].length; j++) {
				i = 0;
				while(i < matrix.length -1) {
					if(matrix[i][j] > matrix[i+1][j]) {
						isSort = false;
						temp = matrix[i+1][j];
						matrix[i+1][j] = matrix[i][j];
						matrix[i][j] = temp;
					}
				i++;
				}
			}
		}
	}
	
	
	public static void sortMatrixColumnDecr(int [][] matrix) {
		boolean isSort = false;
		int temp = 0;
		int i = 0;
		while(!isSort) {
			isSort = true;
			for(int j = 0; j < matrix[i].length; j++) {
				i = 0;
				while(i < matrix.length -1) {
					if(matrix[i][j] < matrix[i+1][j]) {
						isSort = false;
						temp = matrix[i+1][j];
						matrix[i+1][j] = matrix[i][j];
						matrix[i][j] = temp;
					}
				i++;
				}
			}
		}
	}
	
}
