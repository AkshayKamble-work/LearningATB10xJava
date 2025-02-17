package Polymorphism;

public class Animal
{
 void eating()
 {
     System.out.println("Animal eating food");
 }

 void running ()
 {
     System.out.println("Animal runinng fast");
 }

}

class Dog extends Animal
{
    @Override
    void eating() {
        System.out.println("Dog is eating chicken ");
    }

    @Override
    void running() {
        System.out.println("Dog is running very fast toward the chicken");
    }
}
class TestOverriding
{
    public static void main(String[] args)
    {

        Dog blackDog=new Dog();
        blackDog.eating();
        blackDog.running();
        System.out.println("--------------------");
        Animal cat=new Animal();
        cat.running();
        cat.eating();
    }
}
