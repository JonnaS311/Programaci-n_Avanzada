package principal;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;

@SuppressWarnings("serial")
public class JMenuBarWindow extends JFrame {
	
	/**Program variables*/
	private JPanel contentPane;
	private JLabel logo__GamaMaths;
	private JLabel logo__Color;
	private JMenu methods;
	private JMenuItem bubbleMethod;
	private JMenuItem selectionMethod;
	private JMenuItem insertionMethod;
	private JMenu help;
	private JMenuItem information;
	private JMenuBar menuBar;
	
	/** Class Constructor */
	public JMenuBarWindow() {
		setTitle("Gama|Maths");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(JMenuBarWindow.class.getResource("/resources/gamma_preview_rev_1 (1).png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		logo__Color = new JLabel("");
		logo__Color.setIcon(new ImageIcon(JMenuBarWindow.class.getResource("/resources/color.jpg")));
		logo__Color.setBounds(10, 372, 360, 64);
		contentPane.add(logo__Color);

		logo__GamaMaths = new JLabel("");
		logo__GamaMaths.setIcon(new ImageIcon(JMenuBarWindow.class.getResource("/resources/LOGO (2).png")));
		logo__GamaMaths.setBounds(37, 137, 311, 50);
		contentPane.add(logo__GamaMaths);

		menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		methods = new JMenu("Method of Ordering");
		methods.setBackground(Color.WHITE);
		methods.setFont(new Font("Sitka Heading", Font.PLAIN, 13));
		help = new JMenu("Help");
		help.setBackground(Color.WHITE);
		help.setFont(new Font("Sitka Heading", Font.PLAIN, 13));
		bubbleMethod = new JMenuItem("Bubble Metod");
		bubbleMethod.setBackground(Color.WHITE);
		bubbleMethod.setFont(new Font("Sitka Heading", Font.PLAIN, 13));
		selectionMethod = new JMenuItem("Selection Method");
		selectionMethod.setBackground(new Color(248, 248, 255));
		selectionMethod.setFont(new Font("Sitka Heading", Font.PLAIN, 13));
		insertionMethod = new JMenuItem("Insertion Method");
		insertionMethod.setBackground(Color.WHITE);
		insertionMethod.setFont(new Font("Sitka Heading", Font.PLAIN, 13));
		information = new JMenuItem("More Information");
		information.setFont(new Font("Sitka Heading", Font.PLAIN, 13));
		information.setBackground(Color.WHITE);

		menuBar.add(methods);
		menuBar.add(help);
		methods.add(bubbleMethod);
		methods.add(selectionMethod);
		methods.add(insertionMethod);
		help.add(information);
		setJMenuBar(menuBar);

		/**Bubble Method*/
		bubbleMethod.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				createBubble();
			}
		});

		/**Selection Method*/
		selectionMethod.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				createSelection();

				
			}

		});

		/**Insertion Method*/
		insertionMethod.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				createInsertion();

				
			}

		});

		information.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				createHelp();
			}
		});

		
	}
	
	/**Create bubble*/
	 public void createBubble() {
		   this.setVisible(false);
		   BubbleMethod bubbleP = new BubbleMethod(this);
		   bubbleP.setVisible(true);
		   
	   }
	 
	 /**Create selection*/
	 public void createSelection() {
		   this.setVisible(false);
		   SelectionMethod selectionP = new SelectionMethod(this);
		   selectionP.setVisible(true);
		   
	   }
	 
	 /**Create insertion*/
	 public void createInsertion() {
		   this.setVisible(false);
		   InsertionMethod insertionP = new InsertionMethod(this);
		   insertionP.setVisible(true);
		   
	   }
	 
	 /**Create Help*/
	 public void createHelp() {
		 this.setVisible(false);
		 HelpWindow help = new HelpWindow(this);
		 help.setVisible(true);
	 }
	 
	
}
