package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdas {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(Arrays.asList("one", "two", "three", "four","five"));
		
		Predicate<String> filter = s -> !s.startsWith("t"); 
		strings.removeIf(filter);
		Consumer<String> action = str -> System.out.println(str);
		strings.forEach(action);
	}

}
