package SkyluxSky;

//Public comes before class in this instance because class is in a separate file.
public class Car {
    //basic fields
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    //constructor
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    //methods
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}
