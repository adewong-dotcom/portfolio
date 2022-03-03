import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }
  
  private static long lcm(int a,int b) {
	  long gcd = euclidGCD(a, b);
	  if(a%b == 0 || b%a == 0) {
		  long answer = (a%b == 0)? a : b;
		  return answer;
	  }
	  long multiplication = (long) a *(long)b;
	 return multiplication/gcd;
  }
  
static int euclidGCD(int a, int b) {
	if (b == 0) return a; // base case
	
	int primeA = a%b;
	return euclidGCD(b, primeA);
}

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }
}
