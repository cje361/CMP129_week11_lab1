import java.util.ArrayList;

public class DeviceTest {

    public static void main(String[] args) {
        Device phone = new Smartphone(6.1);
        Device laptop = new Laptop("Intel Core i7");

        ArrayList<Device> devices = new ArrayList<Device>();
        devices.add(phone);
        devices.add(laptop);

        for (Device d : devices) {
            d.turnOn();
            System.out.println();
        }
    }
}