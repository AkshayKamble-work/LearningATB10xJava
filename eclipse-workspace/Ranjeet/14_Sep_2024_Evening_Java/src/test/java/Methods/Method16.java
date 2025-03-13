package Methods;

public class Method16 {

	public static void main(String[] args) {

		Method16.studentInformation("VCTC", "SoftwareTesting", "Rohit", "Patil", "Rohitpatil@gmail.com", 23, 2020, 'B', 60.44f);
	    Method16.studentInformation("Javabykiran", "Javadevelopment", "Ketan", "Jadhav", "Ketyan@gmail.com", 33, 2023, 'C', 44.22f);
	    Method16.studentInformation("Durgasoft", "Javadevelopment", "Rahul", "P", "Ketyan@gmail.com", 33, 2023, 'C', 44.22f);

	
	}
	
	
	public static void studentInformation(String instName,String courseName,String firstName, String lastName,String emailId,		
			int rollNumber, int passoutYear,char studentGrade, float studentPercentage) {
		
		
		System.out.println("institute name -->"+instName + "  CourseName -->" +courseName+""
				+ " Firstname -->"+firstName  +" Lastname -->"+						
        lastName +  "MailID -->"+emailId +" rollNumber -->"+rollNumber+"  passoutYear --->"+passoutYear +"studentGrade -->"
				+studentGrade+" studentPercentage-->"+studentPercentage);
		
	}

	
	
}
