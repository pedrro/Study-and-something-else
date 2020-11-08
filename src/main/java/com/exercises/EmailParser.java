package com.exercises;

public class EmailParser {
    public String predict(String company, String fullName) {
        String[] fullNameSpit = fullName.split(" ");

        String pattern = "s.brin@google.com".split("@")[0];
        String[] splitByDot = pattern.split("\\.");
        int firstPartSize = splitByDot[0].length();
        int secondPartSize = splitByDot[1].length();
        String nameEmail = "";

        if(firstPartSize == 1) {
            String firstEmailChar;
            firstEmailChar = fullNameSpit[0].substring(0, firstPartSize);
            String surname = fullNameSpit[1];
            nameEmail = firstEmailChar+ "."+surname;

        } else if (secondPartSize == 1) {
            String secondEmailChar = fullNameSpit[1].substring(0, firstPartSize);
            String firstName = fullNameSpit[0];
             nameEmail = firstName+ "."+secondEmailChar;
        } else {
             nameEmail = fullNameSpit[0] + "." + fullNameSpit[1];
        }

        String fullEmail = nameEmail + "@" + company + ".com";

        return fullEmail.toLowerCase();
    }
}
