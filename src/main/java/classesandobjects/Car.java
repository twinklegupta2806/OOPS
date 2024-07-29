package classesandobjects;

public class Car
{
    String make;
    String model;
    int year;

    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start_engine(){
        System.out.println(this.make + " with engine " + this.model + " started ");
    }
}
