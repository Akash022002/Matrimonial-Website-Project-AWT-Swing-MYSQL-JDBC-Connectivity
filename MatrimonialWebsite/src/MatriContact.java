import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class MatriContact {

	public JFrame frame;
	private JTextField t1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	PreparedStatement pst;
	Connection con;
	ResultSet rs;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatriContact window = new MatriContact();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MatriContact() {
		try {
			connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}
	//code for do the connection of the front-end with the database
	public void connect() throws Exception
	{
		String user,pass,url;
		url = "jdbc:mysql://localhost:3306/matrimony";
		user = "root";
		pass = "Akash@2002";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,user,pass);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 51, 102));
		frame.setBackground(new Color(255, 51, 204));
		frame.setBounds(100, 100, 1067, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		t1.setBounds(575, 59, 311, 50);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for add the email for check of the candidate data
				try 
				{
					String email;
					email = t1.getText();
					String query = "insert into enquiry values(?)";
					pst = con.prepareStatement(query);
					pst.setString(1, email);
					int k = pst.executeUpdate();
					if(k==1) {
						JOptionPane.showMessageDialog(null, "Data inserted Sucessfully .....");
						t1.setText("");
						MainPage p1 = new MainPage();
						p1.frame.setVisible(true);
						frame.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Enter valid email id .....");
					}
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		btnNewButton.setBackground(new Color(204, 51, 255));
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 24));
		btnNewButton.setBounds(899, 57, 115, 52);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Enter your email id");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(575, 25, 311, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NewsLetters");
		lblNewLabel_1.setForeground(new Color(0, 51, 0));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(37, 30, 244, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sign Up for Regular updates and Newsletter");
		lblNewLabel_2.setForeground(new Color(255, 51, 102));
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(45, 94, 477, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(204, 255, 255));
		textField_1.setBounds(62, 147, 936, 4);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Quick Links");
		lblNewLabel_3.setForeground(new Color(102, 51, 0));
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(497, 203, 178, 43);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("About Us ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for redirect to the About us page of the website
				MatriAbout m1 = new MatriAbout();
				m1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 51, 102));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBounds(496, 263, 179, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Services");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for redirect to the service page of the webiste
				MatriServices s1 = new MatriServices();
				s1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1_1.setBackground(new Color(255, 51, 102));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_1.setBounds(497, 305, 179, 32);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Gallery");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for redirect to the gallery page of the website
				MatriGallery g1 = new MatriGallery();
				g1.frame.setVisible(true);
				frame.setVisible(false);
				System.out.println("Redirect to the Gallery page of the website.............");
			}
		});
		btnNewButton_1_2.setBackground(new Color(255, 51, 102));
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_2.setBounds(497, 347, 179, 32);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Contact Us");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for the redirect to the same page of that website
				MatriContact c1 = new MatriContact();
				c1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1_3.setBackground(new Color(255, 51, 102));
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1_3.setBounds(497, 389, 179, 32);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\download__5___1_-removebg-preview.png"));
		lblNewLabel_4.setBounds(714, 252, 48, 52);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("+91 7769815791");
		lblNewLabel_5.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_5.setForeground(new Color(51, 0, 102));
		lblNewLabel_5.setBounds(792, 263, 206, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\download__4___1_-removebg-preview.png"));
		lblNewLabel_4_1.setBounds(724, 305, 48, 52);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6 = new JLabel("SN 35-3 Vitthalwadi Akurdi,");
		lblNewLabel_6.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6.setForeground(new Color(51, 0, 102));
		lblNewLabel_6.setBounds(782, 317, 232, 40);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Pune, 411035");
		lblNewLabel_6_1.setForeground(new Color(51, 0, 102));
		lblNewLabel_6_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6_1.setBounds(782, 363, 232, 40);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("near medplus medical, Akurdi");
		lblNewLabel_6_2.setForeground(new Color(51, 0, 102));
		lblNewLabel_6_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6_2.setBounds(782, 339, 232, 40);
		frame.getContentPane().add(lblNewLabel_6_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(204, 255, 255));
		textField_2.setBounds(62, 490, 936, 4);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_7 = new JLabel("WEB ACCESSIBILTY");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(86, 504, 140, 23);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 504, 2, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(414, 504, 2, 21);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_7_1 = new JLabel("PRIVACY STATEMENT");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7_1.setBounds(255, 504, 149, 23);
		frame.getContentPane().add(lblNewLabel_7_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(561, 505, 2, 21);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\download__2_-removebg-preview__1_-removebg-preview.png"));
		lblNewLabel_9.setBounds(37, 203, 311, 259);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_7_2 = new JLabel("TERM OF USE");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7_2.setBounds(426, 504, 126, 23);
		frame.getContentPane().add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("CONTACT US");
		lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_1.setForeground(Color.WHITE);
		lblNewLabel_7_2_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7_2_1.setBounds(564, 504, 126, 23);
		frame.getContentPane().add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_7_2_2 = new JLabel("@2023 MILAN All rights reserved");
		lblNewLabel_7_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2_2.setForeground(Color.WHITE);
		lblNewLabel_7_2_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7_2_2.setBounds(737, 504, 261, 23);
		frame.getContentPane().add(lblNewLabel_7_2_2);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\images (5) (1).jpg"));
		lblNewLabel_8.setBounds(0, 0, 1053, 553);
		frame.getContentPane().add(lblNewLabel_8);
		
	}
}
