package arrayofmultiplesoffive;

//declare an integer array and print its numbers that are multiples of five.
public class ArrayOfMultiplesOfFive {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 1; i <= 20; i++) {
            arr[i - 1] = i;
        }

        //print the array
        for(int num: arr) {
            if (num%5 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
