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

public class tup extends JFrame implements ActionListener
{
 	
	
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	 int x = 500;
	Timer timer;
	JButton b2,b3,b4,b5,b6,b7,b8,b9,b12,b13;
    	JComboBox cb1;
   	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    	JTextField t1,t2,t3,t4,t5,t6,t7,t9,t10,t11,t12,t13,t14;
	int count=0;
	int id;

		JFrame j = new JFrame("Frame in Java Swing");
		  
		
			


	public tup()
	{
		 j.getContentPane();
	 	 j.setLayout(null);
 	  	 j.setVisible(true);
		 j.setSize(900,900);
		
		
		 j.setContentPane(new JLabel(new ImageIcon("rbg.jpg")));
		
		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f1=new Font("Times New Roman",Font.BOLD,20);
	  	//Font f1=new Font("Lucida Calligraphy",Font.Bold,20);

			p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(255,165,0,90));
			p1.setBounds(0,0,1500,100);
			
			j.add(p1);
			
		

			l1=new JLabel("Gym");
			l2=new JLabel("Management");
			l3=new JLabel("System");

			l1.setFont(f);
			l2.setFont(f);
			l3.setFont(f);

			l1.setForeground(Color.WHITE);
			l2.setForeground(new Color(255,165,0));
			l3.setForeground(Color.WHITE);

			l1.setBounds(70,10,120,80);
			l2.setBounds(190,10,340,80);
			l3.setBounds(500,10,480,80);

			p1.add(l1);
			p1.add(l2);
			p1.add(l3);
	

			Border b = BorderFactory.createLineBorder(Color.WHITE, 1);
			Border a2 = BorderFactory.createLineBorder(Color.BLACK, 3);
			Border a1 = BorderFactory.createLineBorder(Color.BLACK, 2);

			String bg[]={"A+","A-","B+","B-","O+","O-","AB+","AB-"};
    			
			 cb1=new JComboBox(bg);

			TitledBorder a=new TitledBorder(new LineBorder(Color.white, 2), "Trainer Registration", TitledBorder.LEADING,TitledBorder.TOP,null,new Color(255,165,0));
			 a.setTitleFont(new Font("Modern No. 20", Font.PLAIN, 20));



			p2=new JPanel();
			p2.setLayout(null);
			p2.setSize(400,350);
			p2.setBackground(new Color(255,175,0));
			p2.setBounds(0,110,250,1000);
			p2.setBorder(a2);
			add(p2);
			
			
		
			b1= new JButton("USER REGISTRATION");
			b1.setBackground(Color.BLACK);
			b1.setForeground(new Color(255,165,0));
			b1.setBounds(30,150,170,30);
			b1.setBorder(b);

			
			b2= new JButton("TRAINER REGISTRATION");
			b2.setBackground(Color.BLACK);
			b2.setForeground(new Color(255,165,0));
			b2.setBounds(30,210,170,30);
			b2.setBorder(b);

			b3= new JButton("EQUIPMENT REGISTRATION");
			b3.setBackground(Color.BLACK);
			b3.setForeground(new Color(255,165,0));
			b3.setBounds(30,270,170,30);
			b3.setBorder(b);


			b4= new JButton("PACKAGE UPDATES");
			b4.setBackground(Color.BLACK);
			b4.setForeground(new Color(255,165,0));
			b4.setBounds(30,330,170,30);
			b4.setBorder(b);

			b5= new JButton("DIETPLAN UPDATES");
			b5.setBackground(Color.BLACK);
			b5.setForeground(new Color(255,165,0));
			b5.setBounds(30,390,170,30);
			b5.setBorder(b);

			p2.add(b1);
			p2.add(b2);
			p2.add(b3);
			p2.add(b4);
			p2.add(b5);
			j.add(p2);


			p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(new Color(0,0,0,20));
			p3.setBounds(300,110,1000,550);
			p3.setBorder(a);
			
			//p3.setBounds(30, 20, 520, 350);
	
			

			l4=new JLabel("First Name:");
      		       // l2=new JLabel("Middle Name:");
        		l5=new JLabel("Last Name:");
       		        l6=new JLabel("Mobile No:");
        		l7=new JLabel("Address:");
        		l8=new JLabel("Date of Birth:");
        		l9=new JLabel("Age:");
        		l10=new JLabel("Blood Group:");
			l11=new JLabel("ID :");



