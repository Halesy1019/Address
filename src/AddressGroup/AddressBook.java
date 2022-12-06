package AddressGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    private static final Scanner kb = new Scanner(System.in);
    private static boolean keepGoing = true;

//ArrayList
    ArrayList<Entry> addressBookData;
    //constructor for address book
    public AddressBook() {
    	addressBookData = new ArrayList<>();
    }
    
    
    
	
	
	public Object quit() {
		return null;
	}

	public Object emptyAddressBook() {
		return null;
	}

	public Object printAddressBook() {
		return null;
	}

	public Object searchEntries() {
		return null;
	}

	public Object removeEntry() {
		return null;
	}

	public Object addEntry(String firstName, String lastName, String phoneNumber, String emailAddress) {
				
		
		Entry thisEntry = new Entry(firstName, lastName, phoneNumber, emailAddress);
		addressBookData.add(thisEntry);
		
		
		return thisEntry;
		
	}

	public static AddressBook createEmptyAddressBook() {
		return null;
	}

	public Object addEntry() {
		return null;
	}
}


