package java17;

public record StudentRecord(String firstName) {
    public void sayHello() {
        System.out.println("Hi it is " + firstName);
    }
}
