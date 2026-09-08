package CSE2;

public class JumpSearch {
	static int BinarySearch(int[] arr, int target) {
		int n = arr.length;
		int blocSize = (int) Math.sqrt(n);
		int start = 0;
		int end = blocSize;
		while(start < n && arr[Math.min(end, n) - 1] < target){
			start = end;
			end += blocSize;
			if(start >= n) {
				return -1;
			}
		}
		for(int i = start; i < Math.min(end, n);i++) {
			if(arr[i] == target) {
				return 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {
				10, 20, 30, 40, 50, 
				60, 70, 80, 90, 100
		};
		int target = 70;
		System.out.println(BinarySearch(arr, target));
	}
}
