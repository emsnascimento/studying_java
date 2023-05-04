import java.util.Scanner;

public class TrialDivision {
  public static void FindThePrimeFactors(int n) {
    while (n % 2 == 0) {
      System.out.print(2 + " ");
      n /= 2;
    }

    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      while (n % i == 0) {
        System.out.print(i + " ");
        n /= i;
      }
    }

    if (n > 2) {
      System.out.print(n);
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      final int T = scanner.nextInt();

      for (int t = 0; t < T; t++) {
        int n = scanner.nextInt();
        FindThePrimeFactors(n);
      }
    }
  }
}