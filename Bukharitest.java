import java.util.Scanner;

public class BukhariTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);




						Object1





		
		System.out.print("\n\nEnter Bukhari Name : ");
		String name = input.next();
		System.out.print("\n\nEnter Bukhari Code : ");
		int code = input.nextInt();
		System.out.print("\n\nEnter Program Name : ");
		String proName = input.next();
		System.out.print("\n\nEnter Semester : ");
		String semester =  input.next();
		System.out.print("\n\nEnter Year : ");
		int year = input.nextInt();

		Bukhari b1 = new Bukhari(name , code);         
		
		b1.setYear(year);
		b1.setBukhariCode(code);
		b1.setProName(proName);
		b1.setSemester(semester);
		System.out.println(b1);
		System.out.print("\n\n");






						Object2





				
		System.out.print("\n\nEnter Bukhari Name : ");
		name = input.next();
		System.out.print("\n\nEnter Bukhari Code : ");
		code = input.nextInt();
		System.out.print("\n\nEnter Program Name : ");
		proName = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester =  input.next();
		System.out.print("\n\nEnter Year : ");
		year = input.nextInt();

		Bukhari b2 = new Bukhari(name , code);

		b2.setYear(year);
		b2.setBukhariCode(code);
		b2.setProName(proName);
		b2.setSemester(semester);

		System.out.println(b2);
		System.out.print("\n\n");







						Object3






		
		System.out.print("\n\nEnter Bukhari Name : ");
		name = input.next();
		System.out.print("\n\nEnter Bukhari Code : ");
		code = input.nextInt();
		System.out.print("\n\nEnter Program Name : ");
		 proName = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester =  input.next();
		System.out.print("\n\nEnter Year : ");
		year = input.nextInt();

		Bukhari b3 = new Bukhari(name , code);

		b3.setYear(year);		
		b3.setBukhariCode(code);
		b3.setProName(proName);
		b3.setSemester(semester);
		
		System.out.println(b3);
		System.out.print("\n\n");
	}

}