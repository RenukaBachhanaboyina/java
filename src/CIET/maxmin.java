package CIET;

public class maxmin {
static int findMax(int[] arr){
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
public static void main(String[] args) {
	int[] a = {5,2,9,7,100};
	System.out.println(findMax(a));
}
}
