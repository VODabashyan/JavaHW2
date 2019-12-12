package problem2;

public class Human {
    private String name;
    private String surname;
    private char gender;
    private int birthYear;

    public Human(String name, String surname, char gender, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    static void isMan(Human human1) {
        String result = human1.getGender() == 'M' ? "Yes" : "No";
        System.out.println(result);
    }

    static String surnameOfTheOldest(Human human1, Human human2, Human human3) {
        String result;
        if (human1.getBirthYear() < human2.getBirthYear()) {
            if (human1.getBirthYear() < human3.getBirthYear()) {
                result = human1.getSurname();
            } else {
                result = human3.getSurname();
            }
        } else {
            if (human2.getBirthYear() < human3.getBirthYear()) {
                result = human2.getSurname();
            } else {
                result = human3.getSurname();
            }
        }
        return result;
    }

    static void concatenateNames(Human human1, Human human2) {
        System.out.println(human1.getName() + " " + human2.getName());
    }

    static void nameSurname(boolean b, Human human1){
        if(b == true) {
            System.out.println(human1.getName());
        } else {
            System.out.println(human1.getSurname());
        }
    }
}
