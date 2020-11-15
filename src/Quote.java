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
	String[] quotesArray = new String[20]; 
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
		quotesArray[0] ="“I have chosen to be happy because it is good for my health.” - Voltaire";
		quotesArray[1] ="“The body is like a piano, and happiness is like music. It is needful to have the instrument in good order.” – Henry Ward Beecher";
		quotesArray[2] =" “A healthy attitude is contagious but don’t wait to catch it from others. Be a carrier.” – Tom Stoppard";
		quotesArray[3] ="“The groundwork for all happiness is good health.” – Leigh Hunt";
		quotesArray[4] ="“I hate every minute of training. But I said, don’t quit. Suffer now and live the rest of your life as a champion.” – Mohammad Ali";
		quotesArray[5] ="“We do not stop exercising because we grow old – we grow old because we stop exercising.” - Dr. Kenneth Cooper";
		quotesArray[6] ="“What most people don’t realize is that food is not just calories: It’s information. It actually contains messages that communicate to every cell in the body.” - Dr. Mark Hyman";
		quotesArray[7] ="“To eat is a necessity, but to eat intelligently is an art.” - Francois La Rochefoucauld";
		quotesArray[8] ="“Healthy citizens are the greatest asset any country can have.” - Winston Churchill";
		quotesArray[9] ="“It is health that is real wealth and not pieces of gold and silver.” - Mahatma Gandhi";
		quotesArray[10] ="“Self-esteem is as important to our well-being as legs are to a table. It is essential for physical and mental health and for happiness.” - Louise Hart";
		quotesArray[11] ="“You are the only one who can limit your greatness.” - Unknown";
		quotesArray[12] ="“So many people spend their health gaining wealth, and then have to spend their wealth to regain their health.” - A.J. Reb Materi";
		quotesArray[13] ="“It’s never too late and you’re never too old to become better.” - Unknown";
		quotesArray[14] ="“Happiness is the highest form of health.” - Dalai Lama";
		quotesArray[15] ="“If you think wellness is expensive, try illness.” - Unknown";
		quotesArray[16] ="“Deep breathing is our nervous system’s love language.” - Dr. Lauren Fogel Mersy";
		quotesArray[17] ="“Sleep is that golden chain that ties health and our bodies together.” - Thomas Dekker";
		quotesArray[18] ="“Our bodies are our gardens – our wills are our gardeners.” - William Shakespeare";
		quotesArray[19] ="“We are such stuff as dreams are made on, and our little life is rounded with a sleep.” - William Shakespeare";
		
		
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

	private String getRandomQuote() {
		Random random = new Random();
		int lowerBound = 0;
		int upperBoundExcluded =20;
		int i = random.nextInt(upperBoundExcluded-lowerBound) + lowerBound;
		
		return quotesArray[i];
	}

	public void setName(String name) {
		this.name =name;
	}
}
