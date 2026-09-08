package CIET;

public class Array {
public static void main(String[] args) {
	int[] arr= {5,1,2,3,4};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println("maximum " + max);
	System.out.println("minimum " + min);
}
}
