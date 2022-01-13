package day18_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int j = 0; j < 4; j++) {
            System.out.println("Create a new loop");
            for (int i = 0; i < 5; i++) {
                System.out.println("Cs");
            }
        }
    }
}
// j = 0 1 itteration внешнего цикла
// i = 0 1 itteration внутреннего цикла Create a nested loop
// i = 1 Create a nested loop
// i = 2 Create a nested loop
// i = 3 Create a nested loop
// i = 4 Create a nested loop
// j = 1
// i = 0 1 itteration внутреннего цикла Create a nested loop
// i = 1 Create a nested loop
// i = 2 Create a nested loop
// i = 3 Create a nested loop
// i = 4 Create a nested loop
// j = 2