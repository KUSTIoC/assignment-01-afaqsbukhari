public class Bukhari
{
	private final String bukhariName;
	private int bukhariCode;
	private String programName;
	private String semester;
	private int year;
	private static int count;

	public Bukhari(String BukhariName , int BukhariCode)
	{
		this.bukhariName = bukhariName;
		this.bukhariCode = bukhariCode;
		count++;
	
	}


	public void setBukhariCode(int code)
	{
		bukhariCode = code;
	}

	public void setProName(String name)
	{
		programName =  name;
	}

	public void setSemester(String semester)
	{
		this.semester = semester;
	}

	public String getBukhariName()
	{
		return bukhariName;
	}

	public int getBukhariCode()
	{
		return bukhariCode;
	}

	public String getProName()
	{
		return programName;
	}

	public String getSemester()
	{
		return semester;
	}


	public void setYear(int year)
	{
		this.year = year;
	}

	public int getYear()
	{
		return year;
	}

	public String toString()
	{
		return String.format("%nBukhariName : %s %nBukhariCode : %s %nProgram Name : %s %nSemester : %s %s %d %nObjects : %d" , getBukhariName() , getBukhariCode() , getProName() , getSemester(), "Fall", getYear() , getCount());
	}

	public static int getCount()
	{
		return count;

	}
	

}