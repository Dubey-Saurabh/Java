package JavaCollections.ArrayPrograms;

import java.util.Arrays;

public class ObjectArray {

    public static void main(String[] args) {

        Object object[] = new Object[5];
        object[0]="Saurabh";
        object[1]='v';
        object[2]=23.45;
        object[3]=340L;
        object[4]=34.2f;

        System.out.println(Arrays.toString(object));
    }
}
