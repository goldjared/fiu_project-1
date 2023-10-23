package food;

import java.sql.SQLOutput;

public class Sandwich {
  //----------------------------------------------------------
// Instant variables
//----------------------------------------------------------
// YOUR CODE HERE
//----------------------------------------------------------
// Constructor
//----------------------------------------------------------
  private String bread;
  private boolean meat;
  private boolean cheese;
  private boolean veggies;
  private double price;

  public Sandwich(boolean meat, boolean cheese, boolean veggies) {
    bread = "White";
// if else for all combinations of the sandwichs
// set the price of each conbination
// see project document for prices
    setMeat(meat);
    setCheese(cheese);
    setVeggies(veggies);

// YOUR CODE HERE
    if(isMeat() && isCheese() && isVeggies()) {
      this.price = 7.99;
    } else if(isMeat() && isCheese() && !isVeggies()) {
      this.price = 7.59;
    } else if(isMeat() && !isCheese() && isVeggies()) {
      this.price = 7.09;
    } else if(isMeat() && !isCheese() && !isVeggies()) {
      this.price = 6.89;
    } else if(!isMeat() && isCheese() && isVeggies()) {
      this.price = 5.99;
    } else if(!isMeat() && isCheese() && !isVeggies()) {
      this.price = 5.59;
    } else if(!isMeat() && !isCheese() && isVeggies()) {
      this.price = 5.09;
    } else if(!isMeat() && !isCheese() && !isVeggies()) {
      this.price = 4.99;
    }



    this.meat = meat;
    this.cheese = cheese;
    this.veggies = veggies;
  }
  public Sandwich(String bread,
                  boolean meat,
                  boolean cheese,
                  boolean veggies) {
    this(meat, cheese, veggies);
    this.bread = bread;
  }
//----------------------------------------------------------
// Setters and Getters
// IMPORTANT: match the UML Diagram
//----------------------------------------------------------
  public String getBread() { return bread; }
  public void setBread(String bread) {
    this.bread = bread;
  }

  public boolean isMeat() {
    return meat;
  }
  public void setMeat(boolean meat) {
    this.meat = meat;
  }

  public boolean isCheese() {
    return cheese;
  }

  public void setCheese(boolean cheese) {
    this.cheese = cheese;
  }

  public boolean isVeggies() {
    return veggies;
  }

  public void setVeggies(boolean veggies) {
    this.veggies= veggies;
  }

  public double getPrice() { return price; }
  public void displayInfo() {
    System.out.println("==========================================");
    System.out.println("Sandwich Info");
    System.out.println("==========================================");
    System.out.printf("Bread:\t\t\t\t\t %-15s\n", bread);
    System.out.printf("Meat:\t\t\t\t\t %-15b \n", meat);
    System.out.printf("Cheese:\t\t\t\t\t %-15b \n", cheese);
    System.out.printf("Veggies:\t\t\t\t %-15b \n", veggies);
    System.out.printf("Price:\t\t\t\t\t $%-15.2f \n", getPrice());
    System.out.println();
  }


}


