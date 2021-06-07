package JavaSE_Test.Practice;

/**
 * Bakhtiar Semseddin  11:36 AM
 * Write an algorithm to determine if a number n is ‘perfect’.
 * A ‘perfect’ number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Those numbers for which this process ends in 1 are perfect.
 * Return true if n is a perfect number, and false if not.
 * Example:
 * Input: n = 19
 * Output: true
 * Expanded:
 * 1 * 1 + 9 * 9 = 82
 * 8 * 8 + 2 * 2 = 68
 * 6 * 6 + 8 * 8 = 100
 * 1 * 1 + 0 * 0 + 0 * 0 = 1
 *
 * https://www.johndcook.com/blog/2018/03/24/squared-digit-sum/
 * Take any positive integer n and sum the squares of its digits. If you repeat this operation,
 * eventually you’ll either end at 1 or cycle between the eight values 4, 16, 37, 58, 89, 145, 42, and 20.
 *
 * For example, pick n = 389. Then 3² + 8² + 9² = 9 + 64 + 81 = 154.
 *
 * Next, 1² + 5² + 4² = 1 + 25 + 16 = 42, and now we’re at one of the eight special values.
 * You can easily verify that once you land on one of these values you keep cycling.
 */
public class PerfectNumberRecursive {

    public static int digitSquareSumFinder(int n){
        int squareSum=0;
        while(n>0){
            squareSum+=(n%10)*(n%10);
            n/=10;
        }
        return squareSum;
    }

    int[] attractors={1, 4, 16, 37, 58, 89, 145, 42, 20};
    public static boolean isPerfectNumber(int n){
        int newNum=0;
        System.out.println("digitSquareSumFinder(n) = " + digitSquareSumFinder(n));
        if(digitSquareSumFinder(n)==1) {return true;}
        else if(digitSquareSumFinder(n)==4){
            System.out.println("The number is NOT perfect number!");
            return false;
        }else{
          return isPerfectNumber(digitSquareSumFinder(n));
        }

        }

    public static void main(String[] args) {
        int n=13; // n=2,3,4,5,6; 7, 13, 19;
        System.out.println("Original number n =: " + n);
        System.out.println("isPerfectNumber("+n+") = " + isPerfectNumber(n));


    }

}
