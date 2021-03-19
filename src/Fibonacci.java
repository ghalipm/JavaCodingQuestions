public class Fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.println("The "+ n+ "th term of the Fibonacci sequence :" +fib(n));

    }
    public static int fib(int num){
        int x=0;
        int y=1;
        int z=0;
        for (int i = 0; i < num; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return z;
    }
}
