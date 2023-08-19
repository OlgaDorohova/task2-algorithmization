package my.home.algorithmization.array.sort;

public class MyUtil {

	public static void printArray(int[] array) {
		for (int i = 0; i< array.length; i++) {
			if(array.length > 20 && i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%6d",array [i]);
		}

		System.out.println();

	}

	public static int[] createArray(int size) {
		var array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (i + 3) / 2;
		}
		return array;
	}
	
	public static int [] createRandomArray(int size, int rang) {
		int [] array = new int [size];
		
		for(int i = 0; i < size; i++) {
			array[i] = (int)(Math.random()*rang +1);
		}
		
		return array;
	}
	

}
