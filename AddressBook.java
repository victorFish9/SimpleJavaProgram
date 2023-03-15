package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }
    
    public List<Contact> getContact(){
    	return contacts;
    }
    
    public void setContacts(List<Contact> contacts) {
    	this.contacts = contacts;
    }

    public boolean add(Contact newContact) {
    	
        this.contacts.add(newContact);
        return true;
    }

    public Contact search(String keyword) {
    	
        for (Contact current : this.contacts) {
            String name = current.getName();
            if (name != null && name.toLowerCase().contains(keyword.toLowerCase())) {
                return current;
            }
        }
        return null; 
    }

    @Override
    public String toString() {
        
    	String showContacts = "";
    	for(Contact kaikki : contacts) {
    		System.out.println(kaikki);
    		showContacts = showContacts + kaikki + ". ";
//    		JOptionPane.showMessageDialog(null, kaikki);
    	}
    	if (showContacts.equals("")) {
    		return "empty";
    	}
    	else {
    		return "" + showContacts;
    	}
    }
}