import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;

public class MatriServices {

    public JFrame frame;
    private JTextField t1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MatriServices window = new MatriServices();
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
    public MatriServices() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1223, 626);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null); // Set layout to null

        t1 = new JTextField();
        t1.setBackground(new Color(102, 255, 51));
        t1.setBounds(42, 85, 338, 382);
        frame.getContentPane().add(t1);
        t1.setColumns(10);
        
        JLabel l1 = new JLabel("");
        l1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\white-background-bow-wedding-wallpaper-preview (1).png"));
        l1.setBounds(0, 0, 1209, 589);
        frame.getContentPane().add(l1);
    }
}
