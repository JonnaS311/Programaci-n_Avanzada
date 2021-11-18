package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.border.LineBorder;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class OrgWindow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Listar listar = new Listar();
	private List<Long> codO=new ArrayList<Long>();
	private List<String> nomO= new ArrayList<String>();
	private JButton btnNewButton;

	public OrgWindow() {
		setTitle("Data File");
		setIconImage(Toolkit.getDefaultToolkit().getImage(OrgWindow.class.getResource("/resources/ICONO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(OrgWindow.class.getResource("/resources/robo (1).jpg")));
		lblNewLabel.setBounds(529, 0, 245, 451);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBorder(new LineBorder(Color.ORANGE));
		table.setSelectionBackground(Color.ORANGE);
		table.setGridColor(Color.ORANGE);
		table.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(añadirValoresCabeza(),
				new String[] {
						"New column", "New column"
					}
				));
		
		table.getColumnModel().getColumn(0).setPreferredWidth(130);
		table.getColumnModel().getColumn(1).setPreferredWidth(119);
		table.setBounds(26, 24, 466, 253);
		contentPane.add(table);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneralWindow general = new GeneralWindow();
				close();
				general.setVisible(true);
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 415, 245, 25);
		contentPane.add(btnNewButton);
	}
	
    public Object[][] añadirValoresCabeza(){
		
		Object[][] prueba_1= new Object[14][2];
		String[] nameD = {"Nombre y Apellido","Código Estudiantil"};
		listar.operacion();
		codO=listar.getCodO();
		nomO = listar.getNomO();
		
		
		for(int i=0;i<2;i++) {
				prueba_1[0][i]=nameD[i];
		}
		
			for(int j=0;j<codO.size();j++) {
				prueba_1[j+1][1]=codO.get(j);
				prueba_1[j+1][0]=nomO.get(j);
			}
			
	
		
		return prueba_1;
	}
    
    /**Close Method*/
	public void close() {
		this.setVisible(false);
	}
	
	
}
