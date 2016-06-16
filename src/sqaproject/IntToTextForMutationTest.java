package sqaproject;

import java.util.*;

public class IntToTextForMutationTest {

    public static final String[] belowTwenty = { //Text for numbers below twenty
        "", "ONE", "TWO", "THREE", "FOUR",
        "FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
        "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
        "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"
    };

    public static final String[] tens = { //Text for tens
        "", // 0
        "", // 10
        "TWENTY", // 20
        "THIRTY", // 30
        "FORTY", // 40
        "FIFTY", // 50
        "SIXTY", // 60
        "SEVENTY", // 70
        "EIGHTY", // 80
        "NINETY" // 90
    };

    public static void main(String[] args) {
        //int number = 456;
        Scanner sc = new Scanner(System.in);
        int number = 0;		//The number to convert. 

        System.out.println("\nEnter an integer: ");
        try {
            number = sc.nextInt();
        } catch (InputMismatchException ime) {
            //If the user enters non-integers, print error message and prompt the user to input an integer again
            System.out.println("\nInput ERROR! Enter an integer between -2147483648 and 2147483647: ");
            sc.nextLine();
            number = sc.nextInt();
        } catch (Exception e) {
            //catch any other exceptions
            e.printStackTrace();
        } finally {
            sc.close();
        }

        String strNumber = convertToText(number);
        System.out.println("Integer: " + number + "\nText: " + strNumber);
    }

    /**
     * Overview
     *
     * @param number
     * @return String
     */
    public static String convertToText(int number) {
        int absNumber;					//absolute value of number
        String numberText;				//text of number
        int residule;

        if (number == 0) {
            return "ZERO";                 //if input number is 0
        } else if (number < 0) {
            absNumber = 0 - number;	//if input number is negative, negate it
        } else {
            absNumber = number;
        }

        //convert number to text using recursion
        if (absNumber < 20) {
            numberText = belowTwenty[absNumber];
        } else if (absNumber < 100) {
            residule = absNumber % 10;
            if (residule > 0) {
                numberText = tens[absNumber / 10] + " " + belowTwenty[absNumber % 10];
            } else {
                numberText = tens[absNumber / 10];
            }
        } else if (absNumber < 1000) {
            residule = absNumber % 100;
            if (residule > 0) {
                numberText = belowTwenty[absNumber / 100] + " HUNDRED " + convertToText(residule);
            } else {
                numberText = belowTwenty[absNumber / 100] + " HUNDRED";
            }
        } else if (absNumber < 1000000) {
            residule = absNumber % 1000;
            if (residule > 0) {
                numberText = convertToText(absNumber / 1000) + " THOUSAND " + convertToText(residule);
            } else {
                numberText = convertToText(absNumber / 1000) + " THOUSAND";
            }
        } else if (absNumber < 1000000000) {
            residule = absNumber % 1000000;
            if (residule > 0) {
                numberText = convertToText(absNumber / 1000000) + " MILLION " + convertToText(residule);
            } else {
                numberText = convertToText(absNumber / 1000000) + " MILLION";
            }
        } else {
            residule = absNumber % 1000000000;
            if (residule > 0) {
                numberText = convertToText(absNumber / 1000000000) + " BILLION " + convertToText(residule);
            } else {
                numberText = convertToText(absNumber / 1000000000) + " BILLION";
            }
        }

        if (number < 0) {
            return "NEGATIVE " + numberText;	//return text of negative number
        } else {
            return numberText;
        }
    }
}
