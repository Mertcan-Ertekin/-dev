
public class Student extends User{
	
	String SchoolName;
	String SchoolNumber;
	
    public Student() {
		
	}
	
	public Student(int id, String name, String email, String password, String schoolName, String schoolNumber) {
		super(id, name, email, password);
		SchoolName = schoolName;
		SchoolNumber = schoolNumber;
	}


	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getSchoolNumber() {
		return SchoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		SchoolNumber = schoolNumber;
	}
	

}
