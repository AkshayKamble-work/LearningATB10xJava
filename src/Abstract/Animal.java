package Abstract;

abstract class Animal
{
public abstract void MakeSound();
public abstract void Eating();

public void Sleeping()
{
    System.out.println("Animal are sleeoing..");
}

}

class Cat extends Animal
{
    public void MakeSound() {
        System.out.println("Bark bark!");
    }

    public void Eating(){
        System.out.println("Cat is eating..");
    }
}


class TestAbstract
{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.Eating();
        c.MakeSound();
        c.Sleeping();
    }
}
