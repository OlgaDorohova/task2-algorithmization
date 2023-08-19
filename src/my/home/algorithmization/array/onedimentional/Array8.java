package my.home.algorithmization.array.onedimentional;

//create new array without min elements of an original array
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = { 2, 1, 3, 8, 6, 22, 9, 1, 9, 2, 5 };
		int min = minElement(array);
		int count = 0;
		
		for(int i: array) {
			if(i == min) {
				count ++;
			}
		}
		
		int [] arrayWithoutMin = new int [array.length - count];
		
		for(int i = 0, j = 0; i < array.length; i++) {
			if(array[i] != min) {
				arrayWithoutMin[j] = array[i];
				j++;
			} else {
				continue;
			}
		}
		
		Array2.print(arrayWithoutMin);

	}
	
	public static int minElement(int [] arr) {
		int min = arr[0];
		
		for(int i: arr) {
			if(min > i) {
				min = i;
			}
		}
		
		return min;
	}

}
