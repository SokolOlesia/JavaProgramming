package day22_MultiDimensionArray;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String[][] items = {
                // 0         1
                {"Apple", "Banana", "Grape", "Avocado"}, // 0
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, // 1
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} //2
        };
//                  вагон  : состав
        for (String[] item : items) { // 0,1,2 вагоны
            //       человек : вагон
            for (String each : item) {// заходит в вагон и видит людей
                System.out.print(each + "\t"); //Apple        Banana       Grape        Avocado
            }
            System.out.println();
        }
/*
1. Иттерация цикла
Вагон(индекс 0) (1 loop)
Apple        Banana       Grape        Avocado (2 loop)
[0][0]       [0][1]       [0][2]        [0][3]
System.out.println(); - перенеси на следующую строчку для напсиания второй иттерации

2. Иттерация цикла
Вагон(индекс 1) (1 loop)
Apple        Banana       Grape        Avocado (2 loop)
[1][0]       [1][1]       [1][2]        [1][3]
System.out.println(); - перенеси на следующую строчку для напсиания второй иттерации


3. Иттерация цикла
Вагон(индекс 1) (1 loop)
Apple        Banana       Grape        Avocado (2 loop)
[2][0]       [2][1]       [2][2]        [2][3]
System.out.println(); - перенеси на следующую строчку для напсиания второй иттерации





 */

        System.out.println("--------------------");

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }


/*
1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water
 */
        System.out.println("--------------------");


        String result = "";
        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                //System.out.print(items[i][j] + "\t");
                for(int h = items[i][j].length() - 1; h >= 0; h--){
                    result = items[i][j].charAt(h) +"";
                    System.out.print(result);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
/*
1. Иттерация цикла
Вагон(индекс 0) (1 loop)
Apple        Banana       Grape        Avocado (2 loop) // человеки
[0][0]       [0][1]       [0][2]        [0][3]
elppA " "    ananaB
System.out.println(); - перенеси на следующую строчку для напсиания второй иттерации

2. Иттерация цикла
Вагон(индекс 1) (1 loop)
Apple        Banana       Grape        Avocado (2 loop)
[1][0]       [1][1]       [1][2]        [1][3]
System.out.println(); - перенеси на следующую строчку для напсиания второй иттерации


3. Иттерация цикла
Вагон(индекс 1) (1 loop)
Apple        Banana       Grape        Avocado (2 loop)
[2][0]       [2][1]       [2][2]        [2][3]
System.out.println(); - перенеси на следующую строчку для напсиания второй иттерации





 */
        System.out.println("--------------------");

        for (String[] item : items) { // 0,1,2 вагоны
            for (int j = item.length - 1; j >= 0; j--) {
                System.out.print(item[j] + "\t");
            }
            System.out.println();
        }
/*
2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke
 */
        System.out.println("--------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {

                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
            /*
            3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
             */
        }
    }
}

/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado



				2D array =
 */