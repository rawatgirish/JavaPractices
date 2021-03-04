package Lambdas;

public class User {
	private String name;

	public User(String userName) {
		name = userName;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "User : ["+name +"]";
	}

}
