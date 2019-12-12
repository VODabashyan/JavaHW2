package arrayofbytes;

//declare a byte array and fill it with the even numbers [-30;30]
public class ArrayOfBytes {
    public static void main(String[] args) {
        byte[] array1 = new byte[30];
        int j = 0;

        for (int i = -30; i <= 30; i++) {
            if (i % 2 == 0 && i != 0) {
                array1[j++] = (byte) i;
            }
        }

        //print the array
        for (byte i : array1) {
            System.out.print(i + " ");
        }
    }
}
