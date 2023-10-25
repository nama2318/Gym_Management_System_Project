import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.io.File;
import java.awt.Graphics;
import java.io.IOException;
import java.awt.Desktop;

public class admin_main extends JFrame implements ActionListener
{
 	JLabel l1,l2,l4,l3,l5,l6,l7,l8;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b14;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	 int x = 500,a=500,c=500,d=500,e=500;
	Timer timer;

	
	public admin_main()
	{
		getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bh.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(1500,900);

		
		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f1=new Font("Times New Roman",Font.BOLD,20);
	  	//Font f1=new Font("Lucida Calligraphy",Font.Bold,20);

			
			JPanel p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,0,255,70));
			p1.setBounds(0,0,2000,150);
			add(p1);
			
		

			l1=new JLabel("Gym");
			l2=new JLabel("Management");
			l3=new JLabel("System");

			l1.setFont(f);
			l2.setFont(f);
			l3.setFont(f);

			l1.setForeground(Color.white);
			l2.setForeground(new Color(55,255,255,255));
			l3.setForeground(Color.WHITE);

			l1.setBounds(10,23,120,80);
			l2.setBounds(130,23,340,80);
			l3.setBounds(440,23,480,80);

			p1.add(l1);
			p1.add(l2);
			p1.add(l3);

			Border b = BorderFactory.createLineBorder(Color.BLACK, 1);
			Border a2 = BorderFactory.createLineBorder(Color.BLACK, 3);
			Border a1 = BorderFactory.createLineBorder(Color.BLACK, 2);
			
			
			p2=new JPanel();
			p2.setLayout(null);
			p2.setSize(400,350);
			p2.setBackground(new Color(150,0,250));
			p2.setBounds(0,170,250,1000);
			p2.setBorder(a2);
			add(p2);
			
			
		
			b1= new JButton("USER REGISTRATION");
			b1.setBackground(new Color(255,255,250));
			b1.setForeground(new Color(130,0,250));
			b1.setBounds(30,150,170,40);
			b1.setBorder(b);

			
			b2= new JButton("TRAINER REGISTRATION");
			b2.setBackground(new Color(255,255,250));
			b2.setForeground(new Color(130,0,250));
			b2.setBounds(30,150,170,40);
			b2.setBorder(b);

			b3= new JButton("EQUIPMENT REGISTRATION");
			b3.setBackground(new Color(255,255,250));
			b3.setForeground(new Color(130,0,250));
			b3.setBounds(30,150,170,40);
			b3.setBorder(b);


			b4= new JButton("PACKAGE UPDATES");
			b4.setBackground(new Color(255,255,250));
			b4.setForeground(new Color(130,0,250));
			b4.setBounds(30,150,170,40);
			b4.setBorder(b);

			b5= new JButton("DIETPLAN UPDATES");
			b5.setBackground(new Color(255,255,250));
			b5.setForeground(new Color(130,0,250));
			b5.setBounds(30,150,170,40);
			b5.setBorder(b);

			p2.add(b1);
			p2.add(b2);
			p2.add(b3);
			p2.add(b4);
			p2.add(b5);


			
			p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(new Color(0,0,0,20));
			p3.setBounds(260,170,1700,1000);
			
			add(p3);

			b6= new JButton(new ImageIcon("usser.jpg"));
			b6.setBounds(170,100,240,220);
			b6.setBackground(Color.WHITE);
			b6.setBorder(a1);
			p3.add(b6);
	
			b7= new JButton(new ImageIcon("trainer.jpg"));
			b7.setBounds(720,100,240,220);
			b7.setBackground(Color.WHITE);
			b7.setBorder(a1);
			p3.add(b7);

			b8= new JButton(new ImageIcon("eui.jpg"));
			b8.setBounds(1200,100,240,220);
			b8.setBackground(Color.WHITE);
			b8.setBorder(a1);
			p3.add(b8);

			b9= new JButton(new ImageIcon("pay.jpg"));
			b9.setBounds(450,400,240,220);
			b9.setBackground(Color.WHITE);
			b9.setBorder(a1);
			p3.add(b9);

			b10= new JButton(new ImageIcon("bug.jpg"));
			b10.setBounds(1000,400,240,220);
			b10.setBackground(Color.WHITE);
			p3.add(b10);
			b10.setBorder(a1);

			p4=new JPanel();
			p4.setLayout(null);
			p4.setSize(400,350);
			p4.setBackground(new Color(255,255,250));
			p4.setBounds(200,330,180,25);
			p4.setBorder(b);
			p3.add(p4);
	
			p5=new JPanel();
			p5.setLayout(null);
			p5.setSize(400,350);
			p5.setBackground(new Color(255,255,250));
			p5.setBounds(750,330,180,25);
			p5.setBorder(b);
			p3.add(p5);
	
			p6=new JPanel();
			p6.setLayout(null);
			p6.setSize(400,350);
			p6.setBackground(new Color(255,255,250));
			p6.setBounds(1230,330,180,25);
			p6.setBorder(b);
			p3.add(p6);
	
			p7=new JPanel();
			p7.setLayout(null);
			p7.setSize(400,350);
			p7.setBackground(new Color(255,255,250));
			p7.setBounds(480,630,180,25);
			p7.setBorder(b);
			p3.add(p7);
	
			p8=new JPanel();
			p8.setLayout(null);
			p8.setSize(400,350);
			p8.setBackground(new Color(255,255,250));
			p8.setBounds(1030,630,180,25);
			p8.setBorder(b);
			p3.add(p8);
	

			
			l4=new JLabel("Members");
			l5=new JLabel("Trainers");
			l6=new JLabel("Equipments");
			l7=new JLabel("Payment");
			l8=new JLabel("Monthly Budget");
			
			l4.setFont(f1);
			l5.setFont(f1);
			l6.setFont(f1);
			l7.setFont(f1);
			l8.setFont(f1);

			l4.setForeground(new Color(130,0,250));
			l5.setForeground(new Color(130,0,250));
			l6.setForeground(new Color(130,0,250));
			l7.setForeground(new Color(130,0,250));
			l8.setForeground(new Color(130,0,250));

			l4.setBounds(50,3,120,20);
			l5.setBounds(50,3,120,20);
			l6.setBounds(40,3,120,20);
			l7.setBounds(50,3,120,20);
			l8.setBounds(25,3,170,20);

			l4.setBackground(Color.BLACK);
		//	l8.setBorder(b);

			p4.add(l4);
			p5.add(l5);
			p6.add(l6);
			p7.add(l7);
			p8.add(l8);



			
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);

	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	

				timer = new Timer(30,this);
			
				timer.start();

	}
