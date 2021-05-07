package SkyluxSky;

//Polymorphism - the method or mechanism in OOP to allow actions to act differently based on the action it is being performed on.
//Useful to create classes in a single java file - if they are compact.

class Movie{
    //Field
    private String name;

    //Constructor
    public Movie(String name) {
        this.name = name;
    }

    //Method
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    //Constructor
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    //Constructor
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    //Constructor
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie{
    //Constructor
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie{
    //Constructor
    public Forgetable(){
        super("Forgetable");
    }

    // No Plot Method.
}




public class Main {

    public static void main(String[] args) {
	    for (int i = 0; i < 11; i++){
	        Movie movie = randomMovie();
	        //movie.plot() assigns different functionalities to a single object
            //if there is no plot method present, it will take the method from the parent class.
            System.out.println("Movie #" + i + " " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }


    //Returns random movie
    public static Movie randomMovie(){
        //Returns random number between 1 and 5.
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        //Return statements automatically break out of a switch.
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

            default:
                return null;

        }
    }
}




