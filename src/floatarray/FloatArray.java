package floatarray;

//declare a float array and print its numbers ranging between 35.56 and -34.655
public class FloatArray {
    public static void main(String[] args) {
        float[] arr = new float[20];
        float num = -150.56f;


        for (int i = 0; i < 20; i++) {
            arr[i] = num + 20 * i;
        }

        //print the array
        for (float number : arr) {
            if (number < -34.655 || number > 35.56) {
                System.out.print(number + " ");
            }
        }
    }
}
