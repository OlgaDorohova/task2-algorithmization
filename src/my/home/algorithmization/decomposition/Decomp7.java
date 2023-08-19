package my.home.algorithmization.decomposition;

//find sum of the factorials of all odd numbers from 1 to 9
public class Decomp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(oddFactiorialSum());

	}
	
	public static int oddFactiorialSum() {
		int sum = 0;
		for(int i = 0; i<=9; i++) {
			if(i % 2 == 0) {
				continue;
			}
			
			sum += factorialCalc(i);
		}
		
		return sum;
	}
	
	
	public static int factorialCalc(int num) {
		
		if(num <= 1) {
			return 1;
		} else {
			return num * factorialCalc(num - 1);
		}
		
		
	}

}
