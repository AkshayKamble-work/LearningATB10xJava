package ThisKeyword;

public class Accenture

{
    String profile;
    String Name;
    float salary;
    double idcard;

    Accenture(String name_C,String profile_C,float salary_C,double idcard_C )
    {
        this.Name=name_C;
        this.profile=profile_C;
        this.salary=salary_C;
        this.idcard=idcard_C;

    }
    void login ()
    {
        System.out.println("Details of Employee ::");
        System.out.println("Name :: "+Name);
        System.out.println("Profile :: "+profile);
        System.out.println("Salary :: "+salary);
        System.out.println("ID card :: "+idcard);
        System.out.println();
        System.out.println("Details are correct..!!");
    }

}
