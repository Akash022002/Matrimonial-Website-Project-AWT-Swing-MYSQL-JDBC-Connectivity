import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPasswordField;

public class MatriLogin {

	public JFrame frame;
	private JTextField t1;
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JPasswordField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatriLogin window = new MatriLogin();
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
	public MatriLogin() {
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
		frame.getContentPane().setBackground(new Color(255, 204, 255));
		frame.setBounds(100, 100, 615, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Now");
		lblNewLabel.setForeground(new Color(204, 51, 0));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 57, 296, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(110, 175, 345, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(110, 214, 345, 39);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(110, 275, 345, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember Me");
		chckbxNewCheckBox.setBackground(new Color(255, 204, 255));
		chckbxNewCheckBox.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox.setBounds(110, 380, 197, 29);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for the validate the login of the user according the mobile number
				String mobile_number = t1.getText();
                String password = new String(t2.getPassword());
                if (validateLogin(mobile_number, password)) {
                    JOptionPane.showMessageDialog(null, "Login Successfully....");
                    System.out.println(""+mobile_number+"\t"+password);
                    t1.setText("");
                    t2.setText("");
                    MainPage m1 = new MainPage();
                    m1.frame.setVisible(true);
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to login");
                    t1.setText("");
                    t2.setText("");
                }
			}
		});
		btnNewButton.setForeground(new Color(153, 0, 51));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 37));
		btnNewButton.setBounds(110, 422, 345, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Forgot Password ?");
		btnNewButton_1.setBackground(new Color(255, 204, 255));
		btnNewButton_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(170, 479, 227, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create New Account");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(110, 531, 214, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage r1 = new RegisterPage();
				r1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 204, 255));
		btnNewButton_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(327, 522, 106, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		t2 = new JPasswordField();
		t2.setBounds(110, 300, 345, 39);
		frame.getContentPane().add(t2);
	}
	// Code which check the user is valid or not
	private boolean validateLogin(String username, String password) {
        boolean isValid = false;
        
        try {
            String query = "SELECT * FROM register WHERE mobile_number = ? AND password = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                isValid = true;
                System.out.println("username: "+rs.getString(1));
            	System.out.println("Password: "+rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return isValid;
    }
}
