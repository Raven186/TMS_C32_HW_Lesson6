package coms.teachmeskills.c32.lesson6;

public class Student {
    String firstName;
    String middleName;
    int passportNumber;
    String groupName;

    public Student(String firstName, String middleName, int passportNumber, String groupName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
    }

    public void showInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Passport Number: " + passportNumber);
        System.out.println("Group: " + groupName);
    }
}
