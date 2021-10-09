package exceptions;

import java.util.List;

public class SimpleExceptionHandling {

    public static void main(String[] args) {
        List<String> names = List.of("John");

        //try clousure will allow us to handle the exception
        try {
            //this method will throw exception cause there is no 3rd element
            get3rdIndex(names);
            // here we will catch exception and provide handling
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Warning!: Index ot of bounds");
            e.printStackTrace();
            // we may catch different exceptions and provide various handling for them
        } catch (Exception e) {
            e.printStackTrace();
            // finally, will be always executed
        } finally {
            System.out.println("Everything is fine");
        }

        System.out.println("We made it here");
    }

    //Get third param
    private static void get3rdIndex(List<String> names) {
        names.get(3);
    }
}
