package my.home.algorithmization.array.onedimentional;

//count positive, negative and null elements of an array
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 5, 46, -2, 0, -9, 13, 0, -8, 10, -11, 0, 45 };
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		for(int i: array) {
			if(i > 0) {
				pos++;
			}
			
			if(i == 0) {
				zero++;
			}
			
			if(i < 0) {
				neg++;
			}
		}
		
		System.out.println("Positive elements: " + pos + "\n" +
						"Negetive elements: " + neg + "\n" + 
						"Null elements: " + zero);

	}

}
