package my.home.algorithmization.array.multidimentional;

//create matrix [10][15] with range [0; 15];
//print matrix;
//print numbers of strings, which contains three and more "5"
public class Matrix11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] matrix = Calc.createMatrix(10, 20, 15);
				
		Calc.printMatrix(matrix);
		
		for(int i = 0; i < matrix.length; i++) {
			int countFive = 0;
			
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 5) {
					countFive++;
				}
			}
			
			if(countFive >= 3) {
				System.out.println("String numbers: " + i + " ");
			} 
		}
	}

}
