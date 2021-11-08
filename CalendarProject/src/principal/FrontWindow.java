package principal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

@SuppressWarnings("serial")
public class FrontWindow extends JFrame {

	private JPanel contentPane;
	private JLabel backgroundLbl;
	private JProgressBar progressBar;
	private int time = 0;
	private ActionListener action;
	private Timer timer;

	public FrontWindow() {

		setForeground(new Color(0, 0, 0));
		setTitle("Calendar PRO");
		setFont(new Font("Century Gothic", Font.PLAIN, 14));
		setBackground(new Color(255, 255, 240));
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrontWindow.class.getResource("/resources/IconProgram.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 572);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		backgroundLbl = new JLabel("");
		backgroundLbl.setIcon(new ImageIcon(FrontWindow.class.getResource("/resources/Copia de Business Calendar by Slidesgo_ (1).jpg")));
		backgroundLbl.setBounds(0, 0, 885, 546);
		contentPane.add(backgroundLbl);

		progressBar = new JProgressBar();
		progressBar.setBackground(new Color(255, 255, 255));
		progressBar.setForeground(new Color(100, 149, 237));
		progressBar.setBounds(212, 446, 538, 14);
		contentPane.add(progressBar);

		/** ProgressBar Load **/
		this.action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				time += 1;
				progressBar.setValue(time);
				loadInformation();
			}
		};
		this.timer = new Timer(100, action);
		this.timer.start();

	}

	/**Close Method*/
	public void close() {
		this.setVisible(false);
	}

	/**loadInformation Method**/
	public void loadInformation() {
		if (time == 100) {
			CalendarWindow window02 = new CalendarWindow();
			close();
			window02.setVisible(true);
		}
	}
}
