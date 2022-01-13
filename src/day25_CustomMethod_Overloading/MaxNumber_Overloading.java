package day25_CustomMethod_Overloading;

public class MaxNumber_Overloading {
    //     1. create a method that can return the max number from an integer array
    public static int maxNumber(int[] arr) {
        int max = 0;

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //    2. create a method that can return the max number from double array
    public static double maxNumber(double[] arr) {
        double max = 0;

        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //    3. create a method that can return the max number from long array
    public static long maxNumber(long[] arr) {
        long max = 0L;

        for (long each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //    4. create a method that can return the max number from short array
    public static short maxNumber(short[] arr) {
        short max = 0;

        for (short each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //    5. create a method that can return the max number from float array
    public static float maxNumber(float[] arr) {
        float max = 0F;

        for (float each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    //    6. create a method that can return the max number from byte array
    public static byte maxNumber(byte[] arr) {
        byte max = 0;

        for (byte each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

}

/*
Task 4:
    1. create a method that can return the max number from an integer array

    2. create a method that can return the max number from double array

    3. create a method that can return the max number from long array

    4. create a method that can return the max number from short array

    5. create a method that can return the max number from float array

    6. create a method that can return the max number from byte array



 */