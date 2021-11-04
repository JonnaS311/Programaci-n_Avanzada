package principal;

import java.awt.EventQueue;

/** 
 * @version 1.0, 02/11/201
 * @author Briyid Catalina Cruz Ostos & Jonnathan Sotelo Rodriguez
 */
public class MainWindow {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadingWindow frame = new LoadingWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
			
	}
}
