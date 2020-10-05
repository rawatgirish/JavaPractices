import java.util.ArrayList;
import java.util.List;

public class WorkingWithArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println("List : " + list);
		list.add(0, 10);
		System.out.println("List After : " + list);

	}
}
