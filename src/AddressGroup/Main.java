package AddressGroup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, and welcome to the Address Book.");
		
		AddressBook ab = new AddressBook(); //instance of address book class
		Boolean keepGoing = true;
		
		
		System.out.println("Below you will see some options to help with search inquries.");
		Scanner kb = new Scanner(System.in);
		 do {
	            String response = getOption(kb);
	            // parseResponse method ///
	            switch (response) {
	                case "1" -> ab.addEntry("", "", "", "");
	                case "2" -> ab.removeEntry();
	                case "3" -> ab.searchEntries();
	                case "4" -> ab.printAddressBook();
	                case "5" -> ab.emptyAddressBook();
	                case "6" -> keepGoing = false;
	                default -> {
	                    System.out.println("Invalid option, please choose again!");
	                    //pressEnter();
	                }
	            }
	        } while (keepGoing);
		 
	    }
	private static String getOption(Scanner scanner) {
		System.out.println("1) Add an entry");
        System.out.println("2) Remove an entry");
        System.out.println("3) Search for a specific entry");
        System.out.println("4) Print address book");
        System.out.println("5) Empty address book");
        System.out.println("6) Quit");
        System.out.println("Please enter the number of an operation to perform:");
        String stringResponse = scanner.nextLine();
        int response = 0; //change stringResponse to default (if you want)
        //convert response to int and return it
        return (stringResponse);
	}
	
	
	


}
