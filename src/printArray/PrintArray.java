package printArray;

//declare and print an array
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 2, 1200, 300, 21, -30};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
