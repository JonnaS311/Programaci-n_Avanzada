package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class SelectionMethod extends JFrame {

	private JPanel contentPane;
	private order orderC;
    private int[] datos;
    private JMenuBarWindow principal;
    private JList<Integer> list01;
    private JLabel labelDescription;
    private JList<Integer> list02;
    private JButton enterInformation;
    private JButton perfomComp;
    private JButton back;
    private DefaultListModel<Integer> model;
    private JLabel logoGamaMaths;
    private JLabel color;
    private JLabel labelInput;
    private JLabel labelType;
    private JLabel labelResult;

    public SelectionMethod(JMenuBarWindow principal) {
        this.datos= new int[10];
        this.principal= principal;
        
        setTitle("Gama|Maths");
		setIconImage(Toolkit.getDefaultToolkit().getImage(BubbleMethod.class.getResource("/resources/gamma_preview_rev_1 (1).png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		logoGamaMaths = new JLabel("");
		logoGamaMaths.setIcon(new ImageIcon(BubbleMethod.class.getResource("/resources/LOGO (2).png")));
		logoGamaMaths.setBounds(36, 36, 311, 50);
		contentPane.add(logoGamaMaths);
		
		list01 = new JList<Integer>();
		list01.setBackground(new Color(248, 248, 255));
		list01.setBounds(21, 145, 52, 199);
		contentPane.add(list01);
		
		
		labelInput = new JLabel("Input");
		labelInput.setHorizontalAlignment(SwingConstants.CENTER);
		labelInput.setFont(new Font("Sitka Heading", Font.ITALIC, 13));
		labelInput.setBounds(21, 110, 46, 14);
		contentPane.add(labelInput);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(248, 248, 255));
		separator.setForeground(Color.WHITE);
		separator.setBounds(15, 97, 63, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(248, 248, 255));
		separator_1.setForeground(new Color(255, 255, 255));
		separator_1.setBounds(15, 135, 63, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBackground(new Color(248, 248, 255));
		separator_2.setBounds(101, 97, 72, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBackground(new Color(248, 248, 255));
		separator_3.setBounds(101, 135, 72, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBackground(new Color(248, 248, 255));
		separator_4.setBounds(193, 97, 72, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBackground(new Color(248, 248, 255));
		separator_5.setBounds(193, 135, 72, 2);
		contentPane.add(separator_5);
		
		list02 = new JList<Integer>();
		list02.setBackground(new Color(248, 248, 255));
		list02.setBounds(204, 145, 52, 199);
		contentPane.add(list02);
		
		
		labelType = new JLabel("Type");
		labelType.setHorizontalAlignment(SwingConstants.CENTER);
		labelType.setFont(new Font("Sitka Heading", Font.ITALIC, 13));
		labelType.setBounds(111, 110, 46, 14);
		contentPane.add(labelType);
		
		labelDescription = new JLabel("Integer");
		labelDescription.setFont(new Font("Sitka Heading", Font.ITALIC, 13));
		labelDescription.setHorizontalAlignment(SwingConstants.CENTER);
		labelDescription.setBounds(101, 148, 72, 14);
		contentPane.add(labelDescription);
		
		labelResult = new JLabel("Result");
		labelResult.setHorizontalAlignment(SwingConstants.CENTER);
		labelResult.setFont(new Font("Sitka Heading", Font.ITALIC, 13));
		labelResult.setBounds(203, 110, 46, 14);
		contentPane.add(labelResult);
		
		enterInformation = new JButton("Enter what do you want to calculate");
		enterInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				requestButtonActionPerformed(e);
			}
		});
		enterInformation.setBackground(new Color(255, 255, 255));
		enterInformation.setFont(new Font("Sitka Heading", Font.ITALIC, 12));
		enterInformation.setBounds(10, 355, 216, 18);
		contentPane.add(enterInformation);
		
		perfomComp = new JButton("Perfom Computations");
		perfomComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				organizeActionPerformed(e);
			}
		});
		perfomComp.setBackground(new Color(255, 255, 255));
		perfomComp.setFont(new Font("Sitka Heading", Font.ITALIC, 12));
		perfomComp.setBounds(10, 384, 216, 18);
		contentPane.add(perfomComp);
		
		back = new JButton("Back to the previous window");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backActionPerformed(e);
			}
		});
		back.setFont(new Font("Sitka Heading", Font.ITALIC, 12));
		back.setBounds(10, 443, 190, 18);
		contentPane.add(back);
		
		color = new JLabel("");
		color.setIcon(new ImageIcon(BubbleMethod.class.getResource("/resources/color.jpg")));
		color.setBounds(15, 11, 358, 14);
		contentPane.add(color);
		
		JLabel logo_language = new JLabel("POWERED BY THE GAMA LANGUAGE ");
		logo_language.setForeground(new Color(204, 51, 51));
		logo_language.setHorizontalAlignment(SwingConstants.CENTER);
		logo_language.setFont(new Font("Sitka Heading", Font.PLAIN, 7));
		logo_language.setBounds(246, 446, 127, 14);
		contentPane.add(logo_language);
    }
    
    /**request_Information is the method which requests the data from the user*/
    public void request_Information(){
        model = new DefaultListModel<Integer>();
        for(int i=0;i<10;i++){
            this.datos[i]= Integer.parseInt(JOptionPane.showInputDialog("Please enter the data "+(i+1)));
            model.addElement(datos[i]);
            list01.setModel(model);
        } 
    }
	
    /**organizeActionPerformed is the method which organize the data entered by the user 
     * @param event
     * */
	private void organizeActionPerformed(java.awt.event.ActionEvent event) {                                          
	       orderC= new order(this.datos);
	       int[] selection =orderC.selection();
	       DefaultListModel<Integer> model = new DefaultListModel<Integer>();
	        for(int i=0;i<10;i++){        
	            model.addElement(selection[i]);
	            list02.setModel(model);
	        }
	    } 
	
	/**@param evt*/
	private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
		request_Information();
    }                                           

	/**@param evt */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                       
       principal.setVisible(true);
       this.setVisible(false);
    }  
    
	

}
