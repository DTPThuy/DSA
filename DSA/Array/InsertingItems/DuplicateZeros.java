package InsertingItems;

public class DuplicateZeros {
	
//	Input: [1,0,2,3,0,4,5,0]
//	Output: null
//	Explanation: After calling your function, 
//	the input array is modified to: [1,0,0,2,3,0,0,4]
	
	public static void DuplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
        		for (int j = arr.length - 1; j > i; j--) {
        			System.out.println(arr[j] + " = " + arr[j-1]);
        			arr[j] = arr[j -1]; 
        			
        		}
                i++;
        	}
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,0,2,3,0,4,5,0};

		DuplicateZeros(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
