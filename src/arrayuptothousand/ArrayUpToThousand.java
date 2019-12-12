package arrayuptothousand;
//declare an array and fill it with numbers from 1 up to 1000.
public class ArrayUpToThousand {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        int index = 0;
        while(index != 1000) {
            arr[index] = index + 1;
            index++;
        }

        //print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

