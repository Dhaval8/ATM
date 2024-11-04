import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;







public class Fastcash extends JFrame implements ActionListener {
	
	JButton r500,r1000,r5000,r10000,exit;
	
	Fastcash(){
		setLayout(null);
		
		ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/leggo.jpg"));
		Image i5= i4.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel image= new JLabel(i6);
		image.setBounds(0,0,900,730);
		add(image);
		
		
		JLabel heading= new JLabel("SELECT AMOUNT:-");
		heading.setBounds(260,235,700,35);
		heading.setFont(new Font("Arial", Font.BOLD,16));
		
		image.add(heading);
		
		
		
		r500= new JButton("RS 500");
		r500.setBounds(230,310,100,28);
		r500.setBackground(Color.WHITE);
		r500.setForeground(Color.BLACK);
		r500.addActionListener(this);
		
		image.add(r500);
		
		
		r1000= new JButton("RS 1000");
		r1000.setBounds(430,310,100,28);
		r1000.setBackground(Color.WHITE);
		r1000.setForeground(Color.BLACK);
		r1000.addActionListener(this);
		image.add(r1000);
		
		 r5000= new JButton("RS 5000");
		 r5000.setBounds(230,390,100,28);
		 r5000.setBackground(Color.WHITE);
		 r5000.setForeground(Color.BLACK);
		 r5000.addActionListener(this);
			image.add(r5000);
			
			 r10000= new JButton("RS 10000");
			 r10000.setBounds(330,350,100,28);
			 r10000.setBackground(Color.WHITE);
			 r10000.setForeground(Color.BLACK);
			 r10000.addActionListener(this);
				image.add(r10000);
			
		
		
		 exit= new JButton("BACK");
		exit.setBounds(430,390,100,28);
		exit.setBackground(Color.WHITE);
		exit.setForeground(Color.BLACK);
		exit.addActionListener(this);
		image.add(exit);
		
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
		
	}

public void actionPerformed(ActionEvent ae) {
	
	
	if(ae.getSource()==exit) {
		setVisible(false);
		new Transactions().setVisible(true);
	}
	
	if(ae.getSource()==r500) {
		try {
			
			 String number="500";
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
			 
			 
			
			 else if(number!=("")&& balance> Integer.parseInt(number) )  {
				 JOptionPane.showMessageDialog(null, "500 RS HAS BEEN WITHDRAWN");
			
				
				 String query="insert into bank values('"+number+"','Withdraw')";
				 c.s.executeUpdate(query);
				 
			
				
				
			}
			
		}
			 
			
			
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
}

		
	
	
	if(ae.getSource()==r1000) {
		try {
			
			 String number="1000";
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
			 
			 
			
			 else if(number!=("")&& balance> Integer.parseInt(number) )  {
				 JOptionPane.showMessageDialog(null, "1000 RS HAS BEEN WITHDRAWN");
			
				
				 String query="insert into bank values('"+number+"','Withdraw')";
				 c.s.executeUpdate(query);
				 
			
				
				
			}
			
		}
			 
			
			
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	if(ae.getSource()==r5000) {
		try {
			
			 String number="5000";
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
			 
			 
			
			 else if(number!=("")&& balance> Integer.parseInt(number) )  {
				 JOptionPane.showMessageDialog(null, "5000 RS HAS BEEN WITHDRAWN");
			
				
				 String query="insert into bank values('"+number+"','Withdraw')";
				 c.s.executeUpdate(query);
				 
			
				
				
			}
			
		}
			 
			
			
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	if(ae.getSource()==r10000) {
		try {
			
			 String number="10000";
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
			 
			 
			
			 else if(number!=("")&& balance> Integer.parseInt(number) )  {
				 JOptionPane.showMessageDialog(null, "10000 RS HAS BEEN WITHDRAWN");
			
				
				 String query="insert into bank values('"+number+"','Withdraw')";
				 c.s.executeUpdate(query);
				 
			
				
				
			}
			
		}
			 
			
			
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Fastcash();
	}

}
