import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import interfaces.OptionListener;

public class Option extends JFrame {

	private JPanel contentPane;

	// Variable liee entre l'interaction des classes Normal et App23SpiderMan
	private ArrayList<OptionListener> listListener = new ArrayList<OptionListener>();

	String[] arrayOptions = new String[42];
	private JTextArea txtAreaQuote;
	private JLabel lblRocks;
	private JLabel lblBeach;
	private JLabel lblEvening;
	private JLabel lblFengShui;
	private JLabel lblShell;
	private JLabel lblSky;
	private String name;
	private JLabel lblWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option frame = new Option();
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
	public Option() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 737);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 246, 233));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 750);
		Dimension ecranDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(ecranDimension.width / 2 - getSize().width / 2, ecranDimension.height / 2 - getSize().height / 2);

		setLocationRelativeTo(null);

		// Option
		arrayOptions[0] = "“I have chosen to be happy because it is good for my health.” - Voltaire";
		arrayOptions[1] = "“The body is like a piano, and happiness is like music. It is needful to have the instrument in good order.” – Henry Ward Beecher";
		arrayOptions[2] = " “A healthy attitude is contagious but don’t wait to catch it from others. Be a carrier.” – Tom Stoppard";
		arrayOptions[3] = "“The groundwork for all happiness is good health.” – Leigh Hunt";
		arrayOptions[4] = "“I hate every minute of training. But I said, don’t quit. Suffer now and live the rest of your life as a champion.” – Mohammad Ali";
		arrayOptions[5] = "“We do not stop exercising because we grow old – we grow old because we stop exercising.” - Dr. Kenneth Cooper";
		arrayOptions[6] = "“What most people don’t realize is that food is not just calories: It’s information. It actually contains messages that communicate to every cell in the body.” - Dr. Mark Hyman";
		arrayOptions[7] = "“To eat is a necessity, but to eat intelligently is an art.” - Francois La Rochefoucauld";
		arrayOptions[8] = "“Healthy citizens are the greatest asset any country can have.” - Winston Churchill";
		arrayOptions[9] = "“It is health that is real wealth and not pieces of gold and silver.” - Mahatma Gandhi";
		arrayOptions[10] = "“Self-esteem is as important to our well-being as legs are to a table. It is essential for physical and mental health and for happiness.” - Louise Hart";
		arrayOptions[11] = "“You are the only one who can limit your greatness.” - Unknown";
		arrayOptions[12] = "“So many people spend their health gaining wealth, and then have to spend their wealth to regain their health.” - A.J. Reb Materi";
		arrayOptions[13] = "“It’s never too late and you’re never too old to become better.” - Unknown";
		arrayOptions[14] = "“Happiness is the highest form of health.” - Dalai Lama";
		arrayOptions[15] = "“If you think wellness is expensive, try illness.” - Unknown";
		arrayOptions[16] = "“Deep breathing is our nervous system’s love language.” - Dr. Lauren Fogel Mersy";
		arrayOptions[17] = "“Sleep is that golden chain that ties health and our bodies together.” - Thomas Dekker";
		arrayOptions[18] = "“Our bodies are our gardens – our wills are our gardeners.” - William Shakespeare";
		arrayOptions[19] = "“We are such stuff as dreams are made on, and our little life is rounded with a sleep.” - William Shakespeare";
		arrayOptions[20] = "Call a friend/family member";
		arrayOptions[21] = "Read a new book";
		arrayOptions[22] = "Take a bike ride";
		arrayOptions[23] = "Get 8 hours of sleep";
		arrayOptions[24] = "Listen to music";
		arrayOptions[25] = "No snacks";
		arrayOptions[26] = "Run for 10 minutes";
		arrayOptions[27] = "Listen to music while cooking";
		arrayOptions[28] = "Wake up 30 minutes earlier";
		arrayOptions[29] = "Spend 5 minutes meditating";
		arrayOptions[30] = "Write down 1 goal";
		arrayOptions[31] = "Drink 1 liter of water";
		arrayOptions[32] = "No fast food";
		arrayOptions[33] = "Stand up every hour";
		arrayOptions[34] = "Write down 5 things that made you happy today";
		arrayOptions[35] = "Tidy up yourself/your room";
		arrayOptions[36] = "Eat breakfast";
		arrayOptions[37] = "Eat 7-9 cups of veggies";
		arrayOptions[38] = "5 minutes plank";
		arrayOptions[39] = "No devices in the bedroom";
		arrayOptions[40] = "Write a letter to a friend";
		arrayOptions[41] = "Watch a TEDtalk";

		lblWelcome = new JLabel("");
		txtAreaQuote = new JTextArea();
		txtAreaQuote.setEditable(false);
		txtAreaQuote.setWrapStyleWord(true);
		txtAreaQuote.setLineWrap(true);
		txtAreaQuote.setBackground(new Color(219, 246, 233));
		txtAreaQuote.setBounds(252, 127, 744, 169);
		txtAreaQuote.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		contentPane.add(txtAreaQuote);

		// lblRocks = new JLabel(new ImageIcon("image/rocks.jpg"));
		lblRocks = new JLabel(new ImageIcon("image/rocks.jpg"));
		lblRocks.setBounds(297, 348, 653, 307);
		contentPane.add(lblRocks);

		lblBeach = new JLabel(new ImageIcon("image/beach.jpg"));
		lblBeach.setBounds(297, 272, 653, 383);
		contentPane.add(lblBeach);

		lblEvening = new JLabel(new ImageIcon("image/evening.jpg"));
		lblEvening.setBounds(297, 272, 653, 383);
		contentPane.add(lblEvening);

		lblFengShui = new JLabel(new ImageIcon("image/feng-shui.jpg"));
		lblFengShui.setBounds(297, 285, 653, 370);
		contentPane.add(lblFengShui);

		lblShell = new JLabel(new ImageIcon("image/shell.jpg"));
		lblShell.setBounds(297, 259, 653, 396);
		contentPane.add(lblShell);

		lblSky = new JLabel(new ImageIcon("image/sky.jpg"));
		lblSky.setBounds(297, 240, 653, 472);
		contentPane.add(lblSky);

		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				leverModeAccueil();
			}
		});
		btnBack.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnBack.setBounds(1066, 630, 97, 25);
		contentPane.add(btnBack);

	}

	private void getRandomImage() {
		Random random = new Random();
		int lowerBound = 0;
		int upperBoundExcluded = 6;
		int i = random.nextInt(upperBoundExcluded - lowerBound) + lowerBound;

		switch (i) {
		case 0: // display rock
			lblRocks.setVisible(true);
			lblBeach.setVisible(false);
			lblEvening.setVisible(false);
			lblFengShui.setVisible(false);
			lblShell.setVisible(false);
			lblSky.setVisible(false);
			break;

		case 1: // display beach
			lblRocks.setVisible(false);
			lblBeach.setVisible(true);
			lblEvening.setVisible(false);
			lblFengShui.setVisible(false);
			lblShell.setVisible(false);
			lblSky.setVisible(false);
			break;

		case 2: // display evening
			lblRocks.setVisible(false);
			lblBeach.setVisible(false);
			lblEvening.setVisible(true);
			lblFengShui.setVisible(false);
			lblShell.setVisible(false);
			lblSky.setVisible(false);
			break;

		case 3: // display Feng shui
			lblRocks.setVisible(false);
			lblBeach.setVisible(false);
			lblEvening.setVisible(false);
			lblFengShui.setVisible(true);
			lblShell.setVisible(false);
			lblSky.setVisible(false);
			break;

		case 4: // display shell
			lblRocks.setVisible(false);
			lblBeach.setVisible(false);
			lblEvening.setVisible(false);
			lblFengShui.setVisible(false);
			lblShell.setVisible(true);
			lblSky.setVisible(false);
			break;

		case 5: // display sky
			lblRocks.setVisible(false);
			lblBeach.setVisible(false);
			lblEvening.setVisible(false);
			lblFengShui.setVisible(false);
			lblShell.setVisible(false);
			lblSky.setVisible(true);
			break;

		}
	}

	private String getRandom() {
		Random random = new Random();
		int lowerBound = 0;
		int upperBoundExcluded = 42;
		int i = random.nextInt(upperBoundExcluded - lowerBound) + lowerBound;

		return arrayOptions[i];
	}

	private String getRandomChallenge() {
		Random random = new Random();
		int lowerBound = 20;
		int upperBoundExcluded = 42;
		int i = random.nextInt(upperBoundExcluded - lowerBound) + lowerBound;

		return arrayOptions[i];
	}

	private String getRandomQuote() {
		Random random = new Random();
		int lowerBound = 0;
		int upperBoundExcluded = 20;
		int i = random.nextInt(upperBoundExcluded - lowerBound) + lowerBound;

		return arrayOptions[i];
	}

	public void setOption(String optionName) {
		switch (optionName) {
		case "Quote":
			txtAreaQuote.setText(getRandomQuote());
			setTitle("Quote");
			getRandomImage();
			break;

		case "Challenge":
			txtAreaQuote.setText(getRandomChallenge());
			setTitle("Challenge");
			getRandomImage();
			break;

		case "Random":
			txtAreaQuote.setText(getRandom());
			setTitle("Random");
			getRandomImage();
			break;
		}
	}

	public void addOptionListener(OptionListener objEcout) {
		listListener.add(objEcout);
	}

	private void leverModeAccueil() {
		for (OptionListener objEcout : listListener) {
			objEcout.modeHome(true);
		}
	}

	public void setName(String name) {
		lblWelcome.setText("Welcome " + name + "! \\(^u^)/");
		lblWelcome.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		lblWelcome.setForeground(new Color(49, 50, 111));
		lblWelcome.setBounds(46, 29, 449, 59);
		contentPane.add(lblWelcome);
	}
}
