import java.util.Arrays;

/**
 * Program to test your code in
 * 
 * @author
 */
public class Test
{
    /**
     * Main function to run tests
     * @param args
     */
    public static void main(String[] args) {
        double[][] testArray = {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}}; //replace these numbers to test

        System.out.println("Array before merge is called: " + Arrays.deepToString(testArray));

        double[] result = MergeKLists.mergeKLists(testArray);
        System.out.println("Array after merge is called: " + Arrays.toString(result));
    }
}