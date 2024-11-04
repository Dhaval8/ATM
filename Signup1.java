import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Signup1 extends JFrame implements ActionListener {
	JTextField fullnametextfield,DOBfield,emailfield,addfield,cityfield,Pinfield;
	JLabel FullName;
	JButton next,back1;
	JRadioButton male,female;
	
	Signup1(){
		
		setLayout(null);
		setTitle("SIGNUP FORM PAGE 1");
		JLabel formno= new JLabel("APPLICATION NO. 4282");
		formno.setFont(new Font("Raleway" ,Font.BOLD,32));
		formno.setBounds(220,20,600,40);
		add(formno);
		
		JLabel persondetails= new JLabel("Page 1: Personal details"); 
		persondetails.setFont(new Font("Arial" ,Font.BOLD,20));
		persondetails.setBounds(270,80,600,40);
		add(persondetails);
		
		 FullName= new JLabel(" Full name:-"); 
		FullName.setFont(new Font("Arial" ,Font.BOLD,20));
		FullName.setBounds(80,140,400,40);
		add(FullName);
		
		
		fullnametextfield= new JTextField();
		fullnametextfield.setFont(new Font("Arial",Font.BOLD,16));
		fullnametextfield.setBounds(300,140,400,30);
		add(fullnametextfield);
		
		JLabel DOB= new JLabel(" Date of birth:-"); 
		DOB.setFont(new Font("Arial" ,Font.BOLD,20));
		DOB.setBounds(80,190,400,40);
		add(DOB);
		
		
		
		 DOBfield= new JTextField();
		DOBfield.setFont(new Font("Arial",Font.BOLD,16));
		DOBfield.setBounds(300,190,400,30);
		add(DOBfield);
		
		JLabel gender= new JLabel(" Gender:-"); 
		gender.setFont(new Font("Arial" ,Font.BOLD,20));
		gender.setBounds(80,240,400,40);
		add(gender);
		
	male= new JRadioButton("Male");
		male.setFont(new Font("Raleway",Font.BOLD,15));
		male.setBounds(300,240,60,30);
		male.setBackground(Color.CYAN);
		add(male);
		
	 female= new JRadioButton("Female");
		female.setFont(new Font("Raleway",Font.BOLD,15));
		female.setBounds(400,240,80,30);
		female.setBackground(Color.CYAN);
		add(female);
		
		ButtonGroup group= new ButtonGroup();
		group.add(male);
		group.add(female);
		
		
		
		
		JLabel email= new JLabel("Email address:-"); 
		email.setFont(new Font("Arial" ,Font.BOLD,20));
		email.setBounds(85,290,400,40);
		add(email);
		
		
emailfield= new JTextField();
		emailfield.setFont(new Font("Arial",Font.BOLD,16));
		emailfield.setBounds(300,290,400,30);
		add(emailfield);
		
		JLabel address= new JLabel("Address:-"); 
		address.setFont(new Font("Arial" ,Font.BOLD,20));
		address.setBounds(85,340,400,40);
		add(address);
		
	addfield= new JTextField();
		addfield.setFont(new Font("Arial",Font.BOLD,16));
		addfield.setBounds(300,340,400,30);
		add(addfield);
		
	
		
		JLabel city= new JLabel("City:-"); 
		city.setFont(new Font("Arial" ,Font.BOLD,20));
		city.setBounds(85,390,400,40);
		add(city);
		
		 cityfield= new JTextField();
		cityfield.setFont(new Font("Arial",Font.BOLD,16));
		cityfield.setBounds(300,390,400,30);
		add(cityfield);
		
	
		
		JLabel pin= new JLabel("Pin code:-"); 
		pin.setFont(new Font("Arial" ,Font.BOLD,20));
		pin.setBounds(85,440,400,40);
		add(pin);
		
		 Pinfield= new JTextField();
		Pinfield.setFont(new Font("Arial",Font.BOLD,16));
		Pinfield.setBounds(300,440,400,30);
		add(Pinfield);
		
		JLabel amr= new JLabel("Marital Status:-"); 
		amr.setFont(new Font("Arial" ,Font.BOLD,20));
		amr.setBounds(85,490,400,40);
		add(amr);
		
		JRadioButton married= new JRadioButton("Married");
		married.setFont(new Font("Raleway",Font.BOLD,15));
		married.setBounds(300,500,80,30);
		married.setBackground(Color.CYAN);
		add(married);
		
		JRadioButton unamrried= new JRadioButton("Unmarried");
		unamrried.setFont(new Font("Raleway",Font.BOLD,15));
		unamrried.setBounds(400,500,100,30);
		unamrried.setBackground(Color.CYAN);
		add(unamrried);
		
		JRadioButton other= new JRadioButton("Other");
		other.setFont(new Font("Raleway",Font.BOLD,15));
		other.setBounds(520,500,80,30);
		other.setBackground(Color.CYAN);
		add(other);
		group.add(married);
		group.add(unamrried);
		group.add(other);
		
		
		next= new JButton("NEXT-->");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway" , Font.BOLD,18));
		next.setBounds(600,600,130,30);
		next.addActionListener(this);
		add(next);
		
		back1= new JButton("<--BACK");
		back1.setBackground(Color.BLACK);
		back1.setForeground(Color.WHITE);
		back1.setFont(new Font("Raleway" , Font.BOLD,18));
		back1.setBounds(300,600,130,30);
		back1.addActionListener(this);
		add(back1);
		
		getContentPane().setBackground(Color.CYAN);
		setSize(850,800);
		setLocation(250,10);
		setVisible(true);
		
		
		
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		String name=fullnametextfield.getText();
		String date= DOBfield.getText();
		String pino= Pinfield.getText();
		String cito= cityfield.getText();
		String adrro= addfield.getText();
		String emu= emailfield.getText();
		
			if(name.equals("") && ae.getSource()==next) {
				JOptionPane.showMessageDialog(null, "Name cannot be empty");
				
			}
			if(date.equals("") && ae.getSource()==next) {
				JOptionPane.showMessageDialog(null, "Date cannot be empty");
				
			}
			if(pino.equals("") && ae.getSource()==next) {
				JOptionPane.showMessageDialog(null, "Pincode cannot be empty");
				
			}
			if(cito.equals("") && ae.getSource()==next) {
				JOptionPane.showMessageDialog(null, "City cannot be empty");
				
			}
			if(adrro.equals("") && ae.getSource()==next) {
				JOptionPane.showMessageDialog(null, "Adress cannot be empty");
				
			}
			
			if(emu.equals("") && ae.getSource()==next) {
				JOptionPane.showMessageDialog(null, "Email cannot be empty");
				
			}
			
			else 
			{
				
				setVisible(false);
				new Signup2().setVisible(true);
				
				
			}
			if(ae.getSource()==back1) {
				setVisible(false);
				new Login().setVisible(true);
				}
			
			
		}
		
		
	
	public static void main(String[] args) {
		new Signup1();

	}

}