			id=++count;
			

			
       		        b12=new JButton("Search");
        		b13=new JButton("Update");


       			 t2=new JTextField();
       			// t2=new JTextField();
      		         t3=new JTextField();
        		 t4=new JTextField("+91 ");
      		         t5=new JTextField();
       			 t6=new JTextField();
       			 t7=new JTextField();
       			 t9=new JTextField();
			 t1=new JtextFeild();

			
			



		
			   l4.setFont(new Font("Times New Roman",Font.BOLD,20));
     	 		   //l2.setFont(new Font("Times New Roman",Font.BOLD,20));
     			   l5.setFont(new Font("Times New Roman",Font.BOLD,20));
     			   l6.setFont(new Font("Times New Roman",Font.BOLD,20));
     	 		   l7.setFont(new Font("Times New Roman",Font.BOLD,20));
     	                   l8.setFont(new Font("Times New Roman",Font.BOLD,20));
                           l9.setFont(new Font("Times New Roman",Font.BOLD,20));
                           l10.setFont(new Font("Times New Roman",Font.BOLD,20));

      
        b11.setFont(new Font("Times New Roman",Font.BOLD,20));
        b12.setFont(new Font("Times New Roman",Font.BOLD,20));
        b13.setFont(new Font("Times New Roman",Font.BOLD,20));

        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        t2.setFont(new Font("Times New Roman",Font.BOLD,20));
      
        t3.setFont(new Font("Times New Roman",Font.BOLD,20));
        t4.setFont(new Font("Times New Roman",Font.BOLD,20));
        t5.setFont(new Font("Times New Roman",Font.BOLD,20));
        t6.setFont(new Font("Times New Roman",Font.BOLD,20));
        t7.setFont(new Font("Times New Roman",Font.BOLD,20));
        t9.setFont(new Font("Times New Roman",Font.BOLD,20)); 
        cb1.setFont(new Font("Times New Roman",Font.BOLD,20));

	l11.setBounds(50,50,150,50);
        l4.setBounds(50,100,150,50);
        l5.setBounds(400,100,180,50);
        //l3.setBounds(730,100,150,50);
        l6.setBounds(50,160,200,50);
        l7.setBounds(50,220,150,50);
        l8.setBounds(50,280,200,50);
        l9.setBounds(350,280,100,50);
        l10.setBounds(630,280,150,50);

	b11.setBounds(160,400,100,50);
        b12.setBounds(660,400,100,50);
        b13.setBounds(380,400,100,50);

	t1.setBounds(150,80,200,35);
        t2.setBounds(150,110,200,35);
        t3.setBounds(500,110,200,35);
      //  t3.setBounds(870,110,200,35);
        t4.setBounds(150,170,280,35);
        t5.setBounds(150,230,500,35);
        t6.setBounds(180,290,150,35);
        t7.setBounds(400,290,150,35);
        
        t9.setBounds(750,290,150,35);

	l4.setForeground(Color.WHITE);
	//l2.setForeground(Color.WHITE);
	l5.setForeground(Color.WHITE);
	l6.setForeground(Color.WHITE);
	l7.setForeground(Color.WHITE);
	l8.setForeground(Color.WHITE);
	l9.setForeground(Color.WHITE);
	l10.setForeground(Color.WHITE);
	//cb1.setForeground(Color.WHITE);
		
			t1.setForeground(Color.ORANGE);
			t2.setForeground(Color.ORANGE);
			t3.setForeground(Color.ORANGE);
			t4.setForeground(Color.ORANGE);
			t5.setForeground(Color.ORANGE);
			t6.setForeground(Color.ORANGE);
			t7.setForeground(Color.ORANGE);
			t9.setForeground(Color.ORANGE);

		
			b12.setForeground(Color.ORANGE);
			b13.setForeground(Color.ORANGE);

			t1.setBackground(Color.BLACK);
			t2.setBackground(Color.BLACK);
			t3.setBackground(Color.BLACK);
			t4.setBackground(Color.BLACK);
			t5.setBackground(Color.BLACK);
			t6.setBackground(Color.BLACK);
			t7.setBackground(Color.BLACK);
			t9.setBackground(Color.BLACK);


			
			b12.setBackground(Color.BLACK);
			b13.setBackground(Color.BLACK);

