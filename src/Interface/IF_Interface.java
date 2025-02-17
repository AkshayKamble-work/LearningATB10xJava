package Interface;


interface Animal {
    void makeSound(); // Abstract method (implicitly public & abstract)
}
interface Cat
{
    void eating();
}

class Dog implements Animal,Cat
{
    public void makeSound()
    { // Must be public
        System.out.println("Bark!");
    }
    public void eating()
    {
        System.out.println("Cat eating milke");
    }

}
class TestInterFace {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: Bark!
        dog.eating();
    }
}
