/**
 * Salary class
 * This class contains tasks about calculating salaries.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Salary {

    /**
     * salaryIncrease()
     * Increases the salary by 200
     * @param salary    salary to increase
     * @return salary increased by 200
     */
    public int salaryIncrease(int salary) {
        return salary + 200;
    }

    /**
     * salaryIncrease()
     * Increases the salary by 200.50
     * @param salary    salary to increase
     * @return salary increased by 200.50
     */
    public double salaryIncrease(double salary) {
        return salary + 200.50;
    }

    /**
     * salaryIncrease()
     * Increases the salary by the percentage inputted
     * @param salary    salary to increase
     * @param percentage    percentage to increase the salary by
     * @return salary increased by the percentage
     */
    public double salaryIncrease(double salary, double percentage) {
        return salary * (percentage / 100 + 1);
    }

    /**
     * calculatePay()
     * Returns 1 month worth of yearly salary with tax and pension deducted
     * @param salary    salary to increase
     * @return 1 month worth of yearly take home salary
     */
    public double calculatePay(double salary) {
        final double TAX = 0.15;
        final double PENSION = 0.13;
        return (salary - (salary * (TAX + PENSION))) / 12;
    }

    /**
     * formatCurrency()
     * Formats the salary as currency
     * @param salary    salary to increase
     * @return formatted salary
     */
    public String formatCurrency(double salary) {
        return String.format("£%,.2f",salary);
    }
}
