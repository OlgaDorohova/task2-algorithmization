package my.home.algorithmization.decomposition;

//find the number with much digits
public class Decomp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2347633;
		int b = 346233;
		moreDigit(a, b);

	}

	public static int countDigit(int a) {
		return (int) Math.log10(a) + 1;
	}

	public static void moreDigit(int x, int y) {
		if (countDigit(y) == countDigit(x)) {
			System.out.print(x + " = " + y);
			return;
		}
		
		if (countDigit(x) > countDigit(y)) {
			System.out.println(x + " has more digits");
			return;
		} 
			System.out.println(y + " has more digits");
		
	}

}
