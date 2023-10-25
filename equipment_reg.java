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
import java.util.Calendar;  

public class equipment_reg extends JFrame implements ActionListener
{
 	
	
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	 int x = 500;
	int count=0;
	int id;
	Timer timer;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b12,b13;
    	JComboBox cb1;
   	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12,l15,l16,l17;
    	JTextField t1,t2,t3,t4,t5,t6,t7;

		JFrame j = new JFrame("Frame in Java Swing");
		  
		Calendar cal ;
			


	public equipment_reg()
	{
		 j.getContentPane();
	 	 j.setLayout(null);
 	  	 j.setVisible(true);
		 j.setSize(900,900);
		// j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 j.setContentPane(new JLabel(new ImageIcon("bh.jpg")));
		
		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f1=new Font("Times New Roman",Font.BOLD,20);
	  

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

			TitledBorder a=new TitledBorder(new LineBorder(Color.white, 2), "Equipment Registration", TitledBorder.LEADING,TitledBorder.TOP,null,new Color(130,0,250));
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
			
		
			 cal = (Calendar) Calendar.getInstance();  
			

			    l4=new JLabel("Equipment Name:");
      		    l6=new JLabel("Quantity: ");
        		l7=new JLabel("Seller: ");
        		l8=new JLabel("Date: ");
        		l9=new JLabel("Price:");
        		


			
			

			    b11=new JButton("Cancel");
       		            b12=new JButton("Clear");
        	       	b13=new JButton("Submit");


       			t1=new JTextField();
        		t4=new JTextField();
      		        t5=new JTextField();
       			t6=new JTextField();
			t7=new JTextField();
       			

			
			 
			id=++count;


		
			    l4.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 	    l6.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 		l7.setFont(new Font("Times New Roman",Font.BOLD,30));
     	        l8.setFont(new Font("Times New Roman",Font.BOLD,30));
                l9.setFont(new Font("Times New Roman",Font.BOLD,30));
                        

      
        b11.setFont(new Font("Times New Roman",Font.BOLD,30));
        b12.setFont(new Font("Times New Roman",Font.BOLD,30));
        b13.setFont(new Font("Times New Roman",Font.BOLD,30));

        t1.setFont(new Font("Times New Roman",Font.BOLD,30));
        t4.setFont(new Font("Times New Roman",Font.BOLD,30));
        t5.setFont(new Font("Times New Roman",Font.BOLD,30));
        t6.setFont(new Font("Times New Roman",Font.BOLD,30));
        cb1.setFont(new Font("Times New Roman",Font.BOLD,30));

        l4.setBounds(50,150,250,50);
        l6.setBounds(50,240,200,50);
        l7.setBounds(50,330,150,50);
        l8.setBounds(50,420,200,50);
        l9.setBounds(350,420,100,50);


	b11.setBounds(160,600,150,50);
        b12.setBounds(660,600,150,50);
        b13.setBounds(380,600,150,50);

        t1.setBounds(320,160,350,35);
        t4.setBounds(200,250,80,35);
        t5.setBounds(150,340,500,35);
        t6.setBounds(150,430,110,35);
	t7.setBounds(450,430,110,35);
     
	l4.setForeground(Color.CYAN);

	l6.setForeground(Color.CYAN);
	l7.setForeground(Color.CYAN);
	l8.setForeground(Color.CYAN);
	l9.setForeground(Color.CYAN);
	
		
			t1.setForeground(new Color(130,0,250));
			
			t4.setForeground(new Color(130,0,250));
			t5.setForeground(new Color(130,0,250));
			t6.setForeground(new Color(130,0,250));
			t7.setForeground(new Color(130,0,250));
			

			b11.setForeground(new Color(130,0,250));
			b12.setForeground(new Color(130,0,250));
			b13.setForeground(new Color(130,0,250));

			t1.setBackground(Color.WHITE);
		
			t4.setBackground(Color.WHITE);
			t5.setBackground(Color.WHITE);
			t6.setBackground(Color.WHITE);
			t7.setBackground(Color.WHITE);
			


			b11.setBackground(Color.WHITE);
			b12.setBackground(Color.WHITE);
			b13.setBackground(Color.WHITE);

			b11.setBorder(b);
			b12.setBorder(b);
			b13.setBorder(b);
        
       			

      


          p3.add(l4);
          p3.add(l6);
          p3.add(l7);
          p3.add(l8);
          p3.add(l9);
       
	    p3.add(b11);
        p3.add(b12);
        p3.add(b13);

         p3.add(t1);
         p3.add(t4);
         p3.add(t5);
         p3.add(t6);
	p3.add(t7);
       
        
        
	j.add(p3);
     
	
	
	
	
				
			b12.addActionListener(this);
			b13.addActionListener(this);

				
}

	public void actionPerformed(ActionEvent ae)
	{
			
		
			String s=ae.getActionCommand();
					if(ae.getSource()==b13)
			  	 {     
					 String a,b,c,d,e,f,g,h,i,j,k,l;
			     		 int i1;
			    
	     

                                try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
				
					
						
					
                                         
		      			
					a=t1.getText();
	  				
					c=t4.getText();
					d=t5.getText();
					e=t6.getText();
					f=t7.getText();
					
					




					PreparedStatement ps=co.prepareStatement("insert into ei(En,qn,Se,dt,pr) values(?,?,?,?,?)");

			
		     ps.setString(1,a);		
		   
		     ps.setString(2,c);
		     ps.setString(3,d);
		     ps.setString(4,e);
		     ps.setString(5,f);
		    
		    

		     ps.executeUpdate();
 		
		JOptionPane.showMessageDialog(this,"Inserted");
		
				  t1.setText("  ");
	  			  t4.setText("  ");
				 
				  t5.setText("  ");
				  t6.setText("  ");
				  t7.setText("  ");
				  
				 
				
		
		    ps.close();
		    co.close();
				}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}
}
					if(ae.getSource()==b12)
			  	 {   
					  t1.setText("  ");
	  				  t4.setText("  ");
					 
					  t5.setText("  ");
					  t6.setText("  ");
					  t7.setText("  ");
					 
}




}

public static void main(String args[])
{
	equipment_reg obj = new equipment_reg();
	
	
}


}




				


