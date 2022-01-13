package day18_NestedLoop;

public class Alphabet {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'C'; i++) { //внешний цикл

            for (char j = 'a'; j <= 'c'; j++) { // внутренний цикл
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
}

//1 itteration внещнего цикла
// 1 itteration внутренного цикла
// i = A
// j = a
//System.out.print(i + "" + j + " "); ---> Aa

//1 itteration внещнего цикла
//2 itteration внутренного цикла
// i = A
// j = b
//System.out.print(i + "" + j + " "); ---> Ab

//1 itteration внещнего цикла
//3 itteration внутренного цикла
// i = A
// j = c
//System.out.print(i + "" + j + " "); ---> Ac

// Aa Ab Ac / перенос строки 1 itteration внещнего цикла закончилась

//2 itteration внещнего цикла
// 1 itteration внутренного цикла
// i = B
// j = a
//System.out.print(i + "" + j + " "); ---> Ba


//Ba Bb Bc / перенос строки 1 itteration внещнего цикла закончилась