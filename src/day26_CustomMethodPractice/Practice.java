package day26_CustomMethodPractice;

public class Practice {
    public static int getDup(String[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (frequency(arr, arr[i]) > 1) {
                count++;
            }
        }
        return count;
    }

    public static int frequency(String[] arr, String str) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = { "1", "2", "aa", "1", "aa" };
        System.out.println(getDup(arr));
    }


}
