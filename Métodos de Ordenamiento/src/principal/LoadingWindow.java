package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class LoadingWindow extends JFrame {

	/**Program variables*/
    private JPanel principalPane;
    private Timer timer;
    private ActionListener action;
    private int x=0;
    private JProgressBar progressBar;
    private JLabel text_Loading;
    private JLabel logo_Monster;
    private JLabel logo_GamaMaths;
    private JLabel logo02_GamaMaths;
    private JLabel label__color01;
    
	/**Class Constructor*/
	public LoadingWindow() {
		
		this.action = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                x+=1;
                progressBar.setValue(x);
                loadInformation(); 
            } 
        };
        
        this.timer= new Timer(100,action);
        this.timer.start();
        
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		setForeground(Color.WHITE);
		setType(Type.POPUP);
		setTitle("Gama|Maths");
		setResizable(false);
		setBackground(Color.ORANGE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoadingWindow.class.getResource("/resources/gamma_preview_rev_1 (1).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 509);
		principalPane = new JPanel();
		principalPane.setForeground(Color.WHITE);
		principalPane.setBackground(Color.WHITE);
		principalPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(principalPane);
		principalPane.setLayout(null);
		
		JLabel label__color = new JLabel("");
		label__color.setIcon(new ImageIcon(LoadingWindow.class.getResource("/resources/color.jpg")));
		label__color.setBounds(10, 427, 360, 30);
		principalPane.add(label__color);
		
		label__color01 = new JLabel("");
		label__color01.setIcon(new ImageIcon(LoadingWindow.class.getResource("/resources/color.jpg")));
		label__color01.setBounds(10, 11, 360, 30);
		principalPane.add(label__color01);
		
		logo02_GamaMaths = new JLabel("");
		logo02_GamaMaths.setIcon(new ImageIcon(LoadingWindow.class.getResource("/resources/gamma_preview_rev_1 (1).png")));
		logo02_GamaMaths.setBounds(0, 66, 47, 50);
		principalPane.add(logo02_GamaMaths);
		
		logo_GamaMaths = new JLabel("");
		logo_GamaMaths.setIcon(new ImageIcon(LoadingWindow.class.getResource("/resources/LOGO (2).png")));
		logo_GamaMaths.setBounds(46, 66, 311, 50);
		principalPane.add(logo_GamaMaths);
		
		logo_Monster = new JLabel("");
		logo_Monster.setIcon(new ImageIcon(LoadingWindow.class.getResource("/resources/istockphoto-1018719514-170667a.jpg")));
		logo_Monster.setBounds(85, 152, 206, 206);
		principalPane.add(logo_Monster);
		
		text_Loading = new JLabel("Loading...");
		text_Loading.setForeground(new Color(255, 165, 0));
		text_Loading.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		text_Loading.setHorizontalAlignment(SwingConstants.CENTER);
		text_Loading.setBounds(150, 370, 93, 30);
		principalPane.add(text_Loading);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(10, 402, 360, 14);
		principalPane.add(progressBar);
		
	
	}
	
	public void close() {
		this.setVisible(false);
	}
	
	public void loadInformation() {
		
		if(x==03) {
        	
        	text_Loading.setText("03%");
        }
        if(x==12) {
        	
        	text_Loading.setText("12%");
        }
        if(x==25) {
        	
        	text_Loading.setText("25%");
        }
        
        if(x==32) {
        	text_Loading.setText("32%");
        	
        }
        if(x==37) {
        	text_Loading.setText("37%");
        }
        if(x==45) {
        	text_Loading.setText("45%");
        }
        if(x==56) {
        	text_Loading.setText("56%");
        }
        if(x==68) {
        	text_Loading.setText("68%");
        }
        if(x==72) {
        	text_Loading.setText("72%");
        }
        if(x==84) {
        	text_Loading.setText("84%");
        }
        if(x==94) {
        	text_Loading.setText("94%");
        }
        if(x==98) {
        	text_Loading.setText("98%");
        }
        if(x==99) {
        	text_Loading.setText("100%");
        }
        if(x==100){
            JMenuBarWindow window02 = new JMenuBarWindow();
            close();
            window02.setVisible(true);
        }
	}
}
