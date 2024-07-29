package inheritance;

public class Bike extends Vehicle
{
    String model;

    public Bike(String color, String model){
        super(color);
        this.model = model;
    }

    public void sound(){
        honk();
    }

    public void drive(){
        System.out.println("hi i m driving super bike");
    }
}
