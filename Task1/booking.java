package Task1;
import java.util.Scanner;
public class booking {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the available number of tickets: ");
	        int availableTicket = scanner.nextInt();

	        System.out.print("Enter the number of tickets you want to book: ");
	        int noOfBookingTicket = scanner.nextInt();

	       
	        if (noOfBookingTicket <= availableTicket) {
	            System.out.println("Booking successful! Enjoy your event.");
	           
	            availableTicket -= noOfBookingTicket;
	            System.out.println("Remaining tickets: " + availableTicket);
	        } else {
	           
	            if (availableTicket == 0) {
	                System.out.println("Sorry, tickets are sold out.");
	            } else {
	                System.out.println("Sorry, only " + availableTicket + " tickets available.");
	            }
	        }

	        scanner.close();
	    }
	}

