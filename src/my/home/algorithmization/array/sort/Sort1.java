package my.home.algorithmization.array.sort;

//join two arrays: array[0, k] + array2[k+1] + array [k+1, m]
public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {1,2,1,3,15,14,56};
		int [] array2 = {5,6,8,89};
		int k = 4;
		
		int [] arrayJoin = new int[array1.length+ array2.length -1]; 
		
		//j for array1; m for array2
		if(k < array1.length) {
			for(int i = 0, j = 0, m = 0; i < arrayJoin.length; i++) {
				if(j <= k) {
					arrayJoin[i] = array1[j];
					j++;
				}
				
				if(j > k) {
					if(m < array2.length) {
						arrayJoin[i] = array2[m];
						m++;
					} else if(j< array1.length) {
						arrayJoin[i] = array1[j];
						j++;
					}
				}
				
			}
		} else System.out.println("K is bigger than array1.length");
		
		MyUtil.printArray(arrayJoin);

	}

}
