package marksheet;

public class RuleEngine {
	static Double totalMarks = 0.0, percentage = 0.0, SumofCoursesMaxMarks; 
	static Integer no_of_courses;

	public static void generateResult(StudentBatch batch) {
		
		//looping through each student of a batch
		for (int i = 0; i < batch.students.length; i++) {
			SumofCoursesMaxMarks = 0.0; 
			totalMarks = 0.0; 			
			
			//looping through each course for a student of a batch
			for (int cours = 0; cours < batch.students[i].courses.length; cours++) {
				totalMarks = totalMarks + batch.students[i].getMarks(batch.students[i].courses[cours]);
				SumofCoursesMaxMarks = SumofCoursesMaxMarks + batch.students[i].courses[cours].marks;
				
			}
			
			percentage = (totalMarks*100)/SumofCoursesMaxMarks;

			if (percentage >= 40.0) {
				batch.students[i].isPass = true;
			} else {
				batch.students[i].isPass = false;
			}

		}
	}
}