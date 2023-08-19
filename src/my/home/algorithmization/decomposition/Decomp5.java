package my.home.algorithmization.decomposition;

//output the array element less than maximum element and greater than other elements
public class Decomp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,8,2,1,4,6,19,2,3,4,5,7,8,15,6,4,9,10,14,16};
				
		System.out.println(findMaxPrev(array, findMax(array)));
	}
	
	public static int findMaxPrev(int []array, int max) {
		int prev = array[0];
		
		for(int i: array) {
			if( i != max &&  prev < i) {
				prev = i;
			}
		}
		
		return prev;
	}
	
	public static int findMax(int []array) {
		int max = array[0];
		
		for(int i : array) {
			if(max < i) {
				max = i;
			}
		}
		
		return max;
	}

}
