import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Graphics;
//import java.util.*;
import javax.swing.border.*;
import java.lang.*;
import java.io.*;

public class budget extends JFrame //implements ActionListener
{
 	
	
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	 int x = 500;
	Timer timer;
	JButton b2,b3,b4,b5,b6,b7,b8,b9,b12,b13,b1,b10,b11;
    	JComboBox cb1;
   	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
    	JTextField t1,t2,t3,t4,t5,t6,t7,t9,t10,t11,t12,t13;
	int count=0;
	int id;
	   int p;
	int i1,i2,i3,i6,i7,i8;
	int i4=0;
	int i5=0;
	String s1,s2,s3,s4;

		JFrame j = new JFrame("Frame in Java Swing");
		  
		
			


	public budget()
	{
		 j.getContentPane();
	 	 j.setLayout(null);
 	  	 j.setVisible(true);
		 j.setSize(900,900);
		
       		  j.setTitle("Customer Registration");
		
		 j.setContentPane(new JLabel(new ImageIcon("bh.jpg")));
		
		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f1=new Font("Times New Roman",Font.BOLD,20);
	  	Font f2=new Font("Times New Roman",Font.BOLD,15);

			p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,0,255,70));
			p1.setBounds(0,0,2000,150);
			
			j.add(p1);
			
		

			l1=new JLabel("Gym");
			l2=new JLabel("Management");
			l3=new JLabel("System");

			l1.setFont(f);
			l2.setFont(f);
			l3.setFont(f);

			l1.setForeground(Color.WHITE);
			l2.setForeground(new Color(55,255,255,255));
			l3.setForeground(Color.WHITE);

			l1.setBounds(70,23,120,80);
			l2.setBounds(190,23,340,80);
			l3.setBounds(500,23,480,80);

			p1.add(l1);
			p1.add(l2);
			p1.add(l3);


			
			p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(Color.WHITE);
			p3.setBounds(750,350,300,480);
			j.add(p3);

			l4=new JLabel("Gym Management System ");
			l4.setBounds(30,10,290,80);
			l4.setFont(f1);

			l5=new JLabel("By GPM Students ");
			l5.setBounds(80,40,250,80);
			l5.setFont(f2);



			l6=new JLabel("-----------------------------------------");
			l6.setBounds(10,70,290,80);
			l6.setFont(f1);

			l7=new JLabel("-----------------------------------------");
			l7.setBounds(10,75,290,80);
			l7.setFont(f1);


			
			l8=new JLabel("CUSTOMER :");
			l8.setBounds(10,140,290,80);
			l8.setFont(f1);

			l9=new JLabel("-----------------------------------------");
			l9.setBounds(10,160,290,80);
			l9.setFont(f1);

			l10=new JLabel("TRAINER :");
			l10.setBounds(10,205,290,80);
			l10.setFont(f1);

			l11=new JLabel("-----------------------------------------");
			l11.setBounds(10,225,290,80);
			l11.setFont(f1);

			l12=new JLabel("EQUIPMENT :");
			l12.setBounds(10,265,290,80);
			l12.setFont(f1);

			l13=new JLabel("-----------------------------------------");
			l13.setBounds(10,285,290,80);
			l13.setFont(f1);

			l14=new JLabel("TOTAL :");
			l14.setBounds(40,335,290,80);
			l14.setFont(f1);


			try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
				PreparedStatement ps=co.prepareStatement("select * from total");
			
				ResultSet re=ps.executeQuery();

				while(re.next())
			        {
						i1=re.getInt(1);
						//s1=Integer.toString(i1);
					l15=new JLabel(""+i1);

				}
						
						ps.close();
						co.close();


			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}


			try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
				PreparedStatement p1=co.prepareStatement("select * from tratotal");
			
				ResultSet r1=p1.executeQuery();

				while(r1.next())
			        {
						i2=r1.getInt(1);
						
					l16=new JLabel(""+i2);

				}
						
						p1.close();
						co.close();


			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}

			try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
				PreparedStatement p=co.prepareStatement("select * from euitotal");
			
				ResultSet r=p.executeQuery();

				while(r.next())
			        {
						i3=r.getInt(1);
						
					l17=new JLabel(""+i3);

				}
						
						p.close();
						co.close();


			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}


					i4=i1-i2;
					i5=i4-i3;

				s4=String.valueOf(i5);
		
				l18=new JLabel(s4);

			



			l15.setBounds(190,140,290,80);
			l15.setFont(f1);

			
			l16.setBounds(190,205,290,80);
			l16.setFont(f1);

			
			l17.setBounds(190,265,290,80);
			l17.setFont(f1);

			l18.setBounds(190,335,290,80);
			l18.setFont(f1);





			p3.add(l4);
			p3.add(l5);
			p3.add(l6);
			p3.add(l7);
			p3.add(l8);
			p3.add(l9);
			p3.add(l10);
			p3.add(l11);
			p3.add(l12);
			p3.add(l13);
			p3.add(l14);
			p3.add(l15);
			p3.add(l16);
			p3.add(l17);
			p3.add(l18);
			





}
public static void main(String args[])
{
	 new budget();
	
	
}
}