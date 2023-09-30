/**
 * Names class
 * This class contains tasks related to the use of the Strings class.
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Names {

    /**
     * upperCaseName()
     * Makes the inputted name uppercase
     * @param name  inputted name
     * @return uppercase name
     */
    public String upperCaseName(String name) {
        return name.toUpperCase();
    }

    /**
     * fullName()
     * Puts the first name and second name together with a space between them
     * @param firstName first name
     * @param secondName    second name
     * @return first name + second name
     */
    public String fullName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }

    /**
     * letterCount()
     * Counts how many letters are in the name
     * @param name  inputted name
     * @return length of the name
     */
    public int letterCount(String name) {
        return name.length();
    }

    /**
     * theSameName()
     * Checks if name one matches name two
     * @param nameOne   inputted name one
     * @param nameTwo   inputted name two
     * @return if name one matches name two is true or false
     */
    public Boolean theSameName(String nameOne, String nameTwo) {
        return nameOne.equalsIgnoreCase(nameTwo);
    }

    /**
     * properCaseName()
     * Formats the name so the first letter is uppercase and the rest is lowercase
     * @param name  inputted name
     * @return formatted name
     */
    public String properCaseName(String name) {
        String firstLetter = name.substring(0,1).toUpperCase(); // makes first letter uppercase
        String remainingLetters = name.substring(1).toLowerCase(); // makes rest of name lowercase
        return firstLetter + remainingLetters;
    }
}
