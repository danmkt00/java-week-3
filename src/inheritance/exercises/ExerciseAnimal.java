package inheritance.exercises;

/**
 TODO:
 1. Create a superclass Animal with:
      - method makeSound() → prints "Some sound...".
 2. Create subclasses Dog and Cat that override makeSound().
 3. In main(), create a Dog and Cat and call their makeSound().
*/
class Animal
{
    public void makeSound()
    {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Woof");
    }
}

class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Meow");
    }
}

public class ExerciseAnimal
{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}