public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating first instance
		Student student1 = new Student();
		//instance 1 values
		student1.student_name = "Joe Soap";
		student1.student_id = "1234";
		student1.student_course = "Cetificate in Networking";
		
		//creating second instance
		Student student2 = new Student();
		//instance 2 values
		student2.student_name = "Jane Doe";
		student2.student_id = "999";
		student2.student_course = "Engineering N3";
		//call the function so we can display the message
		student1.Message();
		student2.Message();
	}

}
