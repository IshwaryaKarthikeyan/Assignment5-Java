package Task2;
import java.util.Scanner;
public class silver {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Ticket Options:");
	        System.out.println("1. Silver");
	        System.out.println("2. Gold");
	        System.out.println("3. Diamond");

	     
	        System.out.print("Enter ticket category (1, 2, or 3): ");
	        int ticketCategory = scanner.nextInt();
	        System.out.print("Enter number of tickets to book: ");
	        int numBookingTickets = scanner.nextInt();

	       
	        double ticketPrice;
	        if (ticketCategory == 1) {
	            ticketPrice = 500.0; 
	        } else if (ticketCategory == 2) {
	            ticketPrice = 1000.0; 
	        } else if (ticketCategory == 3) {
	            ticketPrice = 1500.0;
	        } else {
	            System.out.println("Invalid ticket category.");
	            return;
	        }

	       
	        double totalCost = ticketPrice * numBookingTickets;

	      
	        System.out.println("Total cost of tickets: " + totalCost);
	    }
	}

