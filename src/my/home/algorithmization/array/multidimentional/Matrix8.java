package my.home.algorithmization.array.multidimentional;

import java.util.Scanner;

//swap two columns of the matrix
public class Matrix8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]matrix = Calc.createMatrix(8, 8, 9);
		int column1;
		int column2;
		
		Calc.printMatrix(matrix);
		System.out.println();
		
		
			 column1 = inputScan("Enter number of the first column");
		 
		while(column1 > matrix[0].length-1) {
			System.out.println("Enter other number; the matrix has " + (matrix[0].length - 1) + " columns");
			column1 = inputScan("Enter number of the first column");
		}

			column2 = inputScan("Enter number of the second column"); 
			
		while(column2 > matrix[0].length-1) {
			column2 = inputScan("Enter number of the second column");
		}
		
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(j == column1) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[i][column2];
					matrix[i][column2] = temp;
				}
			}
		}
		
		Calc.printMatrix(matrix);

	}
	
	public static int inputScan(String message) {
		int value = 0;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);
		while (!scanner.hasNextInt()) {
			System.out.println(message);
			scanner.next();
		}

		value = scanner.nextInt();

		return value;

	}

}
