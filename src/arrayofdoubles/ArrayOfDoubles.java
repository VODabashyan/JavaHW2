package arrayofdoubles;

//declare an array of doubles and print its numbers greater than 24.56
public class ArrayOfDoubles {
    public static void main(String[] args) {

        double[] arr = new double[10];
        double num = 18.12;

        for (int i = 0; i < 10; i++) {
            arr[i] = num + i;
        }

        //print the array
        for (double number : arr) {
            if (number > 24.56) {
                System.out.print(number + " ");
            }
        }
    }
}
