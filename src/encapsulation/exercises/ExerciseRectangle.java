package encapsulation.exercises;

/**
 TODO:
 1. Create private fields width (double), height (double).
 2. Write a constructor to set them.
 3. Add getters and setters (no negative values allowed).
 4. Add methods: getArea() and getPerimeter().
 */
class Rectangle
{
    private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getHeight() { return height; }

    public double getWidth() { return width; }

    public void setWidth(double width)
    {
        if(width < 0){
            System.out.println("Width must be greater than 0!");
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height)
    {
        if(height < 0){
            System.out.println("Height must be greater than 0!");
        }else{
            this.height = height;
        }
    }

    public double getArea()
    {
        return height * width;
    }

    public double getPerimeter()
    {
        return (height+width) * 2;
    }
}
public class ExerciseRectangle
{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        rectangle.setWidth(10);
        rectangle.setHeight(-5);

        System.out.println("New Area: " + rectangle.getArea());
        System.out.println("New perimeter" + rectangle.getPerimeter());
    }

}

