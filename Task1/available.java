package Task1;
import java.util.Scanner;
public class available {
	public static void main(String[]args) {
       int noofticket;
       int availableticket;
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the noofticket");
       noofticket=sc.nextInt();
       
       System.out.println("enter the availableticket");
       availableticket=sc.nextInt();
       if(noofticket>availableticket) {
    	   System.out.println("sorry not enough tickets ");
       }
       else {
    	   System.out.println("seats available ! booking confirmed ");
       }
       }
       
}
