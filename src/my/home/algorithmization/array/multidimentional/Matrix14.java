package my.home.algorithmization.array.multidimentional;

//create matrix[N][M] that 0th column has null element = 1, 1st has one el = 1,
//Mth has (m - 1) elements
public class Matrix14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int string = 10;
		int column = 7;
		int [][] matrix = new int [string][column];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j< matrix[i].length; j++) {
				if(j <= i) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = 1;
				}
			}
		}
		
		Calc.printMatrix(matrix);

	}

}
