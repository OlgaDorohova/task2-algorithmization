package my.home.algorithmization.decomposition;

//find Square of the quadrilateral
public class Decomp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1;
		double y = 3;
		double z = 5;
		double t = 8;

		if (isExsist(x, y, z, t)) {
			System.out.printf("Square of the quadrilateral is " + "%.2f" + " cm.",
					findSquare(x, y, z, t));

		} else {
			System.out.println("The quadrilateral doesn't exist");
		}

	}

	public static boolean isExsist(double x, double y, double z, double t) {
		if (x + y + z > t) {
			if (y + z + t > x) {
				if (z + t + x > y) {
					if (t + x + y > z) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static double findSquare(double x, double y, double z, double t) {
		double p;
		double sRightTriangle;
		double sTriangle;
		double diagonal;

		diagonal = Math.sqrt(x * x + y * y);
		p = (diagonal + z + t) / 2;

		sRightTriangle = (x * y) / 2;

		sTriangle = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));

		return sTriangle + sRightTriangle;
	}

}
