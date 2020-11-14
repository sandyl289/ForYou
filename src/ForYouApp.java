import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class ForYouApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterYourName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForYouApp frame = new ForYouApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ForYouApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1285, 916);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 750);
		Dimension ecranDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(ecranDimension.width / 2 - getSize().width / 2, ecranDimension.height / 2 - getSize().height / 2);
		
		setLocationRelativeTo(null);
		
		setTitle("For You ~~");
		
		JButton enterButton = new JButton("Enter");
		enterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Enter button pressed");
			}
		});
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		enterButton.setBounds(174, 600, 97, 25);
		contentPane.add(enterButton);
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.setForeground(new Color(0, 206, 209));
		txtEnterYourName.setText("Enter your name");
		txtEnterYourName.setBounds(351, 263, 150, 25);
		contentPane.add(txtEnterYourName);
		txtEnterYourName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hello! :)  What is your name?");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(0, 206, 209));
		lblNewLabel.setBounds(54, 235, 416, 75);
		contentPane.add(lblNewLabel);
	}
}
