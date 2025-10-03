package polymorphism.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create class Animal with method eat() → "This animal eats food".
 2. Create subclasses Dog and Bird:
      - Dog: "The dog eats bones".
      - Bird: "The bird eats seeds".
 3. Test them in main().
*/

class Animal
{
    public void eat()
    {
        System.out.println("This animal eats food...");
    }
}
class Dog extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("The dog eats bones...");
    }
}

class Bird extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("The bird eats seeds...");
    }
}

public class ExerciseAnimal
{
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Bird());

        for (Animal a : animals) {
            a.eat();
        }
    }
}
