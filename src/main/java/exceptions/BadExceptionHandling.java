package exceptions;

public class BadExceptionHandling {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,2,3,4};

        try {
            int index = 0;
            while (true) {
                System.out.println(integers[index]);
                index++;
            }
        }catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}
