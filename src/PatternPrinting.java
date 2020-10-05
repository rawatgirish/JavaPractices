import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PatternPrinting {
static int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =5;
		System.out.println("age is : " + age);
//		Triangle  
		for(int i = 0; i < row ; i++)
		  { 
			  for(int j = 0 ; j<row-i; j++ )
			  {
				  System.out.print(" ");
			  } 
			  for(int k = 0 ; k< i*2+1; k++)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		 String s = "strawberries";
		 System.out.println(s.substring(2,5));

		long l = 20200201;
		String date = "20190923";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate string = LocalDate.parse(date, formatter);
		LocalDate another = string.minusDays(1);
		if(another.isBefore(string)) {
			System.out.println(string);
		}
		
		List abc = new ArrayList();
		abc.add("h");
		abc.add(2);
		//abc.sort(List.dec);
System.out.println(abc.get(1) instanceof Integer);
int count = 0;
for(int i=0;i<10;i=i++) {
	i+=1;count++;
	System.out.println("hello");
}
System.out.println(count);
		
List<Integer> list12 = new ArrayList<Integer>();
list12.add(1);
list12.add(1, null);
list12.add(2, null);
list12.add(3,3);
System.out.println(list12);
		//String format = formatter.parse(string);
		//LocalDate.from(new TemporalAccessor());
		//System.out.println(l);
//		Right angle triangle
//		for(int i=0;i<row;i++)
//		{
//			for(int j=i;j>=0;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		 
		
//		upside down right triangle
//		for(int i=row;i>0;i--)
//		{
//			for(int j=i;j>0;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

//		right triangle space
//		for(int i=row;i>0;i--)
//		{
//			for(int j=i-1;j>0;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=i;k<=row;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		Triangle
//		for(int i=0;i<row;i++) {
//			for(int j=i;j<row-1;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i*2+1;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		Diamond
//		for(int i=0;i<row;i++) {
//			for(int j=i;j<row-1;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i*2+1;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=row-1;i>0;i--) {
//			for(int j=i;j<row;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i*2-1;k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
		
		
	}
}
