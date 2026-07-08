package Java8Concept.MethodAndConstructorReference;

import java.util.Arrays;
import java.util.List;

public class ReferenceToAnInstanceMethodOfAParticularObject {

    public static void main(String[] args) {

        MethodReferenceFromInstanceOfObject m = new MethodReferenceFromInstanceOfObject();

        List<String> data = Arrays.asList("Java", "Spring", "Boot");
        data.forEach(m::test);

    }

}
