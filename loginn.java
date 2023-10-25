import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

public class loginn extends JFrame implements ActionListener
  {
	JLabel l1,l2,l3,l4,l5,l6;
	JPasswordField password;
	JTextField t1;
	JButton  login_button;
	
          public loginn()
          {
	
       		 getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bh.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(1500,900);

		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f2=new Font("Viner Hand ITC",Font.BOLD,30);
	  	Font f1=new Font("Lucida Calligraphy",Font.BOLD,20);

		       //title of Gym

			JPanel p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,0,255,70));
			p1.setBounds(0,0,2000,100);
			add(p1);
			
		

			l1=new JLabel("Gym");
			l2=new JLabel("Management");
			l3=new JLabel("System");

			l1.setFont(f);
			l2.setFont(f);
			l3.setFont(f);

			l1.setForeground(Color.WHITE);
			l2.setForeground(new Color(55,255,255,255));
			l3.setForeground(Color.WHITE);

			l1.setBounds(10,10,120,80);
			l2.setBounds(130,10,340,80);
			l3.setBounds(440,10,480,80);

			p1.add(l1);
			p1.add(l2);
			p1.add(l3);

			//login panel
			JPanel l=new JPanel();
			l.setLayout(null);
			l.setSize(500,450);//l.setSize(400,350);
			//l.setBackground(new Color(255,165,0,123));
			l.setBackground(new Color(0,0,0,80));
                       
                        l.setBounds(720,300,480,480);  //l.setBounds(720,300,380,380); 


			l4=new JLabel("LO");
			l5=new JLabel("G");
			l6=new JLabel("IN");


			l4.setFont(f2);
			l4.setForeground(new Color(55,255,255,255));
			l.add(l4);

			l5.setFont(f2);
			l5.setForeground(Color.WHITE);
			l.add(l5);

			l6.setFont(f2);
			l6.setForeground(new Color(55,255,255,255));
			l.add(l6);

			l4.setBounds(185,40,180,60);
			l5.setBounds(225,40,180,60);
			l6.setBounds(245,40,180,60);

			t1=new JTextField("Enter username");
			t1.setBounds(70,120,350,60);
			//t1.setOpaque(false);
			t1.setForeground(new Color(130,0,250));
			//t1.setBackground(new Color(130,0,250));

			Border b = BorderFactory.createLineBorder(Color.WHITE, 2);
			Border b2 = BorderFactory.createLineBorder(Color.BLACK, 2);
			t1.setBorder(b2);
			l.setBorder(b);

			
			l.add(t1);


			
			 password=new JPasswordField("Enter password");
			//password.setBackground(new Color(130,0,250));
			password.setForeground(new Color(130,0,250));
			//password.setOpaque(false);
			password.setBounds(70,230,350,60);
			password.setBorder(b2);
			l.add(password);

			  login_button=new JButton("LOGIN");
			login_button.setBounds(185,340,120,70);
			login_button.setBackground(Color.WHITE);
			login_button.setForeground(new Color(130,0,250));

			Border b1 = BorderFactory.createLineBorder(new Color(130,0,250), 1);
			login_button.setBorder(b1);
			l.add(login_button);

			add(l);


			login_button.addActionListener(this);

}
 public void actionPerformed(ActionEvent ae)
          {
			String s=ae.getActionCommand();
			
			if(s.equals("LOGIN"))
			{
	 			   String user;
         			   String pwd;
          	 		   user= t1.getText();
          	 		   pwd= password.getText();
           			   if (user.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("12345"))
	   	 		   {
           	   			  JOptionPane.showMessageDialog(this, "Login Successful");
						new admin_main();
           	                   } 
	  			  else 
	  	                   {
           	    				 JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	   	                   }
		
			}
}

public static void main(String args[])
{
	new loginn();
}
}



		