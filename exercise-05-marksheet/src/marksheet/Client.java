package marksheet;

public class Client {
	
	public static void main(String[] args) {
		StudentBatch batch = new StudentBatch();
		
		Course[] Clist = {new Course("CS106", "oop lab", 10, 100.0),
						new Course("CS102", "oop", 10, 100.0), 
						new Course("CS101", "ds and algo", 10, 100.0)};
		
		
		Student s1 = new Student("s1", 1, Clist);
		Student s2 = new Student("s2", 2, Clist);
		Student s3 = new Student("s3", 3, Clist);
		Student s4 = new Student("s4", 4, Clist);
		Student s5 = new Student("s5", 5, Clist);

		// adding marks to each student s1's courses
		s1.setMarks(s1.courses[0], 100.00);
		s1.setMarks(s1.courses[1], 100.00);
		s1.setMarks(s1.courses[2], 100.00);
		
		// adding marks to each student s2's courses
		s2.setMarks(s2.courses[0], 30.00);
		s2.setMarks(s2.courses[1], 30.00);
		s2.setMarks(s2.courses[2], 30.00);
	
		// adding marks to each student s3's courses
		s3.setMarks(s3.courses[0], 40.00);
		s3.setMarks(s3.courses[1], 40.00);
		s3.setMarks(s3.courses[2], 40.00);
		
		// adding marks to each student s4's courses
		s4.setMarks(s4.courses[0], 60.00);
		s4.setMarks(s4.courses[1], 60.00);
		s4.setMarks(s4.courses[2], 60.00);
		
		s5.setMarks(s5.courses[0], 50.00);
		s5.setMarks(s5.courses[1], 50.00);
		s5.setMarks(s5.courses[2], 50.00);
		
		Student[] studentList = {s1, s2, s3, s4, s5};
		
		batch.students = studentList;
		
		RuleEngine.generateResult(batch);
		
		batch.printResult();
	}

}
