import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }
  private static long fib(int n) {
  	  if (n<=1) return n;
  	  long[] numbers = new long[n+1];
  	  numbers[0] = 0;
  	  numbers[1] = 1;
  	  for(int i = 2; i<= n; i++) {
  		  numbers[i] = numbers[i-1] + numbers[i-2];
  	  }
  	  return (int)numbers[numbers.length-1];
    }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(fib(n));
  }
}
