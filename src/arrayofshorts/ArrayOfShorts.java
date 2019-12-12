package arrayofshorts;

//declare an array of shorts and fill it with odd numbers from the range [1;300]
public class ArrayOfShorts {
    public static void main(String[] args) {
        short[] arr = new short[150];
        int j = 0;

        for (int i = 1; i <= 300; i++) {
            if (i % 2 != 0) {
                arr[j++] = (short) i;
            }
        }

        //print the array
        for (short i : arr) {
            System.out.print(i + " ");
        }
    }
}
