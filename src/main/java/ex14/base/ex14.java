package ex14.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ex14 {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String str1 = input.nextLine();
        int amount = Integer.parseInt(str1);

        System.out.print("What is the state? ");
        String state = input.nextLine();

        double taxPercent = getTax(state);
        double taxRate = taxPercent / 100;
        double tax = taxRate * amount;
        double total = tax + amount;

        String subtotalOutput = "The subtotal is $" + df.format(amount);
        String taxOutput = "The tax is $" + df.format(tax);
        String totalOutput = "The total is $" + df.format(total);

        System.out.println(taxPercent != 0 ? subtotalOutput + "\n" + taxOutput + "\n" + totalOutput : totalOutput);
    }

    public static double getTax(String state) {
        if(state.equals("AL") || state.equals("GA") || state.equals("HI") || state.equals("NY") || state.equals("WY")) {
            return 4.00;
        }
        if(state.equals("AK") || state.equals("DE") || state.equals("MT") || state.equals("NH") || state.equals("OR")) {
            return 0.00;
        }
        if(state.equals("AZ")) {
            return 5.60;
        }
        if(state.equals("AR") || state.equals("KS") || state.equals("WA")) {
            return 6.50;
        }
        if(state.equals("CA")) {
            return 7.25;
        }
        if(state.equals("CO")) {
            return 2.90;
        }
        if(state.equals("CT")) {
            return 6.35;
        }
        if(state.equals("FL") || state.equals("ID") || state.equals("IA") || state.equals("KY") || state.equals("MD") || state.equals("MI") || state.equals("PA") || state.equals("SC") || state.equals("VT") || state.equals("WV")) {
            return 6.00;
        }
        if(state.equals("IL") || state.equals("MA") || state.equals("TX")) {
            return 6.25;
        }
        if(state.equals("IN") || state.equals("MS") || state.equals("RI") || state.equals("TN")) {
            return 7.00;
        }
        if(state.equals("LA")) {
            return 4.45;
        }
        if(state.equals("ME") || state.equals("NE")) {
            return 5.50;
        }
        if(state.equals("MN")) {
            return 6.875;
        }
        if(state.equals("MO")) {
            return 4.225;
        }
        if(state.equals("NV")) {
            return 6.85;
        }
        if(state.equals("NJ")) {
            return 6.625;
        }
        if(state.equals("NM")) {
            return 5.125;
        }
        if(state.equals("NC")) {
            return 4.75;
        }
        if(state.equals("OH")) {
            return 5.75;
        }
        if(state.equals("ND") || state.equals("WI")) {
            return 5.00;
        }
        if(state.equals("OK") || state.equals("SD")) {
            return 4.50;
        }
        if(state.equals("VA")) {
            return 5.30;
        }
        if(state.equals("UT")) {
            return 6.10;
        }
        return 0;
    }
}
