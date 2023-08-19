package my.home.algorithmization.array.onedimentional;

//change on zero ever second element of the array
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 1, 3, 8, 6, 7, 9, 1, 9, 2, 5, 9, 2, 1 };
		
		Array2.print(array);
		
		for(int i = 0; i < array.length; i++) {
			if(i % 2 != 0) {
				array[i] = 0;
			}
		}
		
		Array2.print(array);
	}

}
