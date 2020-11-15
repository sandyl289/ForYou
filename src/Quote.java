import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Quote extends JFrame {

	private JPanel contentPane;
	private String name;
	String[] arrayOptions = new String[42]; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quote frame = new Quote();
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
	public Quote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 737);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219,246,233));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//QUOTES
		arrayOptions[0] ="�I have chosen to be happy because it is good for my health.� - Voltaire";
		arrayOptions[1] ="�The body is like a piano, and happiness is like music. It is needful to have the instrument in good order.� � Henry Ward Beecher";
		arrayOptions[2] =" �A healthy attitude is contagious but don�t wait to catch it from others. Be a carrier.� � Tom Stoppard";
		arrayOptions[3] ="�The groundwork for all happiness is good health.� � Leigh Hunt";
		arrayOptions[4] ="�I hate every minute of training. But I said, don�t quit. Suffer now and live the rest of your life as a champion.� � Mohammad Ali";
		arrayOptions[5] ="�We do not stop exercising because we grow old � we grow old because we stop exercising.� - Dr. Kenneth Cooper";
		arrayOptions[6] ="�What most people don�t realize is that food is not just calories: It�s information. It actually contains messages that communicate to every cell in the body.� - Dr. Mark Hyman";
		arrayOptions[7] ="�To eat is a necessity, but to eat intelligently is an art.� - Francois La Rochefoucauld";
		arrayOptions[8] ="�Healthy citizens are the greatest asset any country can have.� - Winston Churchill";
		arrayOptions[9] ="�It is health that is real wealth and not pieces of gold and silver.� - Mahatma Gandhi";
		arrayOptions[10] ="�Self-esteem is as important to our well-being as legs are to a table. It is essential for physical and mental health and for happiness.� - Louise Hart";
		arrayOptions[11] ="�You are the only one who can limit your greatness.� - Unknown";
		arrayOptions[12] ="�So many people spend their health gaining wealth, and then have to spend their wealth to regain their health.� - A.J. Reb Materi";
		arrayOptions[13] ="�It�s never too late and you�re never too old to become better.� - Unknown";
		arrayOptions[14] ="�Happiness is the highest form of health.� - Dalai Lama";
		arrayOptions[15] ="�If you think wellness is expensive, try illness.� - Unknown";
		arrayOptions[16] ="�Deep breathing is our nervous system�s love language.� - Dr. Lauren Fogel Mersy";
		arrayOptions[17] ="�Sleep is that golden chain that ties health and our bodies together.� - Thomas Dekker";
		arrayOptions[18] ="�Our bodies are our gardens � our wills are our gardeners.� - William Shakespeare";
		arrayOptions[19] ="�We are such stuff as dreams are made on, and our little life is rounded with a sleep.� - William Shakespeare";
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
		
		
		
		JTextArea txtAreaQuote = new JTextArea();
		txtAreaQuote.setWrapStyleWord(true);
		txtAreaQuote.setLineWrap(true);
		txtAreaQuote.setText(getRandomQuote());
		txtAreaQuote.setBackground(new Color(219,246,233));
		txtAreaQuote.setBounds(163, 96, 744, 448);
		txtAreaQuote.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		contentPane.add(txtAreaQuote);

		setTitle("Quote");
	
	}
	private String getRandom() {
		Random random = new Random();
		int lowerBound = 0;
		int upperBoundExcluded =42;
		int i = random.nextInt(upperBoundExcluded-lowerBound) + lowerBound;
		
		return arrayOptions[i];
	}
	
	private String getRandomChallenge() {
		Random random = new Random();
		int lowerBound = 20;
		int upperBoundExcluded =43;
		int i = random.nextInt(upperBoundExcluded-lowerBound) + lowerBound;
		
		return arrayOptions[i];
	}

	private String getRandomQuote() {
		Random random = new Random();
		int lowerBound = 0;
		int upperBoundExcluded =20;
		int i = random.nextInt(upperBoundExcluded-lowerBound) + lowerBound;
		
		return arrayOptions[i];
	}

	public void setName(String name) {
		this.name =name;
	}
}
