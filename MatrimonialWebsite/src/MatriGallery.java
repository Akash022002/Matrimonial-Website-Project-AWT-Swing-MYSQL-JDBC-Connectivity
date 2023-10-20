import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class MatriGallery {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatriGallery window = new MatriGallery();
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
	public MatriGallery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1199, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GALLERY");
		lblNewLabel.setForeground(new Color(0, 0, 153));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(400, 57, 345, 65);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("photos");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\istockphoto-866987706-612x612 (1).jpg"));
		lblNewLabel_1.setBounds(31, 164, 247, 212);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("photos");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\360_F_167319724_bZRVYhP3ubByTDR4Mt0zASeigXWvVOQx (1).jpg"));
		lblNewLabel_1_1.setBounds(329, 164, 247, 212);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("photos");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\images (6) (1).jpg"));
		lblNewLabel_1_1_1.setBounds(630, 164, 247, 212);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("photos");
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\download (3) (1).jpg"));
		lblNewLabel_1_1_2.setBounds(900, 164, 247, 212);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("Pankaj Sharma");
		lblNewLabel_2.setForeground(new Color(0, 0, 102));
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(145, 420, 247, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("This the great platform for the  find the great partner for my ");
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(31, 465, 474, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("life. This my lifetime great experience in my whole life");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1.setBounds(31, 486, 474, 23);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Along with that my life partner is loyal with my partnership with me.");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_2.setBounds(31, 508, 474, 23);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Neha ghadge");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_2_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_2_1.setBounds(776, 420, 247, 31);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("This the great platform for the  find the great partner for my ");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_3.setBounds(662, 465, 474, 23);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("life. This my lifetime great experience in my whole life");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1_1.setBounds(662, 486, 474, 23);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Along with that my life partner is loyal with my partnership with me.");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_2_1.setBounds(662, 508, 474, 23);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		textField = new JTextField();
		textField.setBounds(468, 106, 219, 3);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\white-roses-bouquet-on-beach-with-blur-a-couple-wedding-background-ai-generated-free-photo (1).jpg"));
		background.setBounds(0, 0, 1185, 610);
		frame.getContentPane().add(background);
		
	}
}
