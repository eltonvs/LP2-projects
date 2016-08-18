public class Application {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp(true);
        myLamp.showState();

        myLamp.turnOff();
        myLamp.showState();
    }
}
