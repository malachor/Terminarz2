package appTerminarz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NotatkaEdit extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea text;
	private JButton update;
	
	/*KONSTRUKTOR*/
	public NotatkaEdit() {
		this.text = new JTextArea(odczytaj());
		this.text.setBounds(10, 10, 400, 190);
		this.text.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1));
		this.update = new JButton("Uaktualnij");
		this.update.setBounds(10, 200, 400, 50);
		this.update.addActionListener(this);
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
	
	public String odczytaj() {
		String fileName = "Notatka.txt";
		BufferedReader reader = null;
		String template = "";
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String tmp = null;
			while((tmp = reader.readLine()) != null) {
				template += tmp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return template;	
	}
	
	/*GETTERY I SETTERY*/
	public JTextArea getText() {
		return text;
	}
	public void setText(JTextArea text) {
		this.text = text;
	}
	public JButton getUpdate() {
		return update;
	}
	public void setUpdate(JButton update) {
		this.update = update;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == update) {
			String textArea = text.getText();
			zapisz(textArea);
		}
		// TODO Auto-generated method stub
		
	}
}
