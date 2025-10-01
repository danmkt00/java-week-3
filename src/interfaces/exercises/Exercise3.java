package interfaces.exercises;

/**
 * TODO:
 * Exercise 3:
 * Create two interfaces: Flyable and Swimmable, each with a method (fly(), swim()).
 * Implement them in classes: Bird (can fly), Fish (can swim), and Duck (can both fly & swim).
 * Test them in Exercise3 class.
 */
public class Exercise3
{
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
    interface Flyable
    {
        void fly();
    }
    interface  Swimmable
    {
        void swim();
    }

    static class Bird implements Flyable
    {
        @Override
        public void fly()
        {
            System.out.println("Bird is flying");
        }
    }

    static class Fish implements Swimmable
    {
        @Override
        public void swim()
        {
            System.out.println("Fish is swimming");
        }
    }

    static class Duck implements Flyable, Swimmable {
        @Override
        public void fly()
        {
            System.out.println("Duck is flying");
        }
        public void swim()
        {
            System.out.println("Duck is swimming");
        }
    }
}
