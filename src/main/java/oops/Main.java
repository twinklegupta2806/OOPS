package oops;

import abstraction.abstractclasses.Circle;
import abstraction.abstractclasses.Rectangle;
import abstraction.abstractclasses.shape;
import abstraction.interfaces.Document;
import abstraction.interfaces.PDF;
import abstraction.interfaces.Word;
import classesandobjects.Car;
import encapsulation.BankAccount;
import inheritance.Bike;
import inheritance.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Car car = new Car("Toyota", "Corolla", 2020);
        car.start_engine();

        Car chevy = new Car("Chevy", "Impala", 2019);
        chevy.start_engine();

        BankAccount b1 = new BankAccount(100, "234");
        System.out.println(b1.get_balance());
        b1.withdraw(500);
        b1.deposit(600);
        b1.withdraw(500);

        Vehicle vehicle = new Vehicle("red");
        Bike bike = new Bike("red", "mercedes");
        bike.sound();
        vehicle.drive();

        Document[] documents = new Document[2];
        documents[0]= new Word();
        documents[1]=new PDF();

        for (int i=0;i<2;i++){
            documents[i].show();
        }

        shape[] shapes = new shape[2];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();

        for(int i=0;i<2;i++){
            shapes[i].learn();
            shapes[i].area();
        }
    }
}