package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String fullName = myScanner.nextLine().strip();

        System.out.println();
        System.out.print("Billing Street: ");
        StringBuilder billingAddress = new StringBuilder(myScanner.nextLine().strip()).append(System.lineSeparator());
        System.out.print("Billing City: ");
        billingAddress.append(myScanner.nextLine().strip());
        System.out.print("Billing State: ");
        billingAddress .append(", ").append(myScanner.nextLine().strip());
        System.out.print("Billing Zip: ");
        billingAddress .append(" ").append(myScanner.nextLine().strip());

        System.out.println();
        System.out.print("Shipping Street: ");
        StringBuilder shippingAddress = new StringBuilder(myScanner.nextLine().strip()).append(System.lineSeparator());
        System.out.print("Shipping City: ");
        shippingAddress.append(myScanner.nextLine().strip());
        System.out.print("Shipping State: ");
        shippingAddress .append(", ").append(myScanner.nextLine().strip());
        System.out.print("Shipping Zip: ");
        shippingAddress .append(" ").append(myScanner.nextLine().strip());

        System.out.println();
        System.out.println(fullName);
        System.out.println();
        System.out.println("Billing Address:");
        System.out.println(billingAddress );
        System.out.println();
        System.out.println("Shipping Address:");
        System.out.println(shippingAddress );
    }
}
