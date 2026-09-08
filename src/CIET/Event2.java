package CIET;
import java.util.*;
import java.util.stream.Collectors;
public class Event2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi", "Renu", "kannaya", "Anu", "Anji");
		List<String> result = names.stream()
				.filter(name -> name.startsWith("A"))
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
