import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Child extends Parent{
	@Override
	public String m2(){
		System.out.println("Child m2");
		return null;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(20);
		System.out.println(list.size());
		Child obj = (Child) new Parent();
		Parent p = new Child();
		
		System.out.println(isThisDateValid("1970-01-01T00:00:00.000Z","yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));		
	}
	
	public static boolean isThisDateValid(String dateToValidate, String dateFromat){

		if(dateToValidate == null){
			return false;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);

		try {

			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			System.out.println(date);

		} catch (ParseException e) {

			e.printStackTrace();
			return false;
		}

		return true;
	}
}
