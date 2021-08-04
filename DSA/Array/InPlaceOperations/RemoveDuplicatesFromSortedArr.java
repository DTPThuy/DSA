package InPlaceOperations;

public class RemoveDuplicatesFromSortedArr {
	
	public static int removeDuplicates(int[] nums) {
        // Input: nums = [0,0,1,1,1,2,2,3,3,4]
        // Output: 5, nums = [0,1,2,3,4]
        int currentIndex = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                currentIndex++;
                nums[currentIndex] = nums[i + 1];
            }
        }
        return currentIndex;
        
    }
	
	public static void main(String[] args) {
			int nums[] = {1,1,2};
			removeDuplicates(nums);
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + " ");
			}
	}
}
