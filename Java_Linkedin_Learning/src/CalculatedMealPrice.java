public class CalculatedMealPrice {

    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tax = taxRate*listedMealPrice;
        double tip = tipRate*listedMealPrice;
        double result = listedMealPrice + tax +tip;
        System.out.println("The total meal price is: " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15,0.2,0.08);
        calculateTotalMealPrice(25,0.18,0.08);
    }

}