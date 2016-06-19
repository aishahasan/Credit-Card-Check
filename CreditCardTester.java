import java.util.Scanner;

public class CreditCardTester {     
    public static void main(String[] args) {         
	System.out.println("Enter 12-digit number.");
    	Scanner scanner = new Scanner(System.in); 
    	String creditCardNumber = scanner.next(); 
    	if (creditCardNumber.length() != 12) {     
		System.out.println("Not a 12-digit number!");     
		return; 
     } 
    	CreditCard card = new CreditCard(creditCardNumber); 
    	card.check(); 
    	if (card.isValid()) {     
		System.out.println("VALID"); 
    } 
    	else {     
		int code = card.getErrorCode();     
		System.out.println("Invalid number.");     
		System.out.println("Error code: " + code); }
    } 
}
