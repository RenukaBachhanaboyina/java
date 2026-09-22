package CSE5;
import java.util.*;
public class MinimumPlatforms {
static int findPlatforms(int[] arrival, int[] departure) {
	Arrays.sort(arrival);
	Arrays.sort(departure);
	int i = 0;
	int j = 0;
	int platforms = 0;
	int maxPlatforms = 0;
	while (i < arrival.length && j < departure.length) {
		if (arrival[i] <= departure[j]) {
			platforms++;
			maxPlatforms++;
			i++;
	} else {
		platforms--;
		j++;
	}
	}
	return maxPlatforms;
}
public static void main(String[] args) {
	int[] arrival = {322,342,23,234,234};
	int[] departure = {312,344,53,674,834};
	System.out.println("Mininum Platform = " + findPlatforms(arrival,departure));
}
}

 
	
	
	 