package my.home.algorithmization.decomposition;

// find the area of ​​the hexagon
public class Decomp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("The area is " + "%.2f", hexaSquare(10));

	}

	public static double hexaSquare(int sideLength) {
		return (sideLength * sideLength * 6) / (4 * Math.tan(Math.toRadians(180 / 6)));
	}

}
