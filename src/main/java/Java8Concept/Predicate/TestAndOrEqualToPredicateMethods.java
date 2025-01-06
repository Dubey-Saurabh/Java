package Java8Concept.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestAndOrEqualToPredicateMethods {

    public static void main(String[] args) {

        /*Predicate is a valued boolean function or a condition
         * We can always use predicate if we want to check something by a condition*/
        Predicate<Integer> salaryGreaterThanLac = x -> x > 100000;
        System.out.println(salaryGreaterThanLac.test(12000000));


        /*Another way*/
        Predicate<Integer> predicate = x -> x % 2 == 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 7, 8, 9);
        int sum = list.stream().filter(predicate).mapToInt(x -> x).sum();
        System.out.println(sum);

        /*Another way*/
        Predicate<Integer> predicate1 = x -> x % 2 == 0;
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 7, 8, 9);
        for (Integer num : list1) {
            if (predicate1.test(num)) {
                System.out.println(num);
            }
        }

        /*And method*/
        Predicate<String> startsWithLetterS = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> endsWithLetterH = x -> x.toLowerCase().charAt(x.length() - 1) == 'h';
        Predicate<String> and = startsWithLetterS.and(endsWithLetterH);
        System.out.println(and.test("Saurabh"));

        /*Or method*/
        Predicate<String> startsWithLetterM = x -> x.toLowerCase().charAt(0) == 'm';
        Predicate<String> endsWithLetterY = x -> x.toLowerCase().charAt(x.length() - 1) == 'y';
        Predicate<String> or = startsWithLetterM.or(endsWithLetterY);
        System.out.println(or.test("Saurabh"));

        /*negate method*/
        System.out.println(startsWithLetterM.negate().test("Money"));

        /*isEqual method*/
        Predicate<Object>predicate2 = Predicate.isEqual(3);
        System.out.println(predicate2.test(3));


    }

}
