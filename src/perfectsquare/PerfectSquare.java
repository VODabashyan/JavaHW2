package perfectsquare;
//Problem 1.12 find the count of numbers that are some degree of two

public class PerfectSquare {
    public static void main(String[] args) {
        int arr[] = {2, 10, 576, 8, 15, 16};
        int count = 0;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            while (temp % 2 == 0) {
                temp = temp / 2;
            }

            if (temp == 1) {
                count++;
            }
        }
        System.out.println(count + " numbers in the array are some degree of two");
    }
}

