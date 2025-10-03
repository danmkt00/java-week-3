package polymorphism.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create abstract class Shape with method draw().
 2. Create subclasses Circle, Rectangle, Triangle → each overrides draw().
 3. Store them in a List<Shape> and loop through to call draw().
*/
interface Shape {
    void draw();
}

class Circle implements Shape
{
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Shape
{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Triangle implements Shape
{
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

public class ExerciseShape
{
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        for(Shape s : shapes)
        {
            s.draw();
        }
    }
}
