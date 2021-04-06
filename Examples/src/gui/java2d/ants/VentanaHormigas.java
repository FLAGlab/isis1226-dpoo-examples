package gui.java2d.ants;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaHormigas extends JFrame {
	public VentanaHormigas() {
		add(new PanelHormigas(100, 400, 400));
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new VentanaHormigas();
	}
}