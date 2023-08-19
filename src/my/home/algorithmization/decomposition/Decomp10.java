package my.home.algorithmization.decomposition;

//create an array of digits that  a number contains
public class Decomp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234567890;
		int [] digits = digitArray(num);

		for(int j: digits) {
			System.out.print(j + " ");
		}
	}
	
	public static int [] digitArray(int num) {
		int length = (int) (Math.log10(num) + 1);
		int[] digits = new int[length];
		
		int i = 0;
		int pow = length-1;
		while (i<length){
			digits[i] = num / (int)Math.pow(10, pow);
			num %= (int)Math.pow(10, pow);
			pow --;
			i++;
		}
		
		return digits;
	}

}
