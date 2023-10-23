//=============================================================================
// PROGRAMMER: Your name
// PANTHER ID: Your panther ID
//
// CLASS: COP2210
// SECTION: Your class section: example U01
// SEMESTER: The current semester: example Fall 2018
// CLASSTIME: Your COP2210 course meeting time :example T/TH 9:00-10:15 am
//
// Project: Put what this project is: example Lab 5 or Project 1
// DUE:
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
// own and that none of it is the work of any other person.
//=============================================================================

package app;

import food.Apple;
import food.Sandwich;
import machine.Register;
import transactions.Payment;

public class Controller {
  public static void main(String[] args) {
    System.out.println("===============================================");
    System.out.println("COP 2210 - Project 1 Output");
    System.out.println("Your Name here");
    System.out.println("YOUR ID here");
    System.out.println("Your Class Sections here ");
    System.out.println("===============================================");
    System.out.println("\n");
    Register register = new Register(15, 20, 10, 20, 50);
    // check register cash as a "Manager"
    register.cashInfo("Manager");
    register.cashInfo("Staff");

    Apple grannySmith = new Apple("Granny Smith",1.51,140);
    grannySmith.displayInfo();

    Payment applePayment1 = new Payment(10,0,0,0,47);
    applePayment1.displayInfo();
    register.buyApple(grannySmith, applePayment1);

    register.cashInfo("Manager");
    //---------------------------------------------------step 9
    Apple macintosh = new Apple("Macintosh",150,1.70);
    macintosh.displayInfo();
    Payment applePayment2 = new Payment(0,2,0,0,0);
    applePayment2.displayInfo();
    register.buyApple(macintosh, applePayment2);

    register.cashInfo("Manager");

    Sandwich sandwich = new Sandwich(true, true, true);
    sandwich.displayInfo();
    Payment sandwichPayment1 = new Payment(5,2,1,1,2);
    sandwichPayment1.displayInfo();
    register.buySandwich(sandwich, sandwichPayment1);
    register.cashInfo("Manager");

    // create booleans
    boolean meat = true;
    boolean cheese = true;
    boolean veggies = true;
    System.out.println("");

    for(int i = 1; i<=8; i++) {
      meat = i <= 4;
      cheese = i <= 2 || i >= 5 && i < 7;
      veggies = i % 2 != 0;
      System.out.println();
      System.out.println("===========================================================");
      System.out.println("===========================================================");
      Sandwich s = new Sandwich(meat, cheese, veggies);
      s.displayInfo();
      Payment sPaymentLoop = new Payment(10,0,0,0,0);
      sPaymentLoop.displayInfo();
      register.buySandwich(s, sPaymentLoop);
      register.cashInfo("Manager");
      System.out.println();

      System.out.println("===========================================================");
      System.out.println("===========================================================");

    }
  }
}
