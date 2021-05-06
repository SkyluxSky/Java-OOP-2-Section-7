package SkyluxSky;
//extends only allows you to inherit form one class at a time.
//Meanwhile, composition allows for many classes to be created in a composition class.
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;


    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy Graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }
//
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
