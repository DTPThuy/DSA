package Conclusion;

public class HeightChecker {
//	Input: heights = [1,1,4,2,1,3]
//	Output: 3
//	Explanation: 
//	heights:  [1,1,4,2,1,3]
//	expected: [1,1,1,2,3,4]
//	Indices 2, 4, and 5 do not match.
	
	 public static int heightChecker(int[] heights) {
		 //copy mang
		 int[] copy = new int[heights.length];
		 for (int i = 0; i < heights.length; i++) {
			copy[i] = heights[i]; 
		}
		 
		 //selection sort:[1,1,4,2,1,3]
		 for (int i = 0; i < heights.length; i++) {
			 int minidx = i;
			for (int j = i+1; j < heights.length; j++) {
				if(copy[minidx] > copy[j]) {
					minidx = j;
				}
			}
			if(minidx != i) {
				int temp = copy[i];
				copy[i] = copy[minidx];
				copy[minidx] = temp;
			}
		}
		 
		 //comparison
		 int count = 0;
		 for (int i = 0; i < heights.length; i++) {
			if(heights[i] != copy[i]) count++;
		}
	     return count;  
	    }
	
	public static void main(String[] args) {
		int heights[] = {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));;
		for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i] + " ");
		}

	}

}
