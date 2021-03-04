package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SomeMappings {

	public static void main(String[] args) {
		User sarah = new User("Sarah");
		User james = new User("James");
		User mary = new User("Mary");
		User john = new User("John");
		List<User> users = Arrays.asList(sarah, james, mary, john);
		
		List<String> names = new ArrayList<>();
		Function<User, String> toName = user -> user.getName();
		users.forEach(u -> names.add(toName.apply(u)));
		
		users.forEach(user -> System.out.println(user));
		names.forEach(name -> System.out.println(name));
	}

}
