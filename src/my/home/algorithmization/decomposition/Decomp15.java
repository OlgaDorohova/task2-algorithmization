package my.home.algorithmization.decomposition;

//find all natural numbers to n exponent whose digits form an ascending sequence
public class Decomp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		ascendDigits(n);

	}
	
	public static void ascendDigits(int n) {
		for(int i = 1; i <= 9 - n + 1; i++) {
			int j = i;
			int count = 1;
			
			while(count <= n) {
				System.out.print(j);
				j++;
				count++;
				
			}
			System.out.println();
		}
	}

}
