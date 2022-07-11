import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }
    private static int fib(int n) {
    	  if (n<=1) return n;
    	  long[] numbers = new long[n+1];
    	  numbers[0] = 0;
    	  numbers[1] = 1;
    	  for(int i = 2; i<= n; i++) {
    		  numbers[i] = (numbers[i-1] + numbers[i-2])%10;
    	  }
    	  return (int)numbers[numbers.length-1];
      }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = fib(n);
        System.out.println(c);
    }
}

