package gui.mvc;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListPrueba extends JFrame {
	public JListPrueba() {
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		modelo.addElement("Hola");
		modelo.addElement("nuevo");
		modelo.addElement("mundo");

		JList<String> lista = new JList<String>(modelo);
		lista.setCellRenderer(new StringRenderer());
		add(lista);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JListPrueba();
	}
}