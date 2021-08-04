package InPlaceOperations;

public class GreatestElementsOnRightSide {
	
	public static int[] replaceElements(int[] arr) {
		if(arr == null) return arr;
		
		for (int i = arr.length-1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1];
			arr[arr.length-1] = Math.max(arr[arr.length-1], temp);
		}
		arr[arr.length-1] = -1;
		return arr;
    }

	public static void main(String[] args) {
		int[] arr = {17,18,5,4,6,1};
		
		replaceElements(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
