import java.util.Scanner;



public class SupplyTest
{

	public static void main(String[] args)
	{





						//Object 1




		Scanner input = new Scanner (System.in);

		System.out.print("\n\nEnter Supply Title : ");
		String name = input.next();
		System.out.print("\n\nEnter Supply ID : ");
		int id = input.nextInt();
		System.out.print("\n\nEnter Course Code : ");
		int code = input.nextInt();
		System.out.print("\n\nInvigilator Name : ");
		String name1 = input.next();
		System.out.print("\n\nEnter Semester : ");
		String semester = input.next();
		System.out.print("\n\nEnter Program Name : ");
		String program = input.next();
		System.out.print("\n\nEnter Type Of Examination : ");
		String examType = input.next();
		System.out.print("\n\nEnter Name Of Course Incharge : ");
		String name2 = input.next();
		System.out.print("\n\nEnter Place Of Examination : ");
		String location = input.next();
		System.out.print("\n\nEnter Total Students : ");
		int students = input.nextInt();

		Date date = new Date(17 , 9 , 2020);
		Time time = new Time(9 , 0 , 0);
		Supply s1 = new Supply(id , code , students);
 
		s1.setSuplyTitle(name);
		s1.setSupplyId(id);
		s1.setCourseCode(code);
 		s1.setInvigilator(name1);
		s1.setSemester(semester);
		s1.setTime(time);
		s1.setDate(date);
		s1.setExamType(examType);
		s1.setIncharge(name2);
		s1.setLocation(location);
		s1.setStudents(students);
		s1.setIsCollected(false);
		s1.setResult(false);
		s1.setProgramName(program);

		System.out.print(s1);
		System.out.println("\n\n");






						//Object2




				
		System.out.print("\n\nEnter Supply Title : ");
		name = input.next();
		System.out.print("\n\nEnter Supply ID : ");
		id = input.nextInt();
		System.out.print("\n\nEnter Course Code : ");
		code = input.nextInt();
		System.out.print("\n\nInvigilator Name : ");
		name1 = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester = input.next();
		System.out.print("\n\nEnter Program Name : ");
		program = input.next();
		System.out.print("\n\nEnter Type Of Examination : ");
		examType = input.next();
		System.out.print("\n\nEnter Name Of Course Incharge : ");
		name2 = input.next();
		System.out.print("\n\nEnter Place Of Examination : ");
		location = input.next();
		System.out.print("\n\nEnter Total Students : ");
		students = input.nextInt();

		Date date1 = new Date(18 , 9 , 2020);
		Time time1 = new Time(12 , 00 , 00);
		Supply s2 = new Supply(id , code , students);
 
		s2.setSupplyTitle(name);
		s2.setSupplyId(id);
		s2.setCourseCode(code);
 		s2.setInvigilator(name1);
		s2.setSemester(semester);
		s2.setTime(time1);
		s2.setDate(date1);
		s2.setExamType(examType);
		s2.setIncharge(name2);
		s2.setLocation(location);
		s2.setStudents(students);
		s2.setIsCollected(true);
		s2.setResult(true);
		s2.setProgramName(program);
		System.out.print(s2);
		
		System.out.println("\n\n");



							//Object 3


		
		System.out.print("\n\nEnter Supply Title : ");
		name = input.next();
		System.out.print("\n\nEnter Supply ID : ");
		id = input.nextInt();
		System.out.print("\n\nEnter Course Code : ");
		code = input.nextInt();
		System.out.print("\n\nInvigilator Name : ");
		name1 = input.next();
		System.out.print("\n\nEnter Semester : ");
		semester = input.next();
		System.out.print("\n\nEnter Program Name : ");
		program = input.next();
		System.out.print("\n\nEnter Type Of Examination : ");
		examType = input.next();
		System.out.print("\n\nEnter Name Of Course Incharge : ");
		name2 = input.next();
		System.out.print("\n\nEnter Place Of Examination : ");
		location = input.next();
		System.out.print("\n\nEnter Total Students : ");
		students = input.nextInt();

		Date date2 = new Date(19 , 9 , 2020);
		Time time2 = new Time(11 , 35 , 56);
		Supply s3 = new Supply(id , code , students);
 
		s3.setSupplyTitle(name);
		s3.setSupplyId(id);
		s3.setCourseCode(code);
 		s3.setInvigilator(name1);
		s3.setSemester(semester);
		s3.setTime(time2);
		s3.setDate(date2);
		s3.setExamType(examType);
		s3.setIncharge(name2);
		s3.setLocation(location);
		s3.setStudents(students);
		s3.setIsCollected(true);
		s3.setResult(true);
		s3.setProgramName(program);
		System.out.print(s3);

	}

}