package Task1;

public class Car extends Vechile{
    protected String CarName = "BMW";
    protected String CarMark = "M6";
    static {
        System.out.println("This is CAR static block");
    }
    {
        System.out.println("This is CAR unstatic block");
    }

    public String getCarName() {
        return CarName;
    }

    public String getCarMark() {
        return CarMark;
    }
    public Car()
    {
        System.out.println("Car constructor: Car Mark is "+getCarName()+", Car Model is "+getCarMark());
    }
}