import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClass {

    private static String[] reverseSort(String[] array) {
        Comparator<String> reverseComparator = new Comparator<String>() {
            /* Anonymous Class */
            @Override
            public int compare(String string1,String string2) {
                return string2.compareTo(string1);
            }};
        Arrays.sort(array, reverseComparator);
        return array;
    }
}
