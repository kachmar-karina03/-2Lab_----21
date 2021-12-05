package Task3;

public class Student extends Subject{
    protected String Name;
    protected int Age;
    protected Subject subject;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+", Age: "+getAge()+", Subject name: "+getSubjectName()+", Grade: "+getGrade();
    }
}