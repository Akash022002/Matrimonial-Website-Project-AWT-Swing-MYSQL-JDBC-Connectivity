import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class MatriAbout {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatriAbout window = new MatriAbout();
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
	public MatriAbout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.setBounds(100, 100, 1168, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("About Us");
		lblNewLabel.setForeground(new Color(255, 51, 204));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(353, 72, 416, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Find your perfect Match in this website.where love,compatibility and lastig are come together.");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(90, 225, 589, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\images (1) (1).jpg"));
		lblNewLabel_2.setBounds(759, 154, 305, 425);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("convey your website's mission, and engage potential users. Here's some information of you ");
		lblNewLabel_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_1.setBounds(90, 248, 589, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Here's some information you can include to make your \"About\" page more appealing");
		lblNewLabel_1_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_2.setBounds(90, 269, 589, 24);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Begin with a warm and inviting welcome message that acknowledges visitors' needs for your data");
		lblNewLabel_1_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_3.setBounds(90, 313, 613, 24);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel(" companionship and finding the perfect partner. You can use phrases like, \"Welcome to");
		lblNewLabel_1_4.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_4.setBounds(90, 334, 589, 24);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel(" Emphasize your commitment to user satisfaction and safety. Highlight features such as privacy");
		lblNewLabel_1_5.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_5.setBounds(90, 357, 589, 24);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("controls, verification procedures, and customer support to assure users of a secure and pleasant");
		lblNewLabel_1_6.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_6.setBounds(100, 378, 589, 24);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Share success stories of couples who met through your website. Real-life examples can inspire confidence ");
		lblNewLabel_1_7.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_7.setBounds(90, 441, 645, 24);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel(" in your platform's effectiveness.");
		lblNewLabel_1_8.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1_8.setBounds(90, 462, 589, 24);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_3 = new JLabel("experience");
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(90, 402, 92, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("All right are reserved @ SiteCrafters.tech");
		lblNewLabel_4.setForeground(new Color(0, 51, 51));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_4.setBounds(199, 666, 755, 18);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(472, 120, 192, 4);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(204, 255, 255));
		textField.setBounds(112, 652, 936, 4);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Z3U7na (1).jpg"));
		lblNewLabel_5.setBounds(0, 0, 1154, 713);
		frame.getContentPane().add(lblNewLabel_5);
		
		
	}
}
