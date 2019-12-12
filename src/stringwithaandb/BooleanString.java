package stringwithaandb;

//declare a String variable and find out whether it contains the letter 'b'
public class BooleanString {
    public static void main(String[] args) {
        String str1 = "Madagascar";
        String str2 = "billboard";
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'b') {
                result = "yes";
            } else {
                result = "no";
            }
        }

        System.out.println(result);
    }
}

