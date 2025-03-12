package Variables;

public class Demo4 {

	public static void main(String[] args) {

		// 1. Variable declaration
		// Syntax - DataType VariableName;

		String InstituteName; // VCTC
		String CourseName;
		String FirstName;
		String LastName;
		String MailID;
		int PassoutYear; // 2024
		int RollNo;
		char StudentGrade; // 22.45
		float StudentPercentage;

		// 2. Variable initialization
		// Syntax -- VariableName = vriableValue;

		InstituteName = "Velocity corprate tranning center";
		CourseName = "Javadevelopment";
		FirstName = "Rahul";
		LastName = "Patil";
		MailID = "Vctc@gmail.com";
		PassoutYear = 2020;
		RollNo = 100;
		StudentGrade = 'B';
		StudentPercentage = 50.45f;

		// Usages
		// String concatenation
		System.out.println("Institute Name ==>" + InstituteName);
		System.out.println("Course Name ==> " + CourseName);
		System.out.println("First Name ==> " + FirstName);
		System.out.println("Last Name ==> " + LastName);
		System.out.println("Student Mail ID ==> " + MailID);
		System.out.println("Passout Year ==>" + PassoutYear);
		System.out.println("Student Roll Number ==> " + RollNo);
		System.out.println("Student Grade ==>" + StudentGrade);
		System.out.println("Student Percentage ==> " + StudentPercentage);

	}

}
