package Lambdas;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FirstLambdas {

	public static void main(String[] args) {
		// Supplier
		Supplier<String> supplier = () -> {
			System.out.println("I am inside Supplier");
			return "Hello world!!";
		};
		String returnStr = supplier.get();
		System.out.println("Return Str : " +returnStr);
		
		//Consumer
		Consumer<String> consumer = (String s) -> {
			System.out.println("I am inside consumer");
			System.out.println(s);
		};
		consumer.accept("Hello Girish");
		
		//Predicate
		Predicate<String> isEmpty = s -> {
			return s.isEmpty();
		};
		System.out.println(isEmpty.test(""));
		
		//Function
		Function<User, String> getName = user -> user.getName();
		System.out.println(getName.apply(new User("GirishRawat")));
		
		//Runnable
		Runnable r = () -> System.out.println("I am runnable");
		r.run();
		
		//Comparator
		Comparator<Integer> cmp = (i1,i2) -> Integer.compare(i1,i2);
		System.out.println(cmp.compare(30, 20));
	}
}
