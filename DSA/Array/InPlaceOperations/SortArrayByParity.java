package InPlaceOperations;

public class SortArrayByParity {
//	Input: nums = [3,1,2,4]
//	Output: [2,4,3,1]
//	The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	
	public static int[] sortArrayByParity(int[] nums) {
		
		int current = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				int temp = nums[current];
				nums[current++] = nums[i];
				nums[i] = temp;
			}
		}
		return nums;
        
    }
	
	public static void main(String[] args) {
		int nums[] = {3,1,2,4};
		sortArrayByParity(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
