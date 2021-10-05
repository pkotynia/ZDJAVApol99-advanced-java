package oop;

import java.util.Objects;

public class Computer {

    private Integer serialNumber;
    private final String manufacturer;
    private final String cpu;
    private Integer ramSize;

    public String start() {
        return "Computer Started";
    }

    public Computer(String manufacturer, String cpu, Integer ramSize) {
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.ramSize = ramSize;
    }

    public Computer(Integer serialNumber, String manufacturer, String cpu, Integer ramSize) {
        this(manufacturer, cpu, ramSize);
        this.serialNumber = serialNumber;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ramSize=" + ramSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return Objects.equals(serialNumber, computer.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
        //return 39;
    }
}
