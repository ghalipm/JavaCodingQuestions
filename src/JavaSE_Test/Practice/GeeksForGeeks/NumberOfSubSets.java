package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.Arrays;

/**
 * Given an array arr[] of N elements.
 * Find the number of subsets whose product
 * of elements is less than or equal to a given integer K.
 *
 * Example 1:
 *
 * Input:
 * N = 4,  arr[] = {2, 4, 5, 3}, K = 12;
 * Output: 8
 * Explanation: All possible subsets whose products are less than 12 are:
 * (2), (4), (5), (3), (2, 4), (2, 5), (2, 3), (4, 3)
 *
 * Example 2:
 * Input:
 * N = 3, arr[] = {9, 8, 3}, K = 2;
 * Output: 0
 * Explanation: There is no subsets with product less than or equal to 2.
 *
 * Constraints:
 * 1 ≤ N ≤ 30
 * 1 ≤ arr[i] ≤ 10
 * 1 ≤ K ≤ 10^6
 *
 * if you succeed, submit your answer to
 */

public class NumberOfSubSets {

    static int N=4;
    static int K=2;
    static int[] arr={2, 4, 5, 3};
    /*
    static int N=3;
    static int K=2;
    static int[] arr={9, 8, 3};

     */

    public static void main(String[] args) {
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.stream(arr).sorted().forEach(System.out::println) :  ");
        Arrays.stream(arr).sorted().forEach(System.out::println);
        //System.out.println("numOfSubsets(3,2,"+Arrays.toString(arr)+") = " + numOfSubsets(3, 2, arr));
        System.out.println("numOfSubsets(4,2,"+Arrays.toString(arr)+") = " + numOfSubsets(4, 2, arr));
    }

    public static int numOfSubsets(int n, int k, int[] array){
        int subSetNums=0;
        Arrays.sort(array);
        System.out.println("sorted array = " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            //System.out.println("array[i] = " + array[i]); // now array is sorted.
            if(array[i]>k){
                System.out.println("(array[i] > k) = (" + (array[i])+">"+k+")"); subSetNums=0; break;}
            else{
                if(array[i]<=k){ subSetNums+=1;}
                else{continue;}
            }


        }

        return subSetNums;
    }


}
