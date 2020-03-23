//the instantiable class, uses the switch selection statement to determine 
//the price of a theatre ticket based on a given day

public class Theatre1Switch {

//	public static void main(String[] args) {
	
		 // declare a variable to store the day 
		private String day;
	       
	       // declare instance variable to store the price of a ticket based on the given day
		private int price1 = 20;
		private int price2 = 30;
	       		
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
	
		//  switch
		
		public void calculatePrice(String day) {
			   switch (day.toLowerCase()) {
			            case "monday":
			            case "tuesday":      
			            case "wednesday":
			            case "thursday":
			                System.out.println("The price of the theatre ticket for "+ day + " is "+ price1 + " Eur ");
			                break;
			                
			            case "friday":
			            case "saturday":	
			            case "sunday":	
			                System.out.println("The price of the theatre ticket for "+ day + " is "+ price2 + " Eur ");
			                break;
			            default: 
			                System.out.println("Incorrect input! Please, try again!");    
		
			   }
		}
}
