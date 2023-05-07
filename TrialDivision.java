import java.util.ArrayList;
import java.util.Scanner;

public class TrialDivision {
  public static Integer[] FindThePrimeFactors(int n) {
    ArrayList<Integer> factorsList = new ArrayList<>();

    while (n % 2 == 0) {
      factorsList.add(2);
      n /= 2;
    }

    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      while (n % i == 0) {
        factorsList.add(i);
        n /= i;
      }
    }

    if (n > 2) {
      factorsList.add(n);
    }

    return factorsList.toArray(new Integer[0]);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (scanner.hasNextInt()) {
      int T = scanner.nextInt();

      for (int t = 0; t < T; t++) {
        int n = scanner.nextInt();
        Integer[] factors = FindThePrimeFactors(n);
        for (int i = 0; i < factors.length; i++) {
          System.out.print(factors[i]);
          if (i < factors.length - 1) {
            System.out.print(" ");
          }
        }
        
        System.out.println();
      }
    }
  }
}