public void actionPerformed(ActionEvent ae) {

String s=ae.getActionCommand();
	
		if(x >= 190)
		{
        	   
			
			if(x >= 250)
			{
				
				if(x >= 310)
				{

					if(x >= 370)
					{
						if(x >= 430)
						{
	    						b5.setLocation(20,x--);
							timer.start();
						}
						else
						{
							 timer.stop();
						}
	    					b4.setLocation(20,x--);
						timer.start();
					}
					else
					{
						 timer.stop();
					}
	    				b3.setLocation(20,x--);
					timer.start();
				}
				else
				{
					 timer.stop();
				}
	    		    b2.setLocation(20,x--);
		            timer.start();
			
 			}
		
		
			else
			{
			 timer.stop();
				
				
				
		}

			  b1.setLocation(20,x--);
	     	  	  timer.start();

		}

		else
		{
		 	timer.stop();

			
				if(s.equals("USER REGISTRATION"))
				{
					         new customer_reg();
				}

				if(s.equals("TRAINER REGISTRATION"))
				{
						new trainer_reg();

				}

				if(ae.getSource()==b3)
				{
						 new equipment_reg();

				}
			
				if(s.equals("PACKAGE UPDATES"))
				{
						File file;
					try{ 
							 file = new File("packeges.pdf");
							 if(!Desktop.isDesktopSupported()){
            						  System.out.println("Desktop is not supported");
           							 return;
      							  }
        
      								  Desktop desktop = Desktop.getDesktop();
     							   if(file.exists()) desktop.open(file);

					 }
					catch(IOException z)
					{
						JOptionPane.showMessageDialog(this,""+z);}
									
						
					
				}
			
				if(s.equals("DIETPLAN UPDATES"))
				{
				
					
						File file;
					try{ 
							 file = new File("diet plan.pdf");
							 if(!Desktop.isDesktopSupported()){
            						  System.out.println("Desktop is not supported");
           							 return;
      							  }
        
      								  Desktop desktop = Desktop.getDesktop();
     							   if(file.exists()) desktop.open(file);

					 }
					catch(IOException z)
					{
						JOptionPane.showMessageDialog(this,""+z);}
				}

				if(ae.getSource()==b6)
				{
					new Ct();
				}
				if(ae.getSource()==b7)
				{
					new Tt();
				}
				if(ae.getSource()==b8)
				{
					new Et();
				}
				if(ae.getSource()==b9)
				{
					new payment();
				}
				if(ae.getSource()==b10)
				{
					new budget();
				}



			}
				
			
		}





public static void main(String args[])
{
	new admin_main();
}




}