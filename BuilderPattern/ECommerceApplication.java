package BuilderPattern;

import java.util.*;
import java.util.Scanner;
public class ECommerceApplication {
    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        String firstName;
        String lastName;
        String email;
        String address;
        String phoneNumber;
        Integer age;

        System.out.println("\nE-Commerce Registration Form");
        System.out.println("To access exclusive content and features, please register below:");

        while (true) {
            System.out.print("\nFirst Name: ");
            firstName = ui.nextLine().trim();

            if (!firstName.isEmpty()) {
                break;
            } else {
                System.out.println("Your first name cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("\nLast Name: ");
            lastName = ui.nextLine().trim();

            if (!lastName.isEmpty()) {
                break;
            } else {
                System.out.println("Your last name cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("\nEmail: ");
            email = ui.nextLine().trim();

            if (!email.isEmpty()) {
                break;
            } else {
                System.out.println("Your last name cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("\nAddress: ");
            address = ui.nextLine().trim();

            if (!address.isEmpty()) {
                break;
            } else {
                System.out.println("Your last name cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("\nPhone Number: ");
            phoneNumber = ui.nextLine().trim();

            if (!phoneNumber.isEmpty()) {
                break;
            } else {
                System.out.println("Your last name cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("\nAge: ");
            String ageInput = ui.nextLine().trim();

            if (!ageInput.isEmpty()) {
                try {
                    age = Integer.parseInt(ageInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input. Please enter a valid number.");
                }
            } else {
                System.out.println("Your last name cannot be empty. Please try again.");
            }
        }

        System.out.println("Thank you for registering. We're excited to have you on board!");

        User userInfo = new User.userBuilder()
                .age(age)
                .address(address)
                .phone(phoneNumber)
                .lastName(lastName)
                .email(email)
                .firstName(firstName)
                .build();

        System.out.println("☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰");
        System.out.println("USER's REGISTERED INFORMATION: ");
        System.out.println("\nFirst Name: " + firstName);
        System.out.println("Last Name" + lastName);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Age: " + age);
        System.out.println("☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰☰");

    }
}
