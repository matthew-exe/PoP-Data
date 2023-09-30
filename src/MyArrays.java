import java.util.Random;

/**
 * MyArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class MyArrays {

    /**
     * addUpNumbers()
     * adds up 5 numbers
     * @param num1 number 1
     * @param num2 number 2
     * @param num3 number 3
     * @param num4 number 4
     * @param num5 number 5
     * @return total of the calculation
     */
    public int addUpNumbers(int num1, int num2, int num3, int num4, int num5) {
        return num1+num2+num3+num4+num5;
    }

    /**
     * addUpNumbers()
     * adds up an array of numbers
     * @param numbers   array of numbers
     * @return total of the calculation
     */
    public int addUpNumbers(int[] numbers) {
        int total = 0;
        for (int num:numbers) {
            total = total + num;
        }
        return total;
    }

    /**
     * averageOfNumbers()
     * calculates the average of an array of numbers
     * @param numbers   array of numbers
     * @return average of numbers
     */
    public double averageOfNumbers(int[] numbers) {
        double average = 0;
        for (int num:numbers) {
            average = average + num;
        }
        return average / numbers.length;
    }

    /**
     * convertToCelsius()
     * converts an array of fahrenheit temperatures to celsius
     * @param fahrenheitTemps   array of fahrenheit temperatures
     * @return array of converted temperatures
     */
    public int[] convertToCelsius(int[] fahrenheitTemps) {
        int[] celsiusTemps = new int[5];
        for (int i=0; i < fahrenheitTemps.length; i++) {
            celsiusTemps[i] = ((fahrenheitTemps[i] - 32) * 5) / 9; // converting fahrenheit temperature to celsius
        }
        return celsiusTemps;
    }

    /**
     * unitMarks()
     * formats an array of marks with the correlating unit and adds the average marks to the array
     * @param marks array of marks
     * @return formatted array
     */
    public String[] unitMarks(int[] marks) {
        double average = 0;
        String[] formattedMarks = new String[7]; // creating new array
        String[] units = {"APP","BSAD","CF","DAD","N&CS","POP"}; // array of unit titles

        for (int i=0; i<marks.length; i++) {
            formattedMarks[i] = units[i] + ":" + marks[i]; // adding the unit title to the mark
            average += marks[i];
        }

        average /= marks.length; // calculating the average
        formattedMarks[6] = "Average:" + average;
        return  formattedMarks;
    }

    /**
     * andTheWinnerIs()
     * randomly picks a winner from an array of names
     * @param names array of names
     * @return winners
     */
    public String andTheWinnerIs(String[] names) {
        Random randomNumberGenerator = new Random();
        return names[randomNumberGenerator.nextInt(names.length)]; // choosing name from array by generating a random number
    }
}
