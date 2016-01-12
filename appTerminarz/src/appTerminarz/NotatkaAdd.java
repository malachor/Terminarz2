package appTerminarz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NotatkaAdd extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2983557025711430135L;
	
	private JTextArea text;
	private JButton confirm;
	
	/*KONSTRUKTOR*/
	public NotatkaAdd() {
		this.text = new JTextArea("Dodaj tekst");
		this.text.setBounds(10, 10, 400, 190);
		this.text.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1));
		this.confirm = new JButton("Zapisz");
		this.confirm.setBounds(10, 200, 400, 50);
		this.confirm.addActionListener(this);
	}
	
	/*ZAPIS WSPOLRZÊDNYCH DO PLIKU*/
	public void zapisz(String tekst) {
		String fileName = "Notatka.txt";
		try(
				BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
				) {
			writer.write(tekst);
		} catch(IOException e) {
			System.err.println("Zapis do pliku nieudany.");
		}
	}
	
	/*GETTERY I SETTERY*/
	public JTextArea getText() {
		return text;
	}
	public void setText(JTextArea text) {
		this.text = text;
	}
	public JButton getConfirm() {
		return confirm;
	}
	public void setConfirm(JButton confirm) {
		this.confirm = confirm;
	}
	
	/*OBSLUGA ZDARZEN*/
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == confirm) {
			String textArea = text.getText();
			zapisz(textArea);
		}
		// TODO Auto-generated method stub
		
	}

}
