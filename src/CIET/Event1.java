package CIET;
import java.util.*;
import java.util.stream.Collectors;
public class Event1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
				5, 12, 8, 15, 20, 3, 12, 30
		);
		 
		List<Integer> result = numbers.stream()
				.distinct()
				.filter(n -> n > 10)
				.sorted((a, b) -> b - a)
				.limit(3)
				.collect(Collectors.toList());
				int sum = result.stream()
						.reduce(0,  Integer::sum);
		System.out.println(result);
		System.out.println("Sum = " + sum);
	}

}











