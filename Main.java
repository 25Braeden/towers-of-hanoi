public class Main {
  static void towers_of_hanoi(int n, int source, int target, int aux) {
    if (n == 1) {
      System.out.printf("Move disk from %d to %d\n", source, target);
      return;
    }

    towers_of_hanoi(n - 1, aux, target, source);

    System.out.printf("Move disk from %d to %d\n", source, target);

    towers_of_hanoi(n - 1, aux, target, source);
  }

  public static void main(String[] args) {
    int numDisks = Integer.parseInt(args[0]);
    int sourcePeg = Integer.parseInt(args[1]);
    int targetPeg = Integer.parseInt(args[2]);
    int auxPeg = Integer.parseInt(args[3]);

    towers_of_hanoi(numDisks, sourcePeg, targetPeg, auxPeg);
  }
}
