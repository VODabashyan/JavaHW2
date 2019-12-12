package problem2;

public class FunctionManager {

    static int sum(int x, int y) {
        return x + y;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static void compareFloats(float x, float y) {
        String result = x > y ? "Yes" : "No";
        System.out.println(result);
    }

    static void maxLong(long x, long y, long z) {
        long result = x > y ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println(result);
    }

    static int maxNumber(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
