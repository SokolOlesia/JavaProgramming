package day17_WhileLoop;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                break;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        for (int j = 1; j <= 10; j++) {
            if (j % 2 != 0) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) {
                continue;
            }
            System.out.print(k + " ");
        }
    }
}
