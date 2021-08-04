package InPlaceOperations;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val ){
            	
                nums[currentIndex] = nums[i];
                currentIndex++;
            }

        }
        return currentIndex;
        
        //c2
//        int i = 0;
//        int n = nums.length;
//        while (i < n) {
//            if (nums[i] == val) {
//                nums[i] = nums[n - 1];
//                // reduce array size by one
//                n--;
//            } else {
//                i++;
//            }
//        }
//        return n;
    }
	public static void main(String[] args) {
		int nums[] = {0,1,2,2,3,0,4,2};
		removeElement(nums, 2);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
