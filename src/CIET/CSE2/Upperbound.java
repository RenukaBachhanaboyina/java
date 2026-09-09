package CSE2;

public class Upperbound {
	static int upperBound(int[] arr, int target) {
		int left = 0;
	    int right = arr.length;
	    while(left < right) {
	    	int mid = left + (right - left) / 2;
	    	if(arr[mid] > target) {
	    		right = mid;
	    	} else {
	    		left = mid + 1;
	    	}
	    }
	    return left;
	    
	}
	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40};
		int target = 10;
		int index = upperBound(arr, target);
		System.out.println("Upper Bound: " + index);
	}
}


