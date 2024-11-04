import javax.swing.*;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Withdraw extends JFrame implements ActionListener {
	
	JButton withdraw,backo;
	JTextField amttt;
	
	
	
	
Withdraw(){
		
		
		ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("icons/leggo.jpg"));
		Image i8= i7.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i9= new ImageIcon(i8);
		JLabel image1= new JLabel(i9);
		image1.setBounds(0,0,900,730);
		
		
		
		
		JLabel amt= new JLabel("Enter the amount you want to withdraw :-");
		amt.setBounds(220,235,700,35);
		amt.setFont(new Font("Arial", Font.BOLD,16));
		
		image1.add(amt);
		
		
		 amttt= new JTextField();
		amttt.setBounds(220,325,310,35);
		amttt.setFont(new Font("Arial", Font.BOLD,16));
		amttt.setBackground(Color.WHITE);
		image1.add(amttt);
		
		
	withdraw= new JButton("WITHDRAW");
	withdraw.setBounds(320,370,100,28);
		
	withdraw.setBackground(Color.WHITE);
	withdraw.setForeground(Color.BLACK);
	withdraw.addActionListener(this);
		image1.add(withdraw);
		
		
		backo= new JButton("BACK");
		backo.setBounds(320,400,100,28);
		backo.setBackground(Color.WHITE);
		backo.setForeground(Color.BLACK);
		backo.addActionListener(this);
		image1.add(backo);
		
		add(image1);
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
	}


	
	
	public void actionPerformed( ActionEvent ae) {
		if(ae.getSource()==backo) {
			setVisible(false);
			new Transactions().setVisible(true);
			
		}
		
		
		
			
			
		else {
			
			try {
				
				 String number=amttt.getText();
				 Conn c= new Conn();
				 
				 
				 
				 ResultSet rs = c.s.executeQuery( "select * from bank ");
				 int balance =0;
				 while(rs.next()) {
					 
					 if(rs.getString("type").equals("Deposit")) {
						 balance+= Integer.parseInt(rs.getString("amount"));
					 }
					 else {
						 balance-=Integer.parseInt(rs.getString("amount"));
					 }
					 
					 
					 
				 }
				 if(balance<= Integer.parseInt(number)) {
					 JOptionPane.showMessageDialog(null, "INSUFFICIENT BALANCE");
				 }
				 
				 
				 if(number.equals("")) {
						JOptionPane.showMessageDialog(null, "AMOUNT CANT BE BLANK");
					}
				 else if(number!=("")&& balance> Integer.parseInt(number) )  {
					 JOptionPane.showMessageDialog(null, "AMOUNT HAS BEEN WITHDRAWN");
				
					
					 String query="insert into bank values('"+number+"','Withdraw')";
					 c.s.executeUpdate(query);
					 amttt.setText("");
				
					
					
				}
				
			}
				 
				
				
			
			catch(Exception e) {
				System.out.println(e);
				
			}
			
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Withdraw();

	}

}
