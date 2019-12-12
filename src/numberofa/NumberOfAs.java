package numberofa;

//declare a String variable and count the number of a's in it
public class NumberOfAs {
    public static void main(String[] args) {
        String str = "Madagascar";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("The number of a's is: " + count);
    }
}
