package com.codedifferently;
//

public class WuMember {
    private final String firstName;
    private final String lastName;
    private final String stageName;

    public WuMember(String firstName, String lastName, String stageName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stageName = stageName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStageName(){return stageName;}

    @Override
    public String toString() {
        return new StringBuilder()
                .append("\nMy first name is " + firstName)
                .append("\nMy last name is " + lastName)
                .append("\nMy stage name is " + stageName)
                .toString();
    }
}
