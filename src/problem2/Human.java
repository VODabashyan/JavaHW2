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
}
