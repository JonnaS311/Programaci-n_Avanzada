package principal;

import java.awt.EventQueue;

/**
 * 
 * @author Briyid Catalina Cruz Ostos and Jonnathan Sotelo Rodríguez
 * @version 1.0,05/11/2021
 *
 */

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontWindow frame = new FrontWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
