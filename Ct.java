import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Graphics;
import java.util.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;

public class Ct extends JFrame implements ActionListener
{
 	
    Container co;	
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	 
	JButton b1,b2,b3,b14;
    JComboBox cb1;
   	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l15,l16,l17;
    JLabel ll1,ll2,ll3,ll4,ll5;
    JTable tbl;
    JTextField t1,t2,t3,t4,t5,t6,t7,t9;
	JScrollPane pane;
	DefaultTableModel model;
	JTextField a11;  
	JButton b11,b12,b13;
   Font f1=new Font("Times New Roman",Font.BOLD,15);
	public Ct()
	{
		 setLayout(new BorderLayout());
        setVisible(true);
        setSize(1280,720);
        setTitle("Customer Delails");
       
        co=getContentPane();
		setContentPane(new JLabel(new ImageIcon("bh.jpg")));
		

		
		Font f=new Font("Papyrus",Font.BOLD,50);
		
	  //	Font f2=new Font("Lucida Calligraphy",Font.Bold,20);

		 
		 
	

			p1=new JPanel();
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
			
			TitledBorder a=new TitledBorder(new LineBorder(Color.white, 2), "-     Customer Details     -", TitledBorder.LEADING,TitledBorder.TOP,null,new Color(130,0,250));
			a.setTitleFont(new Font("Modern No. 20", Font.PLAIN, 30));
			p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(new Color(0,0,0,20));
			p3.setBounds(500,250,1050,700);
			p3.setBorder(a);
			add(p3);


		b11=new JButton("View");
		b12=new JButton("Update");
		b13=new JButton("Delete");
		b14=new JButton("Exit");

		b11.setBackground(new Color(255,255,250));
		b11.setForeground(new Color(130,0,250));
		b12.setBackground(new Color(255,255,250));
		b12.setForeground(new Color(130,0,250));
		b13.setBackground(new Color(255,255,250));
		b13.setForeground(new Color(130,0,250));
		b14.setBackground(new Color(255,255,250));
		b14.setForeground(new Color(130,0,250));

		a11=new JTextField();  
		a11.setForeground(new Color(130,0,250));

		a11.setBounds(100,320, 200,40);  

		b13.setBounds(100,420,200,50);  
		b11.setBounds(100,520,200,50);  
		b12.setBounds(100,620,200,50);
		b14.setBounds(100,720,200,50);

		 
    	
	    //tbl=new JTable(model);

    	

		//p3.add(pane);
			add(a11);
			add(b11);
			add(b12);
			add(b13);
			add(b14);
	
	b11.addActionListener(this);
	b13.addActionListener(this);
	b12.addActionListener(this);
	b14.addActionListener(this);

		
		
}




public void actionPerformed(ActionEvent ae)
          {
			String s=ae.getActionCommand();
			
			
			
			if(s.equals("Delete"))
			{
				
			      String a;
			      int b;
			      
			    
	     

                                try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
				
					a=a11.getText();
					//b=a11.getInt();
					
	  				
					PreparedStatement ps=co.prepareStatement("delete from cdd where Id=?");

		   
		   			 ps.setString(1,a);		
		   
		     			ps.executeUpdate();
 		
					JOptionPane.showMessageDialog(this,"DELETE");
		
				
			  a11.setText("  ");
			
							
				
			  ps.close();
		   
		    co.close();	
			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}


				
}



if(ae.getSource()==b11)
	{


	try{
			Class.forName("com.mysql.jdbc.Driver");
		
				Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");

				

				PreparedStatement ps=co.prepareStatement("select * from cdd");
						
				ResultSet re=ps.executeQuery();

				String Co[]={"ID","UserName","Contact","Address","DOB","Age","BloodGroup","Height","Weight","Batch","Package"};

				 String rs[][]={{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""},
						{"","","","","","","","","","",""}
					      };
			
					tbl=new JTable(rs,Co); 

					JScrollPane jsp=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
					tbl.setFont(f1);
					tbl.setRowHeight(20);
					
					
					tbl.setBackground(Color.white);
					tbl.setForeground(new Color(130,0,250));
				
					
					jsp.setBounds(20,28,1000,600);
					int i=0;

				while(re.next())
			        {
					tbl.setValueAt(re.getString(1),i,0);
					tbl.setValueAt(re.getString(2)+"  "+re.getString(3),i,1);
					tbl.setValueAt(re.getString(4),i,2);
					tbl.setValueAt(re.getString(5),i,3);
					tbl.setValueAt(re.getString(6),i,4);
					tbl.setValueAt(re.getString(7),i,5);
					tbl.setValueAt(re.getString(8),i,6);
					tbl.setValueAt(re.getString(9),i,7);
					tbl.setValueAt(re.getString(10),i,8);
					tbl.setValueAt(re.getString(11),i,9);
					tbl.setValueAt(re.getString(12),i,10);
				
					i++;
					
				}

						ps.close();
						co.close();
					p3.add(jsp);
				
		}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}


		}


	if(ae.getSource()==b12)
	{
			 new up();
	}
	if(ae.getSource()==b14)
	{
			this.dispose();
	}
}

public static void main(String args[])
{
	new Ct();
}




}