package InPlaceOperations;

public class MoveZeros {
	
	public static void moveZeroes(int[] nums) {
		
		int current = 0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				int temp = nums[current];
				nums[current++] = nums[i];
				nums[i] = temp;
			}
		}
    }
	
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
