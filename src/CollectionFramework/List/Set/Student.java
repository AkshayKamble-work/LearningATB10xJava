package CollectionFramework.List.Set;

public class Student
{
    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String rollNo;
}
