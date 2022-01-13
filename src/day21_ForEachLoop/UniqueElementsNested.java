package day21_ForEachLoop;

public class UniqueElementsNested {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (String each : words) { //each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"

            int count = 0;
            for (String word : words) { //word: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                if (word.equals(each)) { // count frequency of one name
                    count++;
                }
            }

            if(count == 1 ) {
                System.out.println(each);
            }
            //System.out.println("count = " + count);
        }


    }
}


//    String[] words = {"Layan", "Layan", "Oleksandr", "Adam", "Cihad", "Cihad", "Cydeo"};
//
//    String element = "";
//
//        for (int j = 0; j < words.length; j++) {
//        element = words[j];
//        int frequency = 0;
//        for (int i = 0; i < words.length; i++) {// finds the frequency of element from array
//        if (words[i].equals(element)) {
//        frequency++;
//        }
//        }
//        if(frequency == 1){
//        System.out.println(element);
//        }
//        }