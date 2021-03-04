/**
 * Class that merges a list together
 * THIS SHOULD BE VERY SIMILAR TO HOW MERGE WORKS FOR MERGE SORT!
 * 
 * @author
 */

public class MergeKLists {

    private static double[] merge(double[] arr1, double[] arr2) {
        int t = 0;
        int l = 0;
        int r = 0;
        double[] target = new double[arr1.length + arr2.length];

        while (t < arr1.length + arr2.length) {
            if (l == arr1.length) {
                target[t++] = arr2[r++];
            }
            else if (r == arr2.length) {
                target[t++] = arr1[l++];
            }
            else if (arr1[l] < arr2[r]) {
                target[t++] = arr1[l++];
            }
            else {
                target[t++] = arr2[r++];
            }
        }
        return target;
    }

    /**
     * Function that merges lists together from an outer array
     * @param outerArray the array that contains lists to be merged
     * @return an array with all of the numbers from the inner lists merged
     */

    public static double[] mergeKLists(double[][] outerArray) {
        int t = 2;
        double[] result = merge(outerArray[0],outerArray[1]);

        while (t < outerArray.length) {
            result = merge(result, outerArray[t]);
            t++;
        }
        return result;
    }
}