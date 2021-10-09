package annotations;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsTest {

    public static void main(String[] args) {
        List rawTypeList = new ArrayList();

        @SuppressWarnings("unchecked")
        List<String> strings = rawTypeList;

    }
}
