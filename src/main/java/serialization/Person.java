package serialization;

import java.io.Serializable;
import java.math.BigDecimal;

// To be able to serialize object we need to implement marker interface Serializable
public class Person implements Serializable {

    private final String pesel;
    private String firstName;
    private String lastName;
    //this will exclude weight form being serialized
    transient private BigDecimal weight;

    public Person(String pesel, String firstName, String lastName, BigDecimal weight) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel='" + pesel + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                '}';
    }
}
