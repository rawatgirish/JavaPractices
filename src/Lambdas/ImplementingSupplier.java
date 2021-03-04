package Lambdas;

import java.util.function.Supplier;

public class ImplementingSupplier implements Supplier<String> {
	Supplier<String> supplier = () -> "Hello";

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}
}
