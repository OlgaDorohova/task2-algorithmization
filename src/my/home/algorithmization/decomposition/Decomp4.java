package my.home.algorithmization.decomposition;

//find the max length of the line 
//and output the coordinates of the points that the line lies  
public class Decomp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] points = { { 1, 2 }, { 5, 6 }, { 4, 8 }, { 7, 9 }, { 12, 0 }, { -5, 2 } };

		double res[][] = maxLinePoints(points);

		for (double[] da : res) {
			for (double d : da) {
				System.out.print(d + " ");
			}
			System.out.println();
		}

	}

	public static double[][] maxLinePoints(double[][] points) {
		double max = -1;
		int first = -1;
		int second = -1;

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double dPow = Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2);

				if (max < dPow) {
					max = dPow;
					first = i;
					second = j;
				}
			}
		}

		return new double[][] { points[first], points[second] };

	}
}
