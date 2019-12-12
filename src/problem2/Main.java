package problem2;

public class Main {
    public static void main(String[] args) {

        System.out.println("the sum is " + FunctionManager.sum(10, 5));
        System.out.println("the product is " + FunctionManager.multiply(1.2, 3.5));
        FunctionManager.compareFloats(1.5f, 1.2f);
        FunctionManager.maxLong(5000000000l, 4000000000l, 2000000000l);
        System.out.println();

        Human hum1 = new Human("John", "Smith", 'M', 1963);
        Human hum2 = new Human("Mark", "Miller", 'M', 1945);
        Human hum3 = new Human("Mary", "Rose", 'F', 2000);

        Human.isMan(hum1);

        System.out.println(Human.surnameOfTheOldest(hum1, hum2, hum3));
        Human.concatenateNames(hum1, hum3);

        boolean b = true;
        Human.nameSurname(b, hum1);

        boolean c = false;
        Human.nameSurname(c, hum1);

        System.out.println();

        int[] array1 = {10, 5, 99, 150, 4, 25};
        System.out.println(FunctionManager.maxNumber(array1));

        float[] array2 = {1.2f, 0.8f, 0.1f, 5.6f};
        System.out.println(FunctionManager.minIndex(array2));
    }
}
