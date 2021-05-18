package linkedlist;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LinkedListGUI extends JPanel {
	   // declare variables that will be used in our program
	private String names[] = {"Simon", "Andy", "Betty"};
	private int ages[] = {22, 38, 19};
	private String emails[] = {"simon@mail.com", "andy@mail.com", "betty@mail.com"};
	private int i;
	private Person newPerson;
	private PeopleList everyone;
	
	private String result;
	
	private JPanel panelName, panelAge, pnlTwoButtons, pnlBottom1, panelEmail;
	private JPanel pnlBottom2;
	private JLabel lblName, lblAge, lblEmail, lblStringOutput, lblAuthor;
	private JTextField txtName, txtAge, txtEmail;
	private JButton btnAddName, btnDisplay, btnExit;
		
	public LinkedListGUI()
	{
			// give our panel a 'BoxLayout' with appropriate
			// dimensions and color
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(800, 200));
		setBackground(Color.LIGHT_GRAY);
		
			// instantiate the object that will represent
			// the entire linked list of people
		everyone = new PeopleList();

		
			// add the people's name and age from 
			// the arrays 'names' and 'ages'
		for(i = 0; i < names.length; i++)
		{
				// create an object of a person
			newPerson = new Person(names[i], ages[i], emails[i]);
			
				// add this object (a person) to
				// the linked list
			everyone.add(newPerson);
		}	// end for loop
		
			//------------create labels------------
		lblName = new JLabel("Enter a name:");
		lblName.setFont(new Font("Helvetica", Font.PLAIN, 16));
		lblName.setForeground(Color.BLACK);
		
		lblAge = new JLabel("Enter an age:");
		lblAge.setFont(new Font("Helvetica", Font.PLAIN, 16));
		lblAge.setForeground(Color.BLACK);
		
		lblEmail = new JLabel("Enter an email:");
		lblEmail.setFont(new Font("Helvetica", Font.PLAIN, 16));
		lblEmail.setForeground(Color.BLACK);
		
		lblStringOutput = new JLabel();
		lblStringOutput.setFont(new Font("Helvetica", Font.PLAIN, 16));
		lblStringOutput.setForeground(Color.BLACK);
		
		lblAuthor = new JLabel("This program was written by Kelly Malcolm");
		lblAuthor.setFont(new Font("Helvetica", Font.PLAIN, 16));
		lblAuthor.setForeground(Color.BLACK);
		
		
			//------------create text fields------------
		txtName = new JTextField(15);
		txtName.setFont(new Font("Helvetica", Font.PLAIN, 16));
		txtName.setForeground(Color.BLACK);
		
		txtAge = new JTextField(5);
		txtAge.setFont(new Font("Helvetica", Font.PLAIN, 16));
		txtAge.setForeground(Color.BLACK);
		
		txtEmail = new JTextField(20);
		txtEmail.setFont(new Font("Helvetica", Font.PLAIN, 16));
		txtEmail.setForeground(Color.BLACK);

		
			//-----------create normal buttons------------
		btnAddName = new JButton("Add person to linked list");
		btnAddName.setBackground(Color.BLUE);
		btnAddName.setFont(new Font("Helvetica", Font.BOLD, 20));
		btnAddName.setForeground(Color.WHITE);
		
		btnDisplay = new JButton("Display linked list");
		btnDisplay.setBackground(Color.YELLOW);
		btnDisplay.setFont(new Font("Helvetica", Font.BOLD, 20));
		btnDisplay.setForeground(Color.BLACK);
		
		btnExit = new JButton("Exit");
		btnExit.setBackground(Color.RED);
		btnExit.setFont(new Font("Helvetica", Font.BOLD, 20));
		btnExit.setForeground(Color.WHITE);

		
			//------------create panels------------
		panelName = new JPanel();
		panelName.add(lblName);
		panelName.add(txtName);
		
		panelAge = new JPanel();
		panelAge.add(lblAge);
		panelAge.add(txtAge);
		
		panelEmail = new JPanel();
		panelEmail.add(lblEmail);
		panelEmail.add(txtEmail);
		
		pnlBottom1 = new JPanel();
		pnlBottom1.add(lblAuthor);
		
		pnlBottom2 = new JPanel();
		pnlBottom2.add(btnExit);
		
		pnlTwoButtons = new JPanel();
		pnlTwoButtons.add(btnAddName);
		pnlTwoButtons.add(Box.createRigidArea(new Dimension(0,10)));
		pnlTwoButtons.add(btnDisplay);
		
			// create listeners for components
		btnAddName.addActionListener(new AddNameListener());
		btnDisplay.addActionListener(new DisplayListener());
		btnExit.addActionListener(new ExitListener());

		
			// add sub panels to the main panel
		add(panelName);
		add(panelAge);
		add(panelEmail);
		add(pnlTwoButtons);
		add(pnlBottom1);
		add(pnlBottom2);
	}   // end constructor LinkedListGUI
	
	//------------listeners------------
	
	private class AddNameListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String inputName, inputAgeText, inputEmail;
			int inputAge;
			
			inputName = txtName.getText();
			
				// test to see if a string
				// has been entered
			if(inputName.equals(""))
			{
				JOptionPane.showMessageDialog(null, "You must enter a name!",
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
				return;
			}	// end if statement 
			
			inputAgeText = txtAge.getText();
			
				// test to see if an age
				// has been entered
			if(inputAgeText.equals(""))
			{
				JOptionPane.showMessageDialog(null, "You must enter an age!",
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
				return;
			} // end if statement
			
				// parse the age into an 'int' datatype
			inputAge = Integer.parseInt(inputAgeText);
			
			inputEmail = txtEmail.getText();
			
			// test to see if a string
			// has been entered
			if(inputEmail.equals(""))
			{
				JOptionPane.showMessageDialog(null, "You must enter an Email!",
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
				return;
			}	// end if statement 
		
				// add this new person to
				// the linked list
			newPerson = new Person(inputName, inputAge, inputEmail);
			everyone.add(newPerson);
			
			// reset text fields
			txtName.setText("");
			txtAge.setText("");
			txtEmail.setText("");
			
			
			
		}   // end method actionPerformed
	}   // end class AddNameListener
	
	private class DisplayListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{			
				// display the current linked list
			result = everyone.printList();
			JOptionPane.showMessageDialog(null, result,
					"Linked List",
					JOptionPane.INFORMATION_MESSAGE);
		}   // end method actionPerformed
	}   // end class DisplayListener
	
	private class ExitListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int answer;
			
			answer = JOptionPane.showConfirmDialog(null, "Exit Application?", 
					"Terminate",
					JOptionPane.YES_NO_OPTION);
					
					if(answer == JOptionPane.YES_OPTION)
					{
						System.exit(0);
					}
			

		}   // end method actionPerformed
	}   // end class ExitListener

}   // end LinkedListGUI
