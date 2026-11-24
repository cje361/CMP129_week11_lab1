public class Smartphone extends Device {
    private double screenSize;

    public Smartphone(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("The smartphone is powering up.");
        System.out.println("Screen size: " + screenSize + " inches");
    }
}