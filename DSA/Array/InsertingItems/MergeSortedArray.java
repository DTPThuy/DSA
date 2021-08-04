package InsertingItems;

public class MergeSortedArray {
	
//	Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//	Output: [1,2,2,3,5,6]
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 	m--;
	        n--;
	        for(int i = nums1.length - 1; i >= 0; i-- ){
	            if(n < 0) return;
	            if( m >= 0 && nums1[m] > nums2[n]){
	                nums1[i] = nums1[m];
	                m--;
	            }
	            else{
	                nums1[i] = nums2[n];
	                n--;
	            }
	        }
	    }
	
	public static void main(String[] args) {
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		
		merge(nums1, m, nums2, n);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
	}

}
