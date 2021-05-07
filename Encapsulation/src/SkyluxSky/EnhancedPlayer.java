package SkyluxSky;

//to change all names of a single variable, right click and refactor -> Change Name.

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.hitPoints = (health > 0 && health <= 100)? health: 100;
        this.weapon = weapon;
    }

    //Only method available to reduce players health via Encapsulation.
    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player.
        }
    }

    public int healthRemaining(){
        return this.hitPoints;
    }
}
