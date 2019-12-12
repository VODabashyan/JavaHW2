package bubblesort;

//declare an array of doubles and sort its numbers in ascending/descending order
public class BubbleSort {
    public static void main(String[] args) {
        double[] arr = {12.3, 1.2, 2.4, 0.7, 6.2, 3.5, 0.5, 0.1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(bubbleSortAscending(arr)[i] + " ");
        }


        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(bubbleSortDescending(arr)[i] + " ");
        }

    }

    static double[] bubbleSortAscending(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static double[] bubbleSortDescending(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
