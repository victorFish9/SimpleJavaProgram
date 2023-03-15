package array;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {
	
	private JFrame frame = new JFrame();
	private JButton btnAU = new JButton();
	private JButton btnD = new JButton();
	private JButton btdS = new JButton();
	
	private String data;
//	private String searchName;
	
	public main() {
		//Creating user interface
		AddressBook ab = new AddressBook();
		frame.setLayout(null);
		frame.setTitle("Address Book App");
		frame.setSize(400, 600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add button
		btnAU.setText("Add User");
		btnAU.setSize(200, 50);
		btnAU.setLocation(100, 100);
		
		btnAU.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Contact nc = new Contact();
				data = JOptionPane.showInputDialog("Enter name, email and phone");
				String[] parts = data.split(",");
		    	
		    	String name = parts[0].trim();
		    	String email = parts[1].trim();
		    	String phone = parts[2].trim();
				
		    	nc.setName(name);
		    	nc.setEmail(email);
		    	nc.setPhone(phone);
		    	
				if (nc.getName().equals(name)) {
					JOptionPane.showMessageDialog(null, "Name " + name + " is added successfully.");
					ab.add(nc);
				}
				else {
					JOptionPane.showMessageDialog(null, "Try another name.");
				}
				
				
				
//				System.out.println(nc.toString());
			}
		});
		
//		Display button
		btnD.setText("Show users");
		btnD.setSize(200, 50);
		btnD.setLocation(100, 200);
		
		btnD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if (ab.toString().equals("empty")) {
					JOptionPane.showMessageDialog(null, "List is " + ab.toString());
				}
				else {
					JOptionPane.showMessageDialog(null, "List of users: " + ab.toString());
				}
			}
		});
		
//		Search button
		btdS.setText("Search User");
		btdS.setSize(200, 50);
		btdS.setLocation(100, 300);
		
		btdS.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String searchName = JOptionPane.showInputDialog("Enter search name: ");
				Contact foundContact = ab.search(searchName);
				
				if (foundContact != null) {
					JOptionPane.showMessageDialog(null, ab.search(searchName));
				}
			}
		});
		
		frame.add(btnAU);
		frame.add(btnD);
		frame.add(btdS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}
	

}
