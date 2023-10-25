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

public class customer_reg extends JFrame implements ActionListener
{
 	
	
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	 int x = 500;
	Timer timer;
	JButton b2,b3,b4,b5,b6,b7,b8,b9,b12,b13,b1;
    	JComboBox cb1;
   	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    	JTextField t1,t2,t3,t4,t5,t6,t7,t9,t10,t11,t12,t13;
	int count=0;
	int id;
 int p;

		JFrame j = new JFrame("Frame in Java Swing");
		  
		
			


	public customer_reg()
	{
		 j.getContentPane();
	 	 j.setLayout(null);
 	  	 j.setVisible(true);
		 j.setSize(900,900);
		
       		  j.setTitle("Customer Registration");
		
		 j.setContentPane(new JLabel(new ImageIcon("bh.jpg")));
		
		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f1=new Font("Times New Roman",Font.BOLD,30);
	  	//Font f1=new Font("Lucida Calligraphy",Font.Bold,20);

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

			l1.setBounds(10,23,120,80);
			l2.setBounds(130,23,340,80);
			l3.setBounds(440,23,480,80);


			p1.add(l1);
			p1.add(l2);
			p1.add(l3);


			Border b = BorderFactory.createLineBorder(Color.BLACK, 1);
			Border a2 = BorderFactory.createLineBorder(Color.BLACK, 3);
			Border a1 = BorderFactory.createLineBorder(Color.BLACK, 2);

			String bg[]={"A+","A-","B+","B-","O+","O-","AB+","AB-"};
    			
			 cb1=new JComboBox(bg);

			TitledBorder a=new TitledBorder(new LineBorder(Color.white, 2), "Customer Registration", TitledBorder.LEADING,TitledBorder.TOP,null,new Color(130,0,250));
			 a.setTitleFont(new Font("Modern No. 20", Font.PLAIN, 30));

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
			b2.setBounds(30,230,170,40);
			b2.setBorder(b);

			b3= new JButton("EQUIPMENT REGISTRATION");
			b3.setBackground(new Color(255,255,250));
			b3.setForeground(new Color(130,0,250));
			b3.setBounds(30,310,170,40);
			b3.setBorder(b);


			b4= new JButton("PACKAGE UPDATES");
			b4.setBackground(new Color(255,255,250));
			b4.setForeground(new Color(130,0,250));
			b4.setBounds(30,390,170,40);
			b4.setBorder(b);

			b5= new JButton("DIETPLAN UPDATES");
			b5.setBackground(new Color(255,255,250));
			b5.setForeground(new Color(130,0,250));
			b5.setBounds(30,470,170,40);
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
			p3.setBounds(350,170,1300,780);
			p3.setBorder(a);
			
			//p3.setBounds(30, 20, 520, 350);
	
			id=++count;

			l4=new JLabel("First Name:");
      		     
        		l5=new JLabel("Last Name:");
       		        l6=new JLabel("Mobile No:");
        		l7=new JLabel("Address:");
        		l8=new JLabel("Date of Birth:");
        		l9=new JLabel("Age:");
        		l10=new JLabel("Blood Group:");
        		l11=new JLabel("Height:");
        		l12=new JLabel("Weight:");
        		l13=new JLabel("Batch:");
        		l14=new JLabel("Package:");


			
			

			    
       		        b12=new JButton("Clear");
        		b13=new JButton("Submit");


       			
			   t1=new JTextField();
       		 	   t3=new JTextField();
        		   t4=new JTextField("+91 ");
      		  	  t5=new JTextField();
       			t6=new JTextField();
       			t7=new JTextField();
       			t9=new JTextField();
       			t10=new JTextField();
       			t11=new JTextField();
       			t12=new JTextField();
       			t13=new JTextField();
                

			
			



		
			        l4.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 		   //l2.setFont(new Font("Times New Roman",Font.BOLD,30));
     			   l5.setFont(new Font("Times New Roman",Font.BOLD,30));
     			   l6.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 		   l7.setFont(new Font("Times New Roman",Font.BOLD,30));
     	            l8.setFont(new Font("Times New Roman",Font.BOLD,30));
                    l9.setFont(new Font("Times New Roman",Font.BOLD,30));
                    l10.setFont(new Font("Times New Roman",Font.BOLD,30));
                    l11.setFont(new Font("Times New Roman",Font.BOLD,30));
                    l12.setFont(new Font("Times New Roman",Font.BOLD,30));
                    l13.setFont(new Font("Times New Roman",Font.BOLD,30));
                    l14.setFont(new Font("Times New Roman",Font.BOLD,30));

      
        
        b12.setFont(new Font("Times New Roman",Font.BOLD,30));
        b13.setFont(new Font("Times New Roman",Font.BOLD,30));

        t1.setFont(new Font("Times New Roman",Font.BOLD,30));
       // t2.setFont(new Font("Times New Roman",Font.BOLD,30));
        t3.setFont(new Font("Times New Roman",Font.BOLD,30));
        t4.setFont(new Font("Times New Roman",Font.BOLD,30));
        t5.setFont(new Font("Times New Roman",Font.BOLD,30));
        t6.setFont(new Font("Times New Roman",Font.BOLD,30));
        t7.setFont(new Font("Times New Roman",Font.BOLD,30));
        t9.setFont(new Font("Times New Roman",Font.BOLD,30)); 
        t10.setFont(new Font("Times New Roman",Font.BOLD,30)); 
        t11.setFont(new Font("Times New Roman",Font.BOLD,30)); 
        t12.setFont(new Font("Times New Roman",Font.BOLD,30)); 
        t13.setFont(new Font("Times New Roman",Font.BOLD,30)); 
        cb1.setFont(new Font("Times New Roman",Font.BOLD,30));

        l4.setBounds(50,100,200,50);
        l5.setBounds(600,100,180,50);
        //l3.setBounds(730,100,150,50);
        l6.setBounds(50,180,200,50);
        l7.setBounds(50,250,150,50);
        l8.setBounds(50,310,200,50);
        l9.setBounds(420,310,100,50);
        l10.setBounds(690,310,190,50);
        l11.setBounds(50,400,150,50);
        l12.setBounds(390,400,200,50);
        l13.setBounds(690,400,100,50);
        l14.setBounds(50,500,150,50);

    	
        b12.setBounds(660,600,150,50);
        b13.setBounds(220,600,150,50);

        t1.setBounds(210,110,200,35);
        t3.setBounds(750,110,200,35);
      //  t3.setBounds(870,110,200,35);
        t4.setBounds(200,190,280,35);
        t5.setBounds(200,260,500,35);
        t6.setBounds(230,320,150,35);
        t7.setBounds(500,320,150,35);
        t9.setBounds(870,320,150,35);

        t10.setBounds(200,410,150,35);
        t11.setBounds(490,410,150,35);
        t12.setBounds(800,410,150,35);
        t13.setBounds(180,510,150,35);

	l4.setForeground(Color.CYAN);
	//l2.setForeground(Color.CYAN);
	l5.setForeground(Color.CYAN);
	l6.setForeground(Color.CYAN);
	l7.setForeground(Color.CYAN);
	l8.setForeground(Color.CYAN);
	l9.setForeground(Color.CYAN);
	l10.setForeground(Color.CYAN);
	l11.setForeground(Color.CYAN);
	l12.setForeground(Color.CYAN);
	l13.setForeground(Color.CYAN);
	l14.setForeground(Color.CYAN);
	//cb1.setForeground(Color.WHITE);
		
			t1.setForeground(new Color(130,0,250));
			t3.setForeground(new Color(130,0,250));
			t4.setForeground(new Color(130,0,250));
			t5.setForeground(new Color(130,0,250));
			t6.setForeground(new Color(130,0,250));
			t7.setForeground(new Color(130,0,250));
			t9.setForeground(new Color(130,0,250));
			t10.setForeground(new Color(130,0,250));
			t11.setForeground(new Color(130,0,250));
			t12.setForeground(new Color(130,0,250));
			t13.setForeground(new Color(130,0,250));

			
			b12.setForeground(new Color(130,0,250));
			b13.setForeground(new Color(130,0,250));

			t1.setBackground(Color.WHITE);
			t3.setBackground(Color.WHITE);
			t4.setBackground(Color.WHITE);
			t5.setBackground(Color.WHITE);
			t6.setBackground(Color.WHITE);
			t7.setBackground(Color.WHITE);
			t9.setBackground(Color.WHITE);
			t10.setBackground(Color.WHITE);
			t11.setBackground(Color.WHITE);
			t12.setBackground(Color.WHITE);
			t13.setBackground(Color.WHITE);


			
			b12.setBackground(Color.WHITE);
			b13.setBackground(Color.WHITE);

			
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
          p3.add(l12);
          p3.add(l13);
          p3.add(l14);

	  
           p3.add(b12);
           p3.add(b13);

         p3.add(t1);
         //p3.add(t2);
         p3.add(t3);
         p3.add(t4);
         p3.add(t5);
         p3.add(t6);
         p3.add(t7);
	    p3.add(t9);
	    p3.add(t10);
	    p3.add(t11);
	    p3.add(t12);
	    p3.add(t13);
      
        
        
	j.add(p3);
     
	
	
	
	b12.addActionListener(this);
	b13.addActionListener(this);
	
				
			

				
}

