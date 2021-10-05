package oop;

public class Laptop extends Computer {

    private Integer batteryLevel;

    public Laptop(String manufacturer, String cpu, Integer ramSize, Integer batteryLevel) {
        super(manufacturer, cpu, ramSize);
        this.batteryLevel = batteryLevel;
    }

    public void saveBattery() {
        System.out.println("Battery saving mode on");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                super.toString() + " " +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
