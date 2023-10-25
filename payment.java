import java.awt.*;  
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.*;
import javax.swing.border.*;
import java.lang.*;
import java.io.*;
import javax.swing.table.*;
import static java.sql.DriverManager.registerDriver;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.Properties;
public class payment extends JFrame //  implements ActionListener
{
 	
	
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	  JLabel n;
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
       
	 JScrollPane pane;
	DefaultTableModel model;
	   JTable tbl;
	//Font f1=new Font("Times New Roman",Font.BOLD,20);
	public  payment()
	{
		JFrame j = new JFrame("Frame in Java Swing");
		  j.getContentPane();
	 	 j.setLayout(null);
 	  	
		j.setVisible(true);
		 j.setSize(1500,900);
		 j.setContentPane(new JLabel(new ImageIcon("bh.jpg")));
		
		
		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f1=new Font("Times New Roman",Font.BOLD,20);
	  	Font f2=new Font("Papyrus",Font.BOLD,50);
			p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,0,255,70));
			p1.setBounds(0,0,2000,150);
			
			j.add(p1);
			
		

			l1=new JLabel("Gym");
			l2=new JLabel("Management");
			l3=new JLabel("System");

			l1.setFont(f2);
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
		
			TitledBorder a=new TitledBorder(new LineBorder(Color.white, 2), "payment", TitledBorder.LEADING,TitledBorder.TOP,null,new Color(130,0,250));
			 a.setTitleFont(new Font("Modern No. 20", Font.PLAIN, 30));
			
			p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(new Color(0,0,0,20));
			p3.setBounds(500,250,1050,700);
			p3.setBorder(a);
			//p3.setBounds(30, 20, 520, 350);
	
		
			JTabbedPane jtp=new JTabbedPane();


			jtp.add("Customer",new pcu());
			jtp.add("Trainer",new tra());
			jtp.add("Equipment",new  eui());
			jtp.setBounds(10,40,950,650);
			

			

			jtp.setForeground(new Color(130,0,250));
			jtp.setBackground(Color.WHITE);
			p3.add(jtp);

			j.add(p3);




 

}




	





public static void main(String args[])
{
	new  payment();
}

class pcu extends JPanel implements ActionListener
{
	ImageIcon im1,im2;
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTextField t1;
    	 JScrollPane pane,p;
	DefaultTableModel model,model1;
	   JTable tbl;
	 JCheckBox c;
	int d;
	int s,f;
	public   pcu()
	{
		
		 getContentPane();
	 	 setLayout(null);
 	  	
		setVisible(true);
		 setSize(1500,900);
		setBackground(Color.WHITE);

			model=new DefaultTableModel();
	    tbl=new JTable(model);
	     
	  b1=new JButton("Make Payment");
b1.setBounds(480,400,200,40);

		c=new JCheckBox();
    	 	 model.addColumn("User ID");
	    model.addColumn("User Name");
	    //model.addColumn("Last Name");
    	model.addColumn("Contact");
	model.addColumn("Payment");

	   // model.addColumn("Address");
		
		

        pane=new JScrollPane(tbl);
	    pane.setBounds(20,28,900,350);
	    tbl.setForeground(new Color(130,0,250));
	    tbl.setBackground(Color.WHITE);
		 //p=new JScrollPane(b1);
	    //p.setBounds(750,28,250,50);
		add(b1);
	
		b1.addActionListener(this);

		

		add(pane);


		t1=new JTextField();
		t1.setBounds(100,410,150,30);
                  t1.setForeground(Color.WHITE);
	    t1.setBackground(Color.BLACK);
		add(t1);
				
				// tbl.setModel(co.resultSetToTableModel(re);


		try{
			Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");

				

				PreparedStatement ps=co.prepareStatement("select * from cdd");
		
				ResultSet re=ps.executeQuery();
				while(re.next())
			        {
				
						model.addRow(new Object[]{"  "+re.getString(1), "  "+re.getString(2)+"  "+re.getString(3)," "+re.getString(4)," "+re.getString(13)});
						
					
						
							
		
				}
						ps.close();
						co.close();
					
				
					
			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}


		

	}

public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==b1)
		{
			
			int a[];
			
			int b;
			
			String c,e;
			
			
			
		try{


			e=t1.getText();
			//d=Integer.parseInt(e);  
			Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");

				

				PreparedStatement ps=co.prepareStatement("select * from cdd where Id=?");
				
			        ps.setString(1,e);	
				ResultSet re=ps.executeQuery();
				PreparedStatement p1=co.prepareStatement("select * from total ");
				ResultSet r=p1.executeQuery();
			
				
				while(re.next() )
				{ 

							 c= re.getString(13);
							d=Integer.parseInt(c);
							
							
				}
				while(r.next() )
				{ 
						
						 s= r.getInt(1);
							s = s + d;
							f=s;	
				}
							
							PreparedStatement p=co.prepareStatement("insert into total values(?)");
							p.setInt(1,f);
				   		  p.executeUpdate();
				
					
 		
				JOptionPane.showMessageDialog(this,"Inserted");
					
	
		}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}



}

}

}


	class eui extends JPanel implements ActionListener
{
	
	ImageIcon im1,im2;
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
     JTextField t1;
    	 JScrollPane pane,p;
	DefaultTableModel model,model1;
	   JTable tbl;
	 JCheckBox c;
	int d;
	int s,f;
	
