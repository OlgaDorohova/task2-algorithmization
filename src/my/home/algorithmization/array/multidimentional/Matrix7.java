package my.home.algorithmization.array.multidimentional;

//create square matrix a[i,j] = sin( (sqr(i) - sqr(j)) / size );
//count even elements 
public class Matrix7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 5;
		int evenCount = 0;
		double[][] matrix = new double[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = Math.sin((i * i - j * j) / size);

				if (matrix[i][j] > 0) {
					evenCount++;
				}

			}
		}
		
		Calc.printDecMatrix(matrix);
		
		System.out.println("The matrix contains " + evenCount + " even elements");

	}

}
