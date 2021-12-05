package Task1;

public class Motor {
    protected int Power = 300;
    protected int Capacity = 4;
    protected String MotorID = "V7";

    public int getPower() {
        return Power;
    }

    public int getCapacity() {
        return Capacity;
    }

    public String getMotorID() {
        return MotorID;
    }

    static {
        System.out.println("This is MOTOR static block!");
    }
    {
        System.out.println("This is MOTOR unstatic block!");
    }
    public Motor() {
        System.out.println("Motors constructor: Power = "+getPower()+", Capacity = "+getCapacity()+", Id = "+getMotorID());
    }

}