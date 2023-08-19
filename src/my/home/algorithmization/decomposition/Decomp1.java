package my.home.algorithmization.decomposition;


// find the greatest common divisor and the least common multiple
public class Decomp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);

		System.out.println("a = " + a + ", b = " + b);
		System.out.println("greatest common divisor = " + gcd(a, b));
		System.out.println("least common multiple = " + lcm(a, b));

	}

	public static int gcd(int a, int b) {
		if (Math.min(a, b) == 0) {
			return Math.max(a, b);
		}
		return gcd(Math.min(a, b), Math.max(a, b) % Math.min(a, b));
	}

	public static int lcm(int a, int b) {
		if (gcd(a, b) * b == 0) {
			System.out.println("Enter another number");
		}
		return (a / gcd(a, b) * b);
	}

}
