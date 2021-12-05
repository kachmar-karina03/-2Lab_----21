package Task1;

public class Vechile extends Motor {
    protected int Seats= 5;
    protected int Doors = 4;
    protected int Wheels=4;
    static {
        System.out.println("This is VECHILE static block!");
    }

    {
        System.out.println("Tis is VECHILE unstatic block!");
    }

    public int getSeats() {
        return Seats;
    }

    public int getDoors() {
        return Doors;
    }

    public int getWheels() {
        return Wheels;
    }

    public Vechile() {
        System.out.println("Vechile constructor: Seats = "+getSeats()+", Doors = "+getDoors()+", Wheels = "+getWheels());
    }
}