import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayListProblem {
  public static void main(String[] args) {
    List<List<Integer>> listOfList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int d = sc.nextInt();
      List<Integer> list = new ArrayList<>();
      for (int j = 0; j < d; j++) {
        int element = sc.nextInt();
        list.add(element);
      }
      listOfList.add(list);
    }

    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      try {
        System.out.println(listOfList.get(x - 1).get(y - 1));
      } catch (Exception e) {
        System.out.println("ERROR!");
      }
    }
  }
}