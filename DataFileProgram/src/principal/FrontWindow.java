package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class FrontWindow extends JFrame {

	private JPanel contentPane;
	private JLabel Fondo;
	private ActionListener action;
	private int time = 0;
	private Timer timer;

	public FrontWindow() {
		setBackground(Color.WHITE);
		setTitle("Data File ");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrontWindow.class.getResource("/resources/ICONO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(FrontWindow.class.getResource("/resources/Fondo.jpg")));
		Fondo.setBounds(0, 0, 820, 461);
		contentPane.add(Fondo);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBorder(new LineBorder(Color.WHITE));
		progressBar.setForeground(Color.ORANGE);
		progressBar.setMaximum(70);
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(58, 361, 361, 14);
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
		this.timer = new Timer(70, action);
		this.timer.start();
		
		
	}
	
	/**Close Method*/
	public void close() {
		this.setVisible(false);
	}

	/**loadInformation Method**/
	public void loadInformation() {
		if (time == 70) {
			//IngresarDatos window02 = new IngresarDatos();
			LoginWindow login = new LoginWindow();
			close();
			login.setVisible(true);
		}
	}
}
