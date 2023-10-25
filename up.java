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

public class up extends JFrame implements ActionListener
{
 	
	
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	 int x = 500;
	Timer timer;
	JButton b2,b3,b4,b5,b6,b7,b8,b9;
    	JComboBox cb1;
   	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    	JTextField t1,t2,t3,t4,t5,t6,t7,t9,t10,t11,t12,t13,t14;
	int count=0;
	int id;

		JFrame j = new JFrame("Frame in Java Swing");
		  
		
			


	public up()
	{
		 j.getContentPane();
	 	 j.setLayout(null);
 	  	 j.setVisible(true);
		 j.setSize(900,900);
		// j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       		  j.setTitle("Customer Registration");
		
		 j.setContentPane(new JLabel(new ImageIcon("bh.jpg")));
		
		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f1=new Font("Times New Roman",Font.BOLD,20);
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

			TitledBorder a=new TitledBorder(new LineBorder(Color.white, 2), "Update Customer", TitledBorder.LEADING,TitledBorder.TOP,null,new Color(130,0,250));
			 a.setTitleFont(new Font("Modern No. 20", Font.PLAIN, 30));
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
        		l15=new JLabel("ID :");


			
			

			    
       		        b2=new JButton("Search");
        		b3=new JButton("Update");


       			
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
                t14=new JTextField();

			
			



		
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
                    l15.setFont(new Font("Times New Roman",Font.BOLD,30));


      
        
        b2.setFont(new Font("Times New Roman",Font.BOLD,30));
        b3.setFont(new Font("Times New Roman",Font.BOLD,30));

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

        t14.setFont(new Font("Times New Roman",Font.BOLD,30)); 
        cb1.setFont(new Font("Times New Roman",Font.BOLD,30));

        l15.setBounds(50,100,150,50);
        l4.setBounds(50,200,200,50);
        l5.setBounds(600,200,180,50);
        //l3.setBounds(730,100,150,50);
        l6.setBounds(50,280,200,50);
        l7.setBounds(50,350,150,50);
        l8.setBounds(50,410,200,50);
        l9.setBounds(420,410,100,50);
        l10.setBounds(690,410,190,50);
        l11.setBounds(50,500,150,50);
        l12.setBounds(390,500,200,50);
        l13.setBounds(690,500,100,50);
        l14.setBounds(50,600,150,50);
    	
        b2.setBounds(660,700,150,50);
        b3.setBounds(220,700,150,50);

        t14.setBounds(150,110,200,35);
        t1.setBounds(210,210,200,35);
        t3.setBounds(750,210,200,35);
      //  t3.setBounds(870,110,200,35);
        t4.setBounds(200,290,280,35);
        t5.setBounds(200,360,500,35);
        t6.setBounds(230,420,150,35);
        t7.setBounds(500,420,150,35);
        t9.setBounds(870,420,150,35);

        t10.setBounds(200,510,150,35);
        t11.setBounds(490,510,150,35);
        t12.setBounds(800,510,150,35);
        t13.setBounds(180,620,150,35);

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
	l15.setForeground(Color.CYAN);
	//cb1.setForeground(Color.CYAN);
		
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
			t14.setForeground(new Color(130,0,250));
			
			b2.setForeground(new Color(130,0,250));
			b3.setForeground(new Color(130,0,250));

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
			t14.setBackground(Color.WHITE);

			
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);

			
			b2.setBorder(b);
			b3.setBorder(b);
        
       			//cb1.setBackground(Color.WHITE);

      


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
          p3.add(l15);

	  
           p3.add(b2);
           p3.add(b3);

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
      
   	    p3.add(t14);     
        
	j.add(p3);
     


	
	b2.addActionListener(this);
	b3.addActionListener(this);
	
				
			

				
}

 public void actionPerformed(ActionEvent ae)
          {
			String s=ae.getActionCommand();
			
			

			if(s.equals("Search"))
			{	
				 String a,b,c,d,e,f,g,h,i,j,k,l,y;

		try{	
                              
					Class.forName("com.mysql.jdbc.Driver");

					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
					
					y=t14.getText();
						
					PreparedStatement ps=co.prepareStatement("select * from cdd where Id=? ");
								
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
				}catch(Exception z){JOptionPane.showMessageDialog(this,"value found");}
					
			      	



			}

			

			if(s.equals("Update"))
			{
							
			      String a,b,c,d,e,f,g,h,i,j,k,l,y;
			      int i1;


                                try{
					Class.forName("com.mysql.jdbc.Driver");

					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");

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




					PreparedStatement ps=co.prepareStatement("update cdd set Fn=?,Ln=?,Mn=?,ad=?,dob=?,age=?,bg=?,ht=?,wt=?,bt=?,pk=? where Id=?");

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
	  up u= new up();
	
	
}

}


