public class Student {
	//attributes 
	public String student_id;
	public String student_name;
	public String student_course; 
	//function
	public void Message(){
		System.out.println("Student " + student_name +
        " (" + student_id + ") is enrolled for " + student_course + ".");
	}
}
