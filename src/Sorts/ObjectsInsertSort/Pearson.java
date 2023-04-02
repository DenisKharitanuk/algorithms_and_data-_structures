package Sorts.ObjectsInsertSort;

public class Pearson {
    private String lastName;
    private String firstName;
    private int age;

    public Pearson(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    protected void displayPearson() {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First Name: " + firstName);
        System.out.println(", Age " + age);
    }

    protected String getLast() {
        return lastName;
    }


}
