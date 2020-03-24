public class Supply
{
	private String supplyTitle;
	private int supplyId;
	private int courseCode;
	private String invigilator;
	private String semester;
	private String programName;
	private Date date;
	private Time time;
	private String examType;
	private String incharge;
	private String location;
	private int students;
	private boolean isCollected;
	private String result;
	
	public Supply( int  supplyId , int courseCode , int students)
	{
		this.supplyId = supplyId;
		this.courseCode = courseCode;
		this.students = students;
	
	}

	public void setSupplyTitle(String supplyTitle)
	{
		this.supplyTitle = supplyTitle;
	}

	public void setSupplyId(int supplyId)
	{
		this.supplyId =  supplyId;
	}

	public void setCourseCode(int courseCode)
	{
		this.courseCode = courseCode;
	}

	public void setInvigilator(String invigilator)
	{
		this.invigilator = invigilator;
	}

	public void setSemester(String semester)
	{
		this.semester = semester;
	}

	public void setProgramName(String programName)
	{
		this.programName = programName;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setTime(Time time)
	{
		this.time = time;
	}

	public void setExamType(String examType)
	{
		this.examType =  examType;
	}

	public void setLocation(String location)
	{
		this.location =  location;
	}

	public void setIncharge(String incharge)
	{
		this.incharge =  incharge;
	}

	public void setStudents(int students)
	{
		this.students = students;
	}
	
	public void setIsCollected(boolean isCollected)
	{
		this.isCollected = isCollected;
	}

	public String getSupplyTitle()
	{
		return supplyTitle; 
	}

	public int getSupplyId()
	{
		return supplyId; 
	}

	public int getCourseCode()
	{
		return courseCode; 
	}

	public String getInvigilator()
	{
		return invigilator; 
	}

	public String getSemester()
	{
		return semester; 
	}

	public String getProgramName()
	{
		return programName; 
	}

	public Date getDate()
	{
		return date; 
	}

	public Time getTime()
	{
		return time; 
	}

	public String getExamType()
	{
		return examType; 
	}

	public String getLocation()
	{
		return location; 
	}

	public String getIncharge()
	{
		return incharge; 
	}

	public int getStudents()
	{
		return students; 
	}

	public boolean getIsCollected()
	{
		
		return isCollected;
	}
	
	public void setResult(boolean isCollected)
	{
		if(isCollected == true)
		{
			result = "Collected";
		}
		else 
		{
			result = "Not Collected";
		}
	}

	public String getResult()
	{
		return result;
	}
	
	
	public String toString()
	{
		return String.format("%nSupply Name : %s %nSupplyID : %d %nCourse Code : %d %nInvigilator Name : %s %n Semester : %s %nProgram : %s %nDate : %s %nTime : %s %nExam Type : %s %nLocation Of Exam : %s %nCourse Incharge : %s %nTotal Students : %d %nIs Paper Collected : %s%n%s!" , getPaperTitle() , getPaperId() , getCourseCode() , getInvigilator() , getSemester(), getProgramName() , getDate() , getTime() , getExamType() , getLocation() , getIncharge() , getStudents() , getIsCollected() , getResult());
	}

	

}