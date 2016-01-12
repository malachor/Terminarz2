package appTerminarz;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NotatkaAddFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*KONSTRUKTOR RAMKI NOTATKI, DODAWANIE ELEMENTOW*/
	public NotatkaAddFrame() {
		NotatkaAdd note = new NotatkaAdd();
		setTitle("Notatka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1100,70,450,300);
		Container contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.add(note.getText());
		this.add(note.getConfirm());
	}

}