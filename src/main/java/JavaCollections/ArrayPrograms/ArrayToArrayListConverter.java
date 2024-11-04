package JavaCollections.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListConverter {

    public static void main(String[] args) {

        String[] my_array = new String[] {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        ArrayList arrayList = new ArrayList(Arrays.asList(my_array));
        arrayList.add(15.6);

        System.out.println(arrayList);

    }

}
