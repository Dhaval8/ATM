import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


public class Deposit  extends JFrame implements ActionListener{
	JButton deeposit,backo;
	JTextField amtt;
	
	
	
	
Deposit(){
		
		
		ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("icons/leggo.jpg"));
		Image i8= i7.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i9= new ImageIcon(i8);
		JLabel image1= new JLabel(i9);
		image1.setBounds(0,0,900,730);
		
		
		
		
		JLabel amt= new JLabel("Enter the amount you want to deposit :-");
		amt.setBounds(220,235,700,35);
		amt.setFont(new Font("Arial", Font.BOLD,16));
		
		image1.add(amt);
		
		
		 amtt= new JTextField();
		amtt.setBounds(220,325,310,35);
		amtt.setFont(new Font("Arial", Font.BOLD,16));
		amtt.setBackground(Color.WHITE);
		image1.add(amtt);
		
		
		deeposit= new JButton("DEPOSIT");
		deeposit.setBounds(320,370,100,28);
		
		deeposit.setBackground(Color.WHITE);
		deeposit.setForeground(Color.BLACK);
		deeposit.addActionListener(this);
		image1.add(deeposit);
		
		
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
			String number=amtt.getText();
			 
			 if(number.equals("")) {
					JOptionPane.showMessageDialog(null, "AMOUNT CANT BE BLANK");
				}
			
		else {
				 JOptionPane.showMessageDialog(null, "AMOUNT HAS BEEN DEPOSITED");
				
				 Conn c= new Conn();
				 String query="insert into bank values('"+number+"','Deposit')";
				 c.s.executeUpdate(query);
				 amtt.setText("");
			
				
				
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	}



	public static void main(String[] args) {
		new Deposit();

	}

}
