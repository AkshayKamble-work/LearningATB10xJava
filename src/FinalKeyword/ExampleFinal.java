package FinalKeyword;

public class ExampleFinal {

    final int x = 10; // Final variable

    void changeValue() {
        x = 20;  //❌ Error: Cannot assign a value to cannot assign a value to final variable xfinal variable 'x'

    }

    public static void main(String[] args) {
        ExampleFinal ex=new ExampleFinal();
        //ex.changeValue();// throw the error beacause we can not change the value of final keyword
    }
}
