package CIET;
import java.util.*;
import java.util.stream.Collectors;
public class Event {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi", "Renu", "kannaya");
		List<String> result = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
