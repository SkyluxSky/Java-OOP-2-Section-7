package SkyluxSky;

/*Composition is used to model parts of the greater whole.
* For example, a computer has a monitor, motherboard, GPU, CPU, and RAM.
* Non of these components are computers, just make up a computer.*/

import SkyluxSky.HouseChallenge.*;

public class Main {

    public static void main(String[] args) {
        //Creates Case
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220b", "Dell", "240", dimensions);

	    //Creates monitor and resolution within the same line of code.
	    Monitor theMonitor =  new Monitor("27inch", "Acer", 27, new Resolution(2540,1440));

	    //Creates MotherBoard
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        //Created PC Class - Example of composition.
        PC thePC = new PC(theCase,theMonitor,theMotherBoard);

        //Class returning class contained within instance, returning specified method.
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        //Use case composition applied to initiating multiple objects.
        thePC.powerUp();



        //Challenge
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic", false , 75);

        Bedroom bedroom = new Bedroom("Cam's Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
