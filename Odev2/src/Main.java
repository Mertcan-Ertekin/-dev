
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("Mertcan ERTEKİN");
		student.setEmail("mrtcnertekin@gmail.com");
		student.setPassword("12345");
		student.setSchoolName("MOSTEM");
		student.setSchoolNumber("622");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.uptade(student);
		
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Efe ERTEKİN");
		instructor.setEmail("mrtcnertekin@gmail.com");
		instructor.setPassword("12345");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.uptade(instructor);
		
 
	}

}
