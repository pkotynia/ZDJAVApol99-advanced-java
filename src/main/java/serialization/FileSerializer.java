package serialization;

import java.io.*;
import java.math.BigDecimal;

public class FileSerializer {

    public static void main(String[] args) {
        Person franek = new Person("11223312345", "Franek", "Kowalski", new BigDecimal("73.5"));

        printPerson(franek);

        serializePresonObjectToFile(franek);

        deserializePersonObjectFromFile();

    }

    private static void printPerson(Person franek) {
        System.out.println("Franek before serialization " + franek);
    }

    private static void deserializePersonObjectFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/person");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object deserializedObject = objectInputStream.readObject();
            if (deserializedObject instanceof Person) {
                Person deserializedFrank = (Person) deserializedObject;
                System.out.println("Franek after serialization " + deserializedFrank);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serializePresonObjectToFile(Person franek) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/person");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(franek);
            objectOutputStream.flush();
            //since we are using autocloseable try catch we do not need to explicitly invoke close method
            //objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
