package day17_WhileLoop;

public class While_DoWhile {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println(frequency);


        System.out.println("-------------------------------");

        String sent = "cat cat cat dog fog cat dog cat Cat cAt CaT";

        int countCat = 0;

        while(sent.toLowerCase().contains("cat")){
            sent = sent.toLowerCase().replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);
    }
}
