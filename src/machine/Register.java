package machine;
import food.Apple;
import food.Sandwich;
import transactions.Payment;
public class Register {
  private static int registerCounter = 0;
  private static final String REGISTERCODE = "US-FL-032020-";
  private static final double DOLLARVALUE = 1.00;
  private static final double QUARTERVALUE = 0.25;
  private static final double DIMEVALUE = 0.1;
  private static final double NICKELVALUE = 0.05;
  private static final double PENNYVALUE = 0.01;

  private String registerID;
  private int numberOfOneDollarBills;
  private int numberOfQuarters;
  private int numberOfDimes;
  private int numberOfNickels;
  private int numberOfPennies;
  private double currentTotal;
  // YOUR CODE HERE
//----------------------------------------------------------
// Instant variables
// Check UML Diagram
//----------------------------------------------------------
// YOUR CODE HERE
//----------------------------------------------------------
// Constructor
//----------------------------------------------------------
  public Register(int numberOfOneDollarBills,
                  int numberOfQuarters,
                  int numberOfDimes,
                  int numberOfNickels,
                  int numberOfPennies) {
// increment registerCounter by one
    registerCounter++;
// YOUR CODE HERE
// set registerID to REGISTERCODE + registerCounter
    registerID = REGISTERCODE + registerCounter;
// YOUR CODE HERE
    currentTotal = 0.0;
// set the constructor inputs values to the register instant variables
// hint code:
 this.numberOfOneDollarBills = numberOfOneDollarBills;
 this.numberOfDimes = numberOfDimes;
 this.numberOfNickels = numberOfNickels;
 this.numberOfQuarters = numberOfQuarters;
 this.numberOfPennies = numberOfPennies;
// YOUR CODE HERE
  }
  //----------------------------------------------------------
// Utility methods
// Check UML Diagram
//----------------------------------------------------------
  private double cashValue(){
    double total = numberOfOneDollarBills * DOLLARVALUE +
            numberOfQuarters * QUARTERVALUE +
            numberOfDimes * DIMEVALUE +
            numberOfNickels * NICKELVALUE +
            numberOfPennies * PENNYVALUE;
    return total;
  }
  public void cashInfo(String personal){
// if the personal is a Manager
// then output the cashValue of the register
// hint code:
    if(personal.equals("Manager")) {

      System.out.println("==========================================");
      System.out.println("Register Cash Info");
      System.out.println("==========================================");
      System.out.println("Access Level:\t\t\t Valid");
      System.out.printf("Cash in the Register:\t $%-15.2f\n", cashValue());
      System.out.printf("Dollars:\t\t\t\t %-15d\n", numberOfOneDollarBills);
      System.out.printf("Quarters:\t\t\t\t %-15d\n", numberOfQuarters);
      System.out.printf("Dimes:\t\t\t\t\t %-15d\n", numberOfDimes);
      System.out.printf("Nickels:\t\t\t\t %-15d\n", numberOfNickels);
      System.out.printf("Pennies:\t\t\t\t %-15d\n", numberOfPennies);


    } else {
      System.out.println("==========================================");
      System.out.println("Register Cash Info");
      System.out.println("==========================================");
      System.out.println("Access Level:\t\t\t Not Valid by " + personal);
      System.out.println("");
    }

  }

  public void buyApple(Apple apple, Payment payment){
    System.out.println("==========================================");
    System.out.println("Register Buy Apple");
    System.out.println("==========================================");
    System.out.printf("Apple Price:\t\t\t $%-15.2f\n" , apple.price() );
    System.out.printf("Payment:\t\t\t\t $%-15.2f\n" , payment.paymentValue() );
    if(payment.paymentValue() < apple.price()) {
      double shortAmount = apple.price() - payment.paymentValue();
      System.out.printf("You need:\t\t\t\t $%-15.2f\n", shortAmount);
      System.out.println("");
      System.out.println("Sorry but you do not have enough money to buy the Apple");
      System.out.println("==========================================");
//      System.out.println("\n");
    } else if(payment.paymentValue() > apple.price()){
      giveChange(apple.price(), payment);
    }
    System.out.println();

  }//end buyApple()
  public void buySandwich(Sandwich sandwich, Payment payment){
    System.out.println("==========================================");
    System.out.println("Register Buy Sandwich");
    System.out.println("==========================================");
    System.out.printf("Sandwich Price:\t\t\t $%-15.2f\n" , sandwich.getPrice() );
    System.out.printf("Payment:\t\t\t\t $%-15.2f\n" , payment.paymentValue() );

    if(payment.paymentValue() < sandwich.getPrice()) {
      double shortAmount = sandwich.getPrice() - payment.paymentValue();
      System.out.printf("You need:\t\t\t\t $%-15.2f\n", shortAmount);
      System.out.println("");
      System.out.println("Sorry but you do not have enough money to buy the Sandwich");
      System.out.println("==========================================");
      System.out.println("\n");
    } else if(payment.paymentValue() > sandwich.getPrice()){
      giveChange(sandwich.getPrice(), payment);
    }
    System.out.println();

  }//end buySandwich()
private void giveChange(double price, Payment payment){
// add payment to register
// hint code:
 numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
 numberOfPennies += payment.getNumberOfPennies();
 numberOfQuarters += payment.getNumberOfQuarters();
 numberOfNickels += payment.getNumberOfNickels();
 numberOfDimes += payment.getNumberOfDimes();
// YOUR CODE HERE
// calculate needed change
  double neededChange = payment.paymentValue() - price;
// YOUR CODE HERE
// rounded to whole number so you can use the % operator for the change
// example 9.65 becomes 965
        int neededChangeWhole = (int)Math.round(neededChange * 100);
        System.out.printf("Change:\t\t\t\t\t $%-15.2f\n", neededChange);
// figure out the dollar to give back
// hint: 965 /100 = 9 because of the int/ int
// so you have 9 dollars
  int changeDollars = neededChangeWhole / 100;
  neededChangeWhole -= changeDollars * 100; //number cents need give back

  int changeQuarters = neededChangeWhole /25;
  neededChangeWhole -= changeQuarters * 25; //num quart give

  int changeDimes = neededChangeWhole / 10;
  neededChangeWhole -= changeDimes * 10;

  int changeNickels = neededChangeWhole / 5;
  neededChangeWhole -= changeNickels * 5;

  int changePennies = neededChangeWhole;
  neededChangeWhole -= neededChangeWhole;


  numberOfOneDollarBills -= changeDollars;
  numberOfPennies -= changePennies;
  numberOfQuarters -= changeQuarters;
  numberOfNickels -= changeNickels;
  numberOfDimes -= changeDimes;

  System.out.printf("Dollars:\t\t\t\t %-15d\n", changeDollars);
  System.out.printf("Quarters:\t\t\t\t %-15d\n", changeQuarters);
  System.out.printf("Dimes:\t\t\t\t\t %-15d\n", changeDimes);
  System.out.printf("Nickels:\t\t\t\t %-15d\n", changeNickels);
  System.out.printf("Pennies:\t\t\t\t %-15d\n", changePennies);

        }
        }//end class