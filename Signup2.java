import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup2 extends JFrame implements ActionListener {
	JTextField fullnametextfield,aadharfield;
	JLabel Religion;
	JButton register ,back;
	JComboBox reli;
	
	
	Signup2(){
		
		setLayout(null);
		setTitle("SIGNUP FORM PAGE 2");
		JLabel formno= new JLabel("APPLICATION NO. 4282");
		formno.setFont(new Font("Raleway" ,Font.BOLD,32));
		formno.setBounds(220,20,600,40);
		add(formno);
		
		JLabel applicationdetails= new JLabel("Page 2: Bank and application details"); 
		applicationdetails.setFont(new Font("Arial" ,Font.BOLD,20));
		applicationdetails.setBounds(270,80,600,40);
		add(applicationdetails);
		
		 Religion= new JLabel("Religion:-"); 
		Religion.setFont(new Font("Arial" ,Font.BOLD,20));
		Religion.setBounds(80,140,400,40);
		add(Religion);
		
		
	
	String valreli[]= {"Select","Hindu","Muslim","Christian","Other"};
	reli= new JComboBox(valreli);
	reli.setBounds(300,145,400,30);
	reli.setBackground(Color.CYAN);
	add(reli);
	
		
	
		

		String valreli1[]= {"Select","General","OBC","SC","ST","Other"};
		JComboBox cat= new JComboBox(valreli1);
		cat.setBounds(300,195,400,30);
		cat.setBackground(Color.CYAN);
		add(cat);
		
	
		
		JLabel Aadhar= new JLabel(" Aadhar no:-"); 
		Aadhar.setFont(new Font("Arial" ,Font.BOLD,20));
		Aadhar.setBounds(80,300,400,40);
		add(Aadhar);
		
		aadharfield= new JTextField();
		aadharfield.setFont(new Font("Arial",Font.BOLD,16));
		aadharfield.setBounds(300,300,400,30);
		add(aadharfield);
		
		
		JLabel exi= new JLabel(" Exisiting acccount :-"); 
		exi.setFont(new Font("Arial" ,Font.BOLD,20));
		exi.setBounds(80,240,400,40);
		add(exi);
		
		JRadioButton yes= new JRadioButton("Yes");
		yes.setFont(new Font("Raleway",Font.BOLD,15));
		yes.setBounds(300,250,60,30);
		yes.setBackground(Color.CYAN);
		add(yes);
		
		JRadioButton no= new JRadioButton("No");
		no.setFont(new Font("Raleway",Font.BOLD,15));
		no.setBounds(400,250,80,30);
		no.setBackground(Color.CYAN);
		add(no);
		
		ButtonGroup group= new ButtonGroup();
		group.add(yes);
		group.add(no);
		
		
		
	
		JLabel serv= new JLabel("Services Required:-"); 
		serv.setFont(new Font("Arial" ,Font.BOLD,20));
		serv.setBounds(85,340,400,40);
		add(serv);
		
		JRadioButton atmc= new JRadioButton("ATM CARD");
		atmc.setFont(new Font("Raleway",Font.BOLD,15));
		atmc.setBounds(300,340,150,30);
	atmc.setBackground(Color.CYAN);
		add(atmc);
		
		JRadioButton irb= new JRadioButton("Internet Banking");
		irb.setFont(new Font("Raleway",Font.BOLD,15));
		irb.setBounds(450,340,200,30);
		irb.setBackground(Color.CYAN);
		add(irb);
		
		JRadioButton eal= new JRadioButton("Email alerts");
		eal.setFont(new Font("Raleway",Font.BOLD,15));
		eal.setBounds(380,380,250,30);
		eal.setBackground(Color.CYAN);
		add(eal);
		group.add(atmc);
		group.add(irb);
		group.add(eal);
		
		
	
		
		JLabel occupa= new JLabel("Occupation:-"); 
	occupa.setFont(new Font("Arial" ,Font.BOLD,20));
		occupa.setBounds(85,440,400,40);
		add(occupa);
		
		String occu[]= {"Select","Bussiness","Student","SELF - EMPLOYED","Other"};
		JComboBox occu1= new JComboBox(occu);
		occu1.setBounds(300,445,400,30);
		occu1.setBackground(Color.CYAN);
		add(occu1);
		
			
			JLabel category= new JLabel(" Category:-"); 
			category.setFont(new Font("Arial" ,Font.BOLD,20));
		category.setBounds(80,190,400,40);
			add(category);
			
		
		
		
		JLabel acc= new JLabel("Account Type:-"); 
		acc.setFont(new Font("Arial" ,Font.BOLD,20));
		acc.setBounds(85,490,400,40);
		add(acc);
		
		JRadioButton sav= new JRadioButton("Savings Account");
		sav.setFont(new Font("Raleway",Font.BOLD,15));
		sav.setBounds(300,500,150,30);
	sav.setBackground(Color.CYAN);
		add(sav);
		
		JRadioButton fixd= new JRadioButton("Fixed Deposits Account");
		fixd.setFont(new Font("Raleway",Font.BOLD,15));
		fixd.setBounds(480,500,200,30);
		fixd.setBackground(Color.CYAN);
		add(fixd);
		
		JRadioButton recd= new JRadioButton("Recurring Deposist account");
		recd.setFont(new Font("Raleway",Font.BOLD,15));
		recd.setBounds(390,540,250,30);
		recd.setBackground(Color.CYAN);
		add(recd);
		group.add(recd);
		group.add(sav);
		group.add(fixd);
		
		
		register= new JButton("SUBMIT-->");
		register.setBackground(Color.BLACK);
		register.setForeground(Color.WHITE);
		register.setFont(new Font("Raleway" , Font.BOLD,18));
		register.setBounds(600,600,130,30);
		register.addActionListener(this);
		add(register);
		
		back= new JButton("<--BACK ");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Raleway" , Font.BOLD,18));
		back.setBounds(300,600,130,30);
		back.addActionListener(this);
		add(back);
		
		getContentPane().setBackground(Color.CYAN);
		setSize(850,800);
		setLocation(250,10);
		setVisible(true);
		
		
		
		
	}

	
	public void actionPerformed(ActionEvent be) {
		 String adh= aadharfield.getText();
		 String box= (String) reli.getSelectedItem();
		 
		 try {
		if(adh.equals("") && be.getSource()==register) {
			
			JOptionPane.showMessageDialog(null, "Aadhar no. cannot be empty");
			
		}

				
			
		else{
				JOptionPane.showMessageDialog(null,"THANKS FOR REGISTERING");
			Random ran= new Random();
			String cardno=""+Math.abs((ran.nextLong()%90000000)+7896390800000000L);
			String pinno=""+Math.abs((ran.nextLong()%900L)+1000L);
			
				JOptionPane.showMessageDialog(null, "Your card number is: "+cardno+"\n Your pin is: "+pinno);
				
				Conn c= new Conn();
				 String query="insert into details values('"+cardno+"','"+pinno+"')";
				 c.s.executeUpdate(query);
				
				
				setVisible(false);
				new Login().setVisible(true);
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
			
			if(be.getSource()==back) {
				
				setVisible(false);
				new Signup1().setVisible(true);
			}
			
		
		}

	
	public static void main(String[] args) {
		new Signup2();

	}

}

