import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("hello conditional!!!");
        /**
         * if, else, else-if
         * ternary operator
         * switch
         */

        int marks = 65;
        boolean passed = marks > 40;

        if (passed) {
            System.out.println("Student is passed");
        } else {
            System.out.println("Student is failed");
        }

        /**
         * PROBLEM - Grading system
         *
         * 100 - 91 A+
         * 90 - 81 A
         * 80 - 71 B+
         * B
         * C+
         * C
         * F
         */

        /**
         * PROBLEM - Gold price calculator
         *
         * base gold value + making + gst = total price of jewellery
         *
         * gold rate today (per gram) = 7435
         * weight of gold (in grm) = 10
         * making charges (in pct) = 10
         * gst (in pct) = 3 - fixed
         *
         * find total price of gold jewellery
         */
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input values for the calculation
//        System.out.print("Enter the weight of gold in grams: ");
//        double weight = scanner.nextDouble();
//
//        System.out.print("Enter the price of gold per gram: ");
//        double pricePerGram = scanner.nextDouble();
//
//        System.out.print("Enter the making charges percentage: ");
//        double makingChargesPercentage = scanner.nextDouble();
//
//        System.out.print("Enter the GST percentage: ");
//        double gstPercentage = scanner.nextDouble();
//
//        // Calculate the price of the gold without making charges and GST
//        double goldPrice = weight * pricePerGram;
//
//        // Calculate making charges
//        double makingCharges = (makingChargesPercentage / 100) * goldPrice;
//
//        // Calculate GST (GST is applied to the sum of gold price and making charges)
//        double gstAmount = (goldPrice + makingCharges) * (gstPercentage / 100);
//
//        // Calculate the total price
//        double totalPrice = goldPrice + makingCharges + gstAmount;
//
//        // Output the result
//        System.out.println("Gold Price: " + goldPrice);
//        System.out.println("Making Charges: " + makingCharges);
//        System.out.println("GST: " + gstAmount);
//        System.out.println("Total Price of the Gold: " + totalPrice);
//
//        // Close the scanner
//        scanner.close();

        /**
         * Max product of 3 elements in an array
         *
         * ex = [1,-100, -200, 0, 2, 6]
         * max prod of positive = 1 * 2 * 6 = 12
         * actual max prod = -100 * -200 * 6 = 120000
         *
         * 1. goldAmount = goldWeightInGrm * rateOfGoldPerGrm;
         * 2. calculate gold making charges
         * 3. calculate gst on goldAmt and goldMakingCharges
         * 4. total sum is goldAmt, goldMakingCharges, gstOnGold
         *
         * [1,-100, -200, -50, -25, 0, 2, 6]
         * actual max prod = -100 * -200 * 6 = 120000
         *
         * max prod of 3 elements
         * - All 3 max elements (1,2,6)
         * - 2 min elements and 1 max element (-200, -100, 6)
         *
         * 1. sort array -> arr = [-200, -100, -50, -25, 0, 1, 2, 6]
         * 2. all max elements, arr[arr.size() -1], arr[arr.size() -2], arr[arr.size() -3]
         *    2 min and 1 max,  arr[0], arr[1], arr[arr.size() -1],
         *
         * time complexity - nLogn
         *
         * expectation - TC n
         *
         * arr = [1,-100, -200, 0, 2, 6]
         *
         * 2147483647
         * minimumNum = INT_MAX
         * for(int e : arr) {
         *     if(e < minimumNum) {
         *         minimumNum = e;
         *     }
         * }
         *
         *
         */

        System.out.println("Enter you day : ");
        int day = scanner.nextInt();

        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day"; // Handle cases outside 1-7
        };

        System.out.println(dayName);
    }
}