			b11.setBorder(b);
			b12.setBorder(b);
			b13.setBorder(b);
        
       			//cb1.setBackground(Color.BLACK);

      


          p3.add(l4);
         // p3.add(l2);
          p3.add(l5);
          p3.add(l6);
          p3.add(l7);
          p3.add(l8);
          p3.add(l9);
          p3.add(l10);
	 p3.add(l11);

	 
           p3.add(b12);
           p3.add(b13);

         p3.add(t1);
         p3.add(t2);
         p3.add(t3);
         p3.add(t4);
         p3.add(t5);
         p3.add(t6);
         p3.add(t7);
	 p3.add(t9);
      
        
        
	j.add(p3);
     
	
	
	

	b12.addActionListener(this);
	b13.addActionListener(this);
		
					
	
				
			

				
}

 public void actionPerformed(ActionEvent ae)
          {
			String s=ae.getActionCommand();
			
			

			if(s.equals("Search"))
			{	
				 String a,b,c,d,e,f,g,h,i,j,k,l,y;

		try{	
                              
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

					Connection co=DriverManager.getConnection("jdbc:odbc:gym");
					
					y=t14.getText();
						
					PreparedStatement ps=co.prepareStatement("select * from tdd where Id=? ");
								
					ps.setString(1,y);
						
					ResultSet re=ps.executeQuery();
					int rowCount = re.getRow();

					re.next();
					{
						 a=re.getString(2);
						t1.setText(a);
 						 b=re.getString(3);
						t3.setText(b);
 						 c=re.getString(4);
						t4.setText(c);
 						 d=re.getString(5);
						t5.setText(d);
 						 e=re.getString(6);
						t6.setText(e);
 						 f=re.getString(7);
						t7.setText(f);
 						 g=re.getString(8);
						t9.setText(g);
 						 h=re.getString(9);
						t10.setText(h);
 						 i=re.getString(10);
						t11.setText(i);
 						 j=re.getString(11);
						t12.setText(j);
 						 k=re.getString(12);
						t13.setText(k);
 						 		

					}

		     ps.executeUpdate();

		JOptionPane.showMessageDialog(this,"Inserted");

				 
		    ps.close();
		    co.close();
				}catch(Exception z){JOptionPane.showMessageDialog(this,"Value Found");}
					
			      	



			}

			

			if(s.equals("Update"))
			{
							
			      String a,b,c,d,e,f,g,h,i,j,k,l,y;
			      int i1;


                                try{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

					Connection co=DriverManager.getConnection("jdbc:odbc:gym");

					a=t1.getText();
	  				b=t3.getText();
					c=t4.getText();
					d=t5.getText();
					e=t6.getText();
					f=t7.getText();
					g=t9.getText();
					h=t10.getText();
					i=t11.getText();
					j=t12.getText();
					k=t13.getText();
					y=t14.getText();




					PreparedStatement ps=co.prepareStatement("update cust set Fn=?,Ln=?,Mn=?,ad=?,dob=?,age=?,bg=?,ht=?,wt=?,bt=?,pk=? where Id=?");

		     ps.setString(1,a);		
		     ps.setString(2,b);
		     ps.setString(3,c);
		     ps.setString(4,d);
		     ps.setString(5,e);
		     ps.setString(6,f);
		     ps.setString(7,g);
		     ps.setString(8,h);
		     ps.setString(9,i);
		     ps.setString(10,j);
		     ps.setString(11,k);
		     ps.setString(12,y);

		     ps.executeUpdate();

		JOptionPane.showMessageDialog(this,"Value Updated");

				  t1.setText("  ");
	  			  t3.setText("  ");
				  t4.setText("+91 ");
				  t5.setText("  ");
				  t6.setText("  ");
				  t7.setText("  ");

				  t9.setText("  ");
				  t10.setText("  ");
				  t11.setText("  ");
				  t12.setText("  ");
				  t13.setText("  ");

		    ps.close();
		    co.close();
				}catch(Exception z){}
			     
			}
}

public static void main(String args[])
{
	  tup u= new tup();
	
	
}

}


