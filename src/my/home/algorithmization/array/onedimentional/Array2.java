package my.home.algorithmization.array.onedimentional;

//change all array elements that are bigger than Z
//count changes
public class Array2 {

	public static void main(String[] args) {

		int[] array = { 10, 2, 15, 4, 90, 56, 86, 13, 45 };
		int z = 15;
		int changeCount = 0;
		
		System.out.println("Original array: ");
		print(array);
		
		for(int i = 0; i< array.length; i++) {
			if(array[i] > z) {
				array[i] = z;
				changeCount++;
			}
		}
		
		System.out.println("Array after " + changeCount + " changes: ");
		print(array);
		
	}
	
	public static void print(int arr []) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
