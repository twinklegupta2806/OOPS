package inheritance;

public class Vehicle
{
    String color;

    public Vehicle(String color){
        this.color = color;
    }

    protected void honk(){
        System.out.println("HONK HONK HONK HONK HONK");
    }

    public void drive(){
        System.out.println("hi i m driving");
    }
}
