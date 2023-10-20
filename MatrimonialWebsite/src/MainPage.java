import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1178, 643);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setForeground(new Color(51, 0, 204));
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(221, 29, 104, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("About Us");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatriAbout r1 = new MatriAbout();
        		r1.frame.setVisible(true);
        		frame.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(new Color(51, 0, 204));
		btnNewButton_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.setBounds(348, 29, 104, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Services");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatriServices s1 = new MatriServices();
				s1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setForeground(new Color(51, 0, 204));
		btnNewButton_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_2.setBounds(475, 29, 104, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Gallery");
		btnNewButton_3.setForeground(new Color(51, 0, 204));
		btnNewButton_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_3.setBounds(600, 29, 104, 31);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Contact Us");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatriContact c1 = new MatriContact();
				c1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setForeground(new Color(51, 0, 204));
		btnNewButton_4.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_4.setBounds(729, 29, 104, 31);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Login");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatriLogin l1 = new MatriLogin();
				l1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_5.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_5.setBackground(new Color(255, 0, 255));
		btnNewButton_5.setForeground(new Color(245, 255, 250));
		btnNewButton_5.setBounds(1000, 23, 110, 43);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("MILAN");
		lblNewLabel_1.setForeground(new Color(204, 0, 102));
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 188, 70);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Find Your ");
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(126, 292, 193, 114);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Perfect ");
		lblNewLabel_3.setForeground(new Color(153, 51, 204));
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel_3.setBounds(314, 292, 148, 114);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Life Partner");
		lblNewLabel_2_1.setForeground(new Color(204, 51, 255));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel_2_1.setBounds(255, 363, 256, 83);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("We Bring People Together,");
		lblNewLabel_4.setForeground(new Color(51, 0, 204));
		lblNewLabel_4.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(145, 438, 349, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Love Unites Them.....................");
		lblNewLabel_4_1.setForeground(new Color(51, 0, 204));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4_1.setBounds(241, 470, 349, 31);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Sidharth 20Malhotra (1)-modified.png"));
		lblNewLabel_5.setBounds(753, 259, 338, 242);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\JgL6Bd (1).jpg"));
		background.setBounds(0, 0, 1164, 596);
		frame.getContentPane().add(background);
	}
}
