package SearchingForItems;

public class ValidMoutainArray {

	public static boolean validMountainArray(int[] arr) {
//		boolean decreasing = false;
//		boolean increasing = false;
//		
//		if(arr.length < 3) return false;
//		
//		for (int i = 0; i < arr.length - 1; i++) {
//				if(arr[i] == arr[i+1]) 
//					return false;
//                if(arr[i] < arr[i+1]) {
//                	//can't have a increase after decrease
//				    if(decreasing == true) return false;
//				    increasing = true;
//                } 
//                if(arr[i] > arr[i+1])  
//                	decreasing = true;
//		}
//		
//		if(increasing == true && decreasing == true) {
//			return true;
//		}else {
//			return false;
//		}
		

	        int N = arr.length;
	        int i = 0;

	        // walk up
	        while (i+1 < N && arr[i] < arr[i+1])
	            i++;

	        // peak can't be first or last
	        if (i == 0 || i == N-1)
	            return false;

	        // walk down
	        while (i+1 < N && arr[i] > arr[i+1])
	            i++;

	        return i == N-1;

    }

	public static void main(String[] args) {
		int[] arr = {0, 3, 2, 1};
		int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
		int[] arr2 = {3,7,6,4,3,0,1,0};
		System.out.println(validMountainArray(arr));
		System.out.println(validMountainArray(arr1));
		System.out.println(validMountainArray(arr2));
	}
}
