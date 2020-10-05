
public class Parent {
	public void m1(){
		System.out.println("Parent m1");
		m2();
	}
	
	public Object m2() {
		System.out.println("Parent m2");
		return null;
	}
}
