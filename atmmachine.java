package javaproject;

import java.util.Scanner;

public class atmmachine {
    public static void Withdraw(long balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance you want to Withdraw: ");
        int wd = sc.nextInt();
        if (wd > balance) {
            System.out.println("Sorry don't have enough Balance.");
        } else {
            balance = balance - wd;
            System.out.println("Withdrawn Successfully!");
            System.out.println("Collect your money");
            System.out.println("Now Your current Balance is: " + balance);

        }
    }

    public static void deposit(long balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to Deposit : ");
        int dep = sc.nextInt();
        if (dep > 0) {
            balance = balance + dep;
            System.out.println(" Deposited Successfully!");
            System.out.println("Now Your current Balance is: " + balance);
        } else {
            System.out.println("Deposit Valid Amount");
        }

    }

    public static void pinchange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mobile Number : ");
        Long mb = sc.nextLong();
        if (mb > 1000000000) {
            System.out.println("Enter the OTP send to entered mobile number: ");
            int otp = sc.nextInt();
            if (otp > 1000 && otp < 9999) {
                System.out.println("OTP entered Successfully!");
                System.out.println("Enter the Pin you want to set: ");
                int pin = sc.nextInt();
                if (pin > 1000 && pin < 9999) {
                    System.out.println("enter the Pin again : ");
                    int pin1 = sc.nextInt();
                    if (pin1 == pin) {
                        System.out.println("Pin changed Successfully!");
                    } else {
                        System.out.println("Invalid Pin!");
                        System.out.println("Try again!");
                    }
                } else {
                    System.out.println("Enter valid pin");
                }
            } else {
                System.out.println("Incorrect otp!");
                System.out.println("Enter valid otp");
            }
        } else {
            System.out.println("Please Enter Valid Mobile Number");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        long balance = 100000;
        int choice;
        System.out.println("                     Choose a transaction    ");

        System.out.println("               Press cancel if you want to exit: ");
        System.out.println();
        do{
        System.out.println(" 1. Check Balance");

        System.out.println(" 2. Withdraw");

        System.out.println(" 3. Deposit");

        System.out.println(" 4. Change pin");

        System.out.println(" 5. Cancel");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Balance is: " + balance);
                break;
            case 2:
                Withdraw(balance);
                break;
            case 3:
                deposit(balance);
                break;
            case 4:
                pinchange();
                break;
            case 5:
                System.out.println("Thank you!");
        }
    }while(5!=choice);
    

    }

}
