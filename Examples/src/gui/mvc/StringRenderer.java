package gui.mvc;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class StringRenderer implements ListCellRenderer<String> {
	  @Override
	  public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
		JLabel etiqueta = new JLabel(value.toUpperCase());
		etiqueta.setOpaque(true);
		etiqueta.setForeground(Color.WHITE);
		if (isSelected)
			etiqueta.setBackground(Color.GRAY);
		else
			etiqueta.setBackground(Color.BLACK);
		if (cellHasFocus)
			etiqueta.setForeground(Color.YELLOW);
		return etiqueta;
	  }
	}