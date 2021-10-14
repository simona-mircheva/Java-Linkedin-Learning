public class Salary {
    public static double calculateTotalGrossSalary(double hourlyRate,
                            double hoursWorkedPerWeek,
                            double daysOffWork) {
        if (hoursWorkedPerWeek < 0) {
            return -1;
        }

        if (hourlyRate < 0) {
            return -1;
        }

        double yearlyGrossSalary = hoursWorkedPerWeek * 52 * hourlyRate;
        double hoursOffWork = daysOffWork * 8;
        double result= yearlyGrossSalary - hoursOffWork * hourlyRate;
        return result;

    }
    public static void main(String[] args) {
        double salary = calculateTotalGrossSalary(15,40,8);
        System.out.println(salary);
    }
}