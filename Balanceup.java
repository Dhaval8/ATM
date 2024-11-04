import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;




class Balanceup extends JFrame implements ActionListener{
	
	JButton backo;

	String numero;
	
	Balanceup(){
		
		ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("icons/leggo.jpg"));
		Image i8= i7.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i9= new ImageIcon(i8);
		JLabel image1= new JLabel(i9);
		image1.setBounds(0,0,900,730);
		
		
		 int balance =0;
		 Conn c= new Conn();
		try {
			
			
		
			 ResultSet rs = c.s.executeQuery( "select * from bank ");
			
			 while(rs.next()) {
				 
				 if(rs.getString("type").equals("Deposit")) {
					 balance+= Integer.parseInt(rs.getString("amount"));
				 }
				 else {
					 balance-=Integer.parseInt(rs.getString("amount"));
				 }
				 
				 
				 
			 }
			
		
			}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		JLabel bal= new JLabel("YOUR CURRENT ACCOUNT BALANCE IS "+balance);
		bal.setBounds(230,300,700,35);
		bal.setForeground(Color.BLACK);
		image1.add(bal);
	
	
		
		
		
		
		
	
		
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
		
		
		
		
	}
		
	
	

	public static void main(String[] args) {
	new Balanceup();

	}

}
