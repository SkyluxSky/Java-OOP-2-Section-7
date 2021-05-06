package SkyluxSky;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    //Compositions: we are creating an object that is a part of our case.
    private Dimensions dimensions;

    //constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }
}
