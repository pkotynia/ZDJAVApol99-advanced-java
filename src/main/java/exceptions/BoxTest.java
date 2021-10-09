package exceptions;

public class BoxTest {

    public static void main(String[] args) {
        Box box = new Box();

        try {
            //box.addToBasket(null);
            box.addToBasket("first");
            box.addToBasket("second");
            box.addToBasket("third");
        } catch (BoxOverflowException e) {
            System.out.println("Error code " + e.getErrorCode());
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println(box.getContent());
        System.out.println("Bye");

        System.out.println(box.addToBasketAlternative("fourth"));
    }
}
