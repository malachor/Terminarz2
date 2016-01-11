package appTerminarz;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NotatkaFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*KONSTRUKTOR RAMKI NOTATKI, DODAWANIE ELEMENTOW*/
	public NotatkaFrame() {
		Notatka note = new Notatka();
		setTitle("Notatka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(710,250,450,300);
		Container contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.add(note.getText());
		this.add(note.getConfirm());
	}

}
