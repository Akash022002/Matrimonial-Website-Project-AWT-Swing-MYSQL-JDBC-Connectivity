import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class RegisterPage {

	public JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	
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
					RegisterPage window = new RegisterPage();
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
	public RegisterPage() {
		try {
			connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialize();
	}

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
		frame.getContentPane().setBackground(new Color(255, 204, 204));
		frame.getContentPane().setForeground(new Color(204, 0, 204));
		frame.setBounds(100, 100, 620, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Free");
		lblNewLabel.setForeground(new Color(204, 0, 153));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(148, 34, 257, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Profile Created By*");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(52, 104, 210, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(286, 102, 222, 40);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Gender*");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(52, 152, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBackground(new Color(255, 204, 204));
		r1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		r1.setBounds(284, 162, 103, 21);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBackground(new Color(255, 204, 204));
		r2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		r2.setBounds(405, 162, 103, 21);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" Matrial Status*");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1.setBounds(52, 200, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 15));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select Your Matrial Status", "Single", "Married", "Divorce"}));
		c1.setBounds(286, 198, 210, 40);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" Cast*");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1.setBounds(52, 248, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		t2 = new JTextField();
		t2.setBounds(286, 248, 210, 38);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Sub- Cast");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1_1.setBounds(52, 296, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(286, 296, 210, 38);
		frame.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Mother Tongue");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(52, 344, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select Your Mother Tounge", "Marathi", "English", "Gujrati"}));
		c2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 15));
		c2.setBounds(286, 344, 210, 40);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Mobile Number*");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(52, 404, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1_1_1_2.setBounds(52, 452, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_3 = new JLabel("Password");
		lblNewLabel_1_1_1_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1_1_1_3.setBounds(52, 500, 210, 38);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1_3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(286, 404, 210, 38);
		frame.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(286, 452, 210, 38);
		frame.getContentPane().add(t5);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(286, 500, 210, 38);
		frame.getContentPane().add(t6);
		
		JButton btnNewButton = new JButton("Register Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for add the new details means the register new guest
				try 
				{
					String name,cast,mobile_number,email,password;
					String gender;
					if(r1.isSelected())
					{
						gender = "Male";
					}
					else if(r1.isSelected())
					{
						gender = "Female";
					}
					String matrial_status = c1.getSelectedItem().toString();
					String mother_tongue = c2.getSelectedItem().toString();
					name = t1.getText();
					//Matrial_status = c1.getText();
					cast = t2.getText();
					mobile_number = t4.getText();
					email = t5.getText();
					password = t6.getText();
					String query = "insert into register(name,matrial_status,cast,mobile_number,email,password) values(?,?,?,?,?,?)";
					pst = con.prepareStatement(query);
					pst.setString(1, name);
					pst.setString(2, matrial_status);
					pst.setString(3, cast);
					pst.setString(4, mobile_number);
					pst.setString(5, email);
					pst.setString(6, password);
					int k = pst.executeUpdate();
					if(k==1) {
						JOptionPane.showMessageDialog(null, "Data inserted Sucessfully .....");
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
						t6.setText("");
						MatriLogin m1 = new MatriLogin();
						m1.frame.setVisible(true);
						frame.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Failed to insert data .....");
					}
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		btnNewButton.setBackground(new Color(204, 102, 255));
		btnNewButton.setForeground(new Color(204, 0, 51));
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 22));
		btnNewButton.setBounds(351, 548, 157, 46);
		frame.getContentPane().add(btnNewButton);
	}
}
