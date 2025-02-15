package Inheritance;

public class Dog extends Animal
{
void Sleep()
{
    System.out.println("Dog is sleeping");
}
void Food()
{
    System.out.println("Dog is eating food");
}
void Moving()

{
    System.out.println("Dog is running ");
}

}
class Test{
    public static void main(String[] args) {

        Dog d=new Dog();
        d.Sleep();
        d.Food();
        d.Moving();

        // accessing parent class propety
        d.sleep();
        d.sound();
        d.Eat();
        d.running();
        d.Sleep();
        d.Food();
        d.Moving();

    }
}
