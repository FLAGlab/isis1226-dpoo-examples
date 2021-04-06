package gui.java2d.ants;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

@SuppressWarnings("serial")
public class PanelHormigas extends JPanel {
	private ArrayList<Hormiga> hormigas = new ArrayList<Hormiga>();

	public PanelHormigas(int cantidad, int ancho, int alto)	{
		for (int i = 0; i < cantidad; i++)
			hormigas.add(new Hormiga(ancho, alto));
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setColor(Color.black);
		g2d.setFont(getFont().deriveFont(9f));
		for (Hormiga h : hormigas) {
			int[] datos = h.darInfo();
			g2d.fillOval(datos[1] - 1, datos[2] - 1, 3, 3);
			g2d.fillOval(datos[1] - datos[3] - 1, 
                            datos[2] - datos[4] - 1, 3, 3);
			g2d.drawString("" + datos[0], 
                              datos[1] - 2, datos[2] - 2);
			h.moverHormiga();
		}
		SwingUtilities.invokeLater(() ->
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		repaint();
	}
}