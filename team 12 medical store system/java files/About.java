import javax.swing.*;
import java.awt.*;

class About extends JFrame
{
	JFrame jf;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;

	About()
	{
		jf=new JFrame();

		jf.setLayout(null);

		l1 = new JLabel("Medical Stock Management System");
		l1.setFont(new Font("Times New Roman",Font.BOLD,35));
		l1.setBounds(200,30,600,40);
		l1.setForeground(Color.blue);
		jf.add(l1);



		l2 = new JLabel("This Project developed by:");
		l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		l2.setBounds(250,150,600,40);
		l2.setForeground(Color.BLACK);
		jf.add(l2);

		l3 = new JLabel("Team 12 nihaas reddy r");
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		l3.setBounds(500,150,400,40);
		l3.setForeground(Color.red);
		jf.add(l3);

		l3 = new JLabel("Feel free to contact me :");
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		l3.setBounds(500,150,400,40);
		l3.setForeground(Color.red);
		jf.add(l3);

		l3 = new JLabel("email : ravulanihaasreddy@gmail.com");
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		l3.setBounds(500,150,400,40);
		l3.setForeground(Color.red);
		jf.add(l3);
		l3 = new JLabel("phone : 9347985885 ");
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		l3.setBounds(500,150,400,40);
		l3.setForeground(Color.red);
		jf.add(l3);

		JLabel feature=new JLabel("About Project");
		feature.setFont(new Font("Times New Roman",Font.BOLD,20));
		feature.setBounds(250,250,400,40);
		feature.setForeground(Color.GRAY);
		jf.add(feature);
		l5 = new JLabel("In this Project we can add details of Medicines, Suppliers.");
		//l5.setFont(new Font("Times New Roman",Font.BOLD,20));
		l5.setForeground(Color.BLACK);
		l5.setBounds(250,300,800,40);
		jf.add(l5);

		l6 = new JLabel("You can also update,delete & search the existing details.");
		//l6.setFont(new Font("Times New Roman",Font.BOLD,20));
		l6.setForeground(Color.BLACK);
		l6.setBounds(250,350,800,40);
		jf.add(l6);

		l7 = new JLabel("It is helpful for stock of Medicine .");
		//l7.setFont(new Font("Times New Roman",Font.BOLD,20));
		l7.setForeground(Color.BLACK);
		l7.setBounds(250,400,800,40);
		jf.add(l7);

        jf.setTitle("About Project");
		jf.setSize(900,700);
		jf.setLocation(20,20);
		jf.setResizable(false);
		jf.getContentPane().setBackground(Color.WHITE);
		jf.setVisible(true);

	}

	public static void main(String args[])
	{
          new About();

	}
}
