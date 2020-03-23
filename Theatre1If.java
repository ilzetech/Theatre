//More Problems on Selection Statements

//Problem 1: 
//Your local theatre charges different prices during the week and during the weekends.  
//The prices are outlined in the table below:

//Day:				   Price:
//Monday - Thursday		€20
//Friday - Sunday		€30

//You have been asked to develop an application that allows a user to enter the day of the week 
//and then display the cost of a theatre ticket for that person based on the day of the week. 
//Use instantiable classes in your application.  Save the instantiable class as Theatre1.java

//Theatre1If.java -- the instantiable class, uses the if selection statement to determine the price of 
//a theatre ticket based on a given day


public class Theatre1If {
	// declare instance variable to store the day


    // declare instance variable to store the price of a ticket based on the given day
	private int price1 = 20;
	private int price2 = 30;
	
	
    // Constructor - initialize the day with the empty string;
    // by default the day instance variable is initialized with null;
    // the price will be initialized with zero
	
	public Theatre1If() {
		this.day = "";
		this.price1 = price1;
		this.price2 = price2;
	}
		
	// declare a setter method for each of the instance variables that can be set/ assigned a value
    // setter method for the day instance variable
	public void setDay (String day) {
		this.day =day;
	}
	
    // declare a getter method for each of the instance variables
    // whose values should be made available to the other classes
    // that use this instantiable class
    // for example, the class with the main() method which uses this instantiable class
    // (i.e. Theatre1If.java) would use the getter method to retrieve the price of a ticket
    // getter method to retrieve the ticket price
	public int getPrice1() {
		return price1;
	}
	
	public int getPrice2() {
		return price2;
	}
	
    // the method which does the actual processing: based on a given day determines the price of the ticket
   public void calculatePrice() {
	   if(day.equalsIgnoreCase("monday") ||  day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")) {
			System.out.println("Tickets price is " + price1 + " EUR");
		}else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			System.out.println("Tickets price is " + price2 + " EUR");
		}else{
			System.out.println("Show your input!");
		}
   }
   
}
	