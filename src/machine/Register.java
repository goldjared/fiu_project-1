package machine;
import food.Apple;
import food.Sandwich;
import transactions.Payment;
public class Register {
  //----------------------------------------------------------
// Class variables
// Check UML Diagram
//----------------------------------------------------------
  private static int registerCounter = 0;
  private static final String REGISTERCODE = "US-FL-032020-";
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
// YOUR CODE HERE
// set registerID to REGISTERCODE + registerCounter
// YOUR CODE HERE
    currentTotal = 0.0;
// set the constructor inputs values to the register instant variables
// hint code:
// this.numberOfOneDollarBills = numberOfOneDollarBills;
// YOUR CODE HERE
  }
  //----------------------------------------------------------
// Utility methods
// Check UML Diagram
//----------------------------------------------------------
  private double cashValue(){
    double total = numberOfOneDollarBills * DOLLARVALUE +
            numberOfQuarters * QUATERVALUE +
            numberOfDimes * DIMEVALUE +
            numberOfNickels * NICKELVALUE +
            numberOfPennies * PENNYVALUE;
    return total;
  }
  public void cashInfo(String personal){
// if the personal is a Manager
// then output the cashValue of the register
// hint code:
/*
System.out.println("==========================================");
System.out.println("Register Cash Info");
System.out.println("==========================================");
System.out.println("Access Level:\t\t Valid");
System.out.printf("Cash in the Register:\t $%-15.2f\n", cashValue());
System.out.printf("Dollars:\t\t %-15d\n", numberOfOneDollarBills);
System.out.printf("Quarters:\t\t %-15d\n", numberOfQuarters);
.....
*/
// else the personal is not a Manager the denied access
// hint code:
/*
System.out.println("==========================================");
System.out.println("Register Cash Info");
System.out.println("==========================================");
System.out.println("Access Level:\t\t Not Valid by " + personal);
System.out.println("");
*/
// hint use an if else statement
// YOUR CODE HERE
  }
}
  public void buyApple(Apple apple, Payment payment){
    System.out.println("==========================================");
    System.out.println("Register Buy Apple");
    System.out.println("==========================================");
    System.out.printf("Apple Price:\t\t $%-15.2f\n" , apple.price() );
    System.out.printf("Payment:\t\t $%-15.2f\n" , payment.paymentValue() );
// check if you have enough payment to buy the apple
// if your payment is less the apple price calculate the amount short
// and output to the console
// Sorry but you do not have enough money to buy the Apple
// hint code:
/*
System.out.printf("You need:\t\t $%-15.2f\n",shortAmount );
System.out.println("");
System.out.println("Sorry but you do not have enough money to buy the Apple");
System.out.println("==========================================");
System.out.println("\n");
*/
// else you have enough payment then give change to buyer
// hence call the giveChange method with the apple price and payment
// hint: use an if else statement
// YOUR CODE HERE
  }//end buyApple()
  public void buySandwich(Sandwich sandwich, Payment payment){
    System.out.println("==========================================");
    System.out.println("Register Buy Sandwich");
    System.out.println("==========================================");
// check if you have enough payment to buy the sandwich
// if your payment is less the sandwich price calculate the amount short
// and output to the console
// Sorry but you do not have enough money to buy the Sandwich
// hint code:
/*
System.out.printf("Sandwich Price:\t\t $%-15.2f\n" , sandwich.getPrice() );
System.out.printf("Payment:\t\t $%-15.2f\n" , payment.paymentValue() );
...
System.out.println("");
System.out.println("Sorry but you do not have enough money to buy the Sandwich");
System.out.println("==========================================");
System.out.println("\n");
*/
// else you have enough payment then give change to buyer
// hence call the giveChange method with the sandwich price and payment
// hint: use an if else statement
// YOUR CODE HERE
  }//end buySandwich()
private void giveChange(double price, Payment payment){
// add payment to register
// hint code:
// numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
// YOUR CODE HERE
// calculate needed change
// YOUR CODE HERE
// rounded to whole number so you can use the % operator for the change
// example 9.65 becomes 965
        int neededChangeWhole = (int)Math.round(neededChange * 100);
        System.out.printf("Change:\t\t $%-15.2f\n", neededChange);
// figure out the dollar to give back
// hint: 965 /100 = 9 because of the int/ int
// so you have 9 dollars
// update the remaining change to give back
// 965 – 900 = 65 this is the cents you need to give back
// figure out the quarters to give back
// YOUR CODE HERE
// update the remaining change to give back
// YOUR CODE HERE
// figure out the dimes to give back
// YOUR CODE HERE
// update the remaining change to give back
// YOUR CODE HERE
// figure out the nickels to give back
// YOUR CODE HERE
// update the remaining change to give back
// YOUR CODE HERE
// figure out the pennies to give back
// YOUR CODE HERE
// give the change back
// remove the dollars, quarters, dimes, nickels, pennies
// from the register
// Hint code:
// numberOfOneDollarBills -= changeDollars;
// YOUR CODE HERE
// output to the console the change:
// dollars, quarters, dimes, nickels, pennies
// Hint code:
// System.out.printf("Dollars:\t\t %-15d\n", changeDollars);
// System.out.printf("Quaters:\t\t %-15d\n", changeQuaters);
// YOUR CODE HERE
        }
        }//end class