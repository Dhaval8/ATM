import javax.swing.*;


import java.awt.*;
import java.awt.event.*;







public class Transactions extends JFrame implements ActionListener {
	
	JButton exit,bal,fc,deposit,withd,log;
	
	Transactions(){
		setLayout(null);
		
		ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/leggo.jpg"));
		Image i5= i4.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel image= new JLabel(i6);
		image.setBounds(0,0,900,730);
		add(image);
		
		
		JLabel heading= new JLabel("CHOOSE YOUR TRANSACTION:-");
		heading.setBounds(260,235,700,35);
		heading.setFont(new Font("Arial", Font.BOLD,16));
		
		image.add(heading);
		
		
		
		withd= new JButton("WITHDRAW");
		withd.setBounds(230,310,100,28);
		withd.setBackground(Color.CYAN);
		withd.setForeground(Color.BLACK);
		withd.addActionListener(this);
		
		image.add(withd);
		
		
		deposit= new JButton("DEPOSIT");
		deposit.setBounds(430,310,100,28);
		deposit.setBackground(Color.magenta);
		deposit.setForeground(Color.BLACK);
		deposit.addActionListener(this);
		image.add(deposit);
		
		 bal= new JButton("BALANCE");
			bal.setBounds(230,390,100,28);
			bal.setBackground(Color.LIGHT_GRAY);
			bal.setForeground(Color.BLACK);
			bal.addActionListener(this);
			image.add(bal);
			
			 fc= new JButton("FAST CASH");
				fc.setBounds(330,350,100,28);
				fc.setBackground(Color.WHITE);
				fc.setForeground(Color.BLACK);
				fc.addActionListener(this);
				image.add(fc);
			
		
		
		 exit= new JButton("EXIT");
		exit.setBounds(430,390,100,28);
		exit.setBackground(Color.orange);
		exit.setForeground(Color.BLACK);
		exit.addActionListener(this);
		image.add(exit);
		
		 log= new JButton("LOG OUT");
			log.setBounds(315,467,100,28);
			log.setBackground(Color.GREEN);
			log.setForeground(Color.BLACK);
			log.addActionListener(this);
			image.add(log);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
		
	}

public void actionPerformed(ActionEvent ae) {
	
	
	if(ae.getSource()==exit) {
		System.exit(0);
	}
	
	
	if(ae.getSource()==log) {
		setVisible(false);
		new Login().setVisible(true);
	}
	if(ae.getSource()==deposit) {
		setVisible(false);
		new Deposit().setVisible(true);
		
	}
	
	if(ae.getSource()==bal) {
		setVisible(false);
	
		new Balanceup().setVisible(true);
	}
	if(ae.getSource()==withd) {
		setVisible(false);
	
		new Withdraw().setVisible(true);
	}
	
	if(ae.getSource()==fc) {
		setVisible(false);
	
		new Fastcash().setVisible(true);
	}
	
}
	public static void main(String[] args) {
	new Transactions();
	
	
	

	}

}