	public  eui()
	{
		
		 getContentPane();
	 	 setLayout(null);
 	  	
		setVisible(true);
		 setSize(1500,900);
		setBackground(Color.WHITE);

			model=new DefaultTableModel();
	    tbl=new JTable(model);
	     
	  b1=new JButton("Make Payment");
	   b1.setBounds(480,400,200,40);

		c=new JCheckBox();
    	 	 model.addColumn("User ID");
	         model.addColumn("User Name");
	    //model.addColumn("Last Name");
    	model.addColumn("Contact");
	model.addColumn("Payment");

	   // model.addColumn("Address");
		
		

        pane=new JScrollPane(tbl);
	    pane.setBounds(20,28,900,350);
		 //p=new JScrollPane(b1);
	    //p.setBounds(750,28,250,50);
		add(b1);
	
		b1.addActionListener(this);
 tbl.setForeground(new Color(130,0,250));
	    tbl.setBackground(Color.WHITE);
		

		add(pane);


		t1=new JTextField();
		t1.setBounds(100,410,150,30);
                 t1.setForeground(Color.WHITE);
	    t1.setBackground(Color.BLACK);
		add(t1);
				
				// tbl.setModel(co.resultSetToTableModel(re);


		try{
			Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");

				

				PreparedStatement ps=co.prepareStatement("select * from ei");
		
				ResultSet re=ps.executeQuery();
				while(re.next())
			        {
				
						model.addRow(new Object[]{"  "+re.getString(1), "  "+re.getString(2)," "+re.getString(4)," "+re.getString(6)});
						
					
						
							
		
				}
						ps.close();
						co.close();
					
				
					
			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}




	}
public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==b1)
		{
			
			int a[];
			
			int b;
			
			String c,e;
			
			
			
		try{


			e=t1.getText();
			//d=Integer.parseInt(e);  
			Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");

				

				PreparedStatement ps=co.prepareStatement("select * from ei where Id=?");
				
			        ps.setString(1,e);	
				ResultSet re=ps.executeQuery();
				PreparedStatement p1=co.prepareStatement("select * from euitotal ");
				ResultSet r=p1.executeQuery();
			
				
				while(re.next() )
				{ 

							 c= re.getString(6);
							d=Integer.parseInt(c);
							
							
				}
				while(r.next() )
				{
						
						 s= r.getInt(1);
							s = s + d;
							f=s;	
				}
							
							PreparedStatement p=co.prepareStatement("insert into euitotal values(?)");
							p.setInt(1,f);
				   		  p.executeUpdate();
				
					
 		
				JOptionPane.showMessageDialog(this,"Inserted");
					
	
		}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}



	}
		
}

}	
class tra extends JPanel implements ActionListener
{
	ImageIcon im1,im2;
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
    
	JTextField t1;
    	 JScrollPane pane,p;
	DefaultTableModel model,model1;
	   JTable tbl;
	 JCheckBox c;
	int d;
	int s,f;
	public   tra()
	{
		
		 getContentPane();
	 	 setLayout(null);
 	  	
		setVisible(true);
		 setSize(1500,900);
		setBackground(Color.WHITE);
	


			model=new DefaultTableModel();
	                tbl=new JTable(model);
	     
			  b2=new JButton("Make Payment");
		    	  b2.setBounds(480,400,200,40);

		c=new JCheckBox();
    	 	 model.addColumn("User ID");
	    model.addColumn("User Name");
	    //model.addColumn("Last Name");
    	model.addColumn("Contact");
	model.addColumn("Salary");

	   // model.addColumn("Address");
		
		

        pane=new JScrollPane(tbl);
	    pane.setBounds(20,28,900,350);
		 //p=new JScrollPane(b1);
	    //p.setBounds(750,28,250,50);
		add(b2);
	
		b2.addActionListener(this);

		 tbl.setForeground(new Color(130,0,250));
	    tbl.setBackground(Color.WHITE);

		add(pane);


		t1=new JTextField();
		t1.setBounds(100,410,150,30);
                 t1.setForeground(Color.WHITE);
	    t1.setBackground(Color.BLACK);
		add(t1);
				
				// tbl.setModel(co.resultSetToTableModel(re);


		try{
			Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
				

				PreparedStatement ps=co.prepareStatement("select * from tdd");
		

				ResultSet re=ps.executeQuery();
				while(re.next())
			        {
				
						model.addRow(new Object[]{"  "+re.getString(1), "  "+re.getString(2)+"  "+re.getString(3)," "+re.getString(4)," "+re.getString(9)});
						
					
						
							
		
				}
						ps.close();
						co.close();
					
				
					
			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}


		

	}
public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==b2)
		{
			
			int a[];
			
			int b;
			
			String c,e;
			
			
			
		try{


			e=t1.getText();
			//d=Integer.parseInt(e);  
			Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");

				

				PreparedStatement ps=co.prepareStatement("select * from tdd where Id=?");
				
			        ps.setString(1,e);	
				ResultSet re=ps.executeQuery();
				PreparedStatement p1=co.prepareStatement("select * from tratotal ");
				ResultSet r=p1.executeQuery();
			
				
				while(re.next() )
				{ 

							 c= re.getString(9);
							d=Integer.parseInt(c);
							
							
				}
				while(r.next() )
				{ 
						
						 s= r.getInt(1);
							s = s + d;
							f=s;	
				}
							
							PreparedStatement p=co.prepareStatement("insert into tratotal values(?)");
							p.setInt(1,f);
				   		  p.executeUpdate();
				
					
 		
				JOptionPane.showMessageDialog(this,"Inserted");
					
	
		}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}



	}
		
}

  }	
}
