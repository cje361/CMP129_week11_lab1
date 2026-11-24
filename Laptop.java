public class Laptop extends Device {
    private String processor;

    public Laptop(String processor) {
        this.processor = processor;
    }

    @Override
    public void turnOn() {
        System.out.println("The laptop is starting.");
        System.out.println("Processor: " + processor);
    }
}