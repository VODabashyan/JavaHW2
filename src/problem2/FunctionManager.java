package problem2;

public class FunctionManager {

    public int sum(int x, int y) {
        return x + y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public void compareFloats(float x, float y) {
        String result = x > y ? "Yes" : "No";
        System.out.println(result);
    }

    public void maxLong(long x, long y, long z) {
        long result = x > y ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println(result);
    }
}
