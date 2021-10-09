package exceptions;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private List<String> content = new ArrayList<>();

    // we need to declare all checked exceptions that will be thrown in method
    public void addToBasket(String item) throws BoxOverflowException {
        if(item == null) {
            //runtime exceptions (NullPointerException extends RuntimeException) should not be declared in method definition
            throw new NullPointerException("Item can't be null");
        }
        if(content.size() >= 2) {
            //we can create our own exceptions by extending Exception or RuntimeException class
            throw new BoxOverflowException("Box is full, item: " + item + " can't be added.",15);
        } else {
            content.add(item);
        }
    }

    public int addToBasketAlternative(String item) {
        if (item == null) {
            return 2;
        }
        if (content.size() >= 2) {
            return 15;
        } else {
            content.add(item);
        }
        return 0;
    }

    public List<String> getContent() {
        return content;
    }
}
