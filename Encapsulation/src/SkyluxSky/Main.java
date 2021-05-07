package SkyluxSky;

//Encapsulation - is the method of protecting/restricting access to the components of the objects you are creating.
//Guards against unauthorized access.

import SkyluxSky.Encapsulation.Printer;

public class Main {

    public static void main(String[] args) {

    	/**Example of non Encapsulated Class**/
	    Player player = new Player();
	    //Public Fields - Accessible from main class.
	    player.fullName = "Cam";
	    player.health = 20;
	    player.weapon = "Musket";

	    int damage = 10;
	    player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        damage = 11;
        //Changes the rules of the game due to complete access to the games classes.
		player.health = 200;
		player.loseHealth(damage);
		System.out.println("Remaining Health = " + player.healthRemaining());

		/**Example of Class w/ Encapsulation**/
		//Allows for more control and validation - Change health values to experiment with validation.
		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Cameron", 150,"Gun");
		System.out.println("Initial health is " + enhancedPlayer.healthRemaining());


		/**Encapsulation Challenge**/
		Printer printer = new Printer(10,true);
		System.out.println("Initial Page Count = " + printer.getPagesPrinted());
		printer.addToner(40);
		printer.printPages(109);
		System.out.println("Total Page Count = " + printer.getPagesPrinted());
    }
}