 public void actionPerformed(ActionEvent ae)
          {
			String s=ae.getActionCommand();
			
			

			if(s.equals("Clear"))
			{
				  t1.setText("  ");
	  			  t3.setText("  ");
				  t4.setText("  ");
				  t5.setText("  ");
				  t6.setText("  ");
				  t7.setText("  ");
				 
				  t9.setText("  ");
				  t10.setText("  ");
				  t11.setText("  ");
				  t12.setText("  ");
				  t13.setText("  ");

			}

			if(s.equals("Submit"))
			{
				
			      String a,b,c,d,e,f,g,h,i,j,k,l,q;
			      int i1;
			    
	   
			   
			    
					q=t13.getText();
	     				if(q.equals("Gold"))
					{
						p=5000;
			
					}
					if(q.equals("Silver"))
					{
						p=3000;
			
					}
					if(q.equals("Platinum"))
					{
						p=7000;
			
					}

                                try{
					Class.forName("com.mysql.jdbc.Driver");
					JOptionPane.showMessageDialog(this,"Driver registerd");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
					JOptionPane.showMessageDialog(this,"connection created");
				
				
                                         
		      			l=String.valueOf(p); 
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
					 




					PreparedStatement ps=co.prepareStatement("insert into cdd(Fn,Ln,Mn,ad,dob,age,bg,ht,wt,bt,pk,pr) values(?,?,?,?,?,?,?,?,?,?,?,?)");

		   
				
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
		 ps.setString(12,l);

		     ps.executeUpdate();
 		
		JOptionPane.showMessageDialog(this,"Inserted");
		
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
				}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}
			}
}

public static void main(String args[])
{
	customer_reg obj = new customer_reg();
	
	
}


}




				


