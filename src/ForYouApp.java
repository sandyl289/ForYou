import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ForYouApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterYourName;

	// Add window option
	private Option windowOption;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	// Variable link to the listener
	private ArrayList<OptionListener> listeEcouteurs = new ArrayList<OptionListener>();

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(219, 246, 233));

		// Creation de la fenetre secondaire de l'auteur
		windowOption = new Option();

		JLabel lblWelcome = new JLabel("WELCOME TO OUR PROJECT");
		lblWelcome.setForeground(new Color(49, 50, 111));
		lblWelcome.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 54));
		lblWelcome.setBounds(298, 43, 769, 101);
		contentPane.add(lblWelcome);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 750);
		Dimension ecranDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(ecranDimension.width / 2 - getSize().width / 2, ecranDimension.height / 2 - getSize().height / 2);

		setLocationRelativeTo(null);

		setTitle("For You ~~");

		JButton enterButton = new JButton("Enter");
		enterButton.setBackground(new Color(255, 218, 218));
		enterButton.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		enterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Enter button pressed");
			}
		});
		enterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtEnterYourName.getText();
				windowOption.setName(name);
				JOptionPane.showMessageDialog(null, "Welcome " + name + "! \n☆＊:,（●´∀｀）人（´∀｀●）・:＊☆");

				if (!windowOption.isVisible()) {
					windowOption.setVisible(true);
					setVisible(false);
				}
			}
		});

		enterButton.setBounds(635, 580, 97, 25);
		contentPane.add(enterButton);

		txtEnterYourName = new JTextField();
		txtEnterYourName.setForeground(new Color(0, 206, 209));
		txtEnterYourName.setBounds(407, 264, 333, 25);
		contentPane.add(txtEnterYourName);
		txtEnterYourName.setColumns(10);

		JLabel lblName = new JLabel("Hello! \\(^-^)/  What is your name?");
		lblName.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblName.setForeground(new Color(49, 50, 111));
		lblName.setBounds(54, 235, 416, 75);
		contentPane.add(lblName);

		JRadioButton rdbtnQuote = new JRadioButton("Quote");
		rdbtnQuote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowOption.setOption("Quote");
			}
		});
		rdbtnQuote.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		rdbtnQuote.setBackground(new Color(219, 246, 233));
		buttonGroup.add(rdbtnQuote);
		rdbtnQuote.setBounds(298, 481, 109, 23);
		contentPane.add(rdbtnQuote);

		JRadioButton rdbtnChallenge = new JRadioButton("Challenge");
		rdbtnChallenge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowOption.setOption("Challenge");
			}
		});
		rdbtnChallenge.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		rdbtnChallenge.setBackground(new Color(219, 246, 233));
		buttonGroup.add(rdbtnChallenge);
		rdbtnChallenge.setBounds(618, 481, 130, 23);
		contentPane.add(rdbtnChallenge);

		JRadioButton rdbtnRandom = new JRadioButton("Random");
		rdbtnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowOption.setOption("Random");
			}
		});
		rdbtnRandom.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		rdbtnRandom.setBackground(new Color(219, 246, 233));
		buttonGroup.add(rdbtnRandom);
		rdbtnRandom.setBounds(958, 481, 109, 23);
		contentPane.add(rdbtnRandom);

		JLabel lblAction = new JLabel("What would you like to receive today?");
		lblAction.setForeground(new Color(49, 50, 111));
		lblAction.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblAction.setBounds(54, 386, 417, 44);
		contentPane.add(lblAction);

		JLabel lblNewLabel = new JLabel(new ImageIcon("image/plane.jpg"));
		lblNewLabel.setBounds(1010, 154, 252, 301);
		contentPane.add(lblNewLabel);

		windowOption.addOptionListener(new OptionListener() {

			/**
			 * Methode servant a changer en mode accueil quand l'utilisateur le veut
			 */
			@Override
			public void modeHome(boolean modeHome) {
				if (modeHome) {
					windowHome();
				}
			}
		});

	}

	private void windowHome() {
		windowOption.dispose();
		setVisible(true);
	}

}
