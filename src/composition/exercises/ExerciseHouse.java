package composition.exercises;

/**
 TODO:
 1. Create class Room with fields: length, width.
 2. Add method getArea() in Room.
 3. Create class House that HAS-A Room.
 4. Add method printRoomArea() in House to delegate to Room.
*/

class Room
{
    private final double length;
    private final double width;
    public Room(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length * width;
    }
}

class House
{
    Room room;
    public House(Room room)
    {
        this.room = room;
    }

    public void printRoomArea()
    {
        System.out.println("Area of your room is: " + room.getArea() + " square meters");
    }
}
public class ExerciseHouse
{
    public static void main(String[] args) {
        House house = new House(new Room(5,4));
        house.printRoomArea();
    }

}
