package gui.java2d.sparkline;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaSparkLine extends JFrame implements ActionListener {
	
	private SparkLine sl;
	private JButton button;
	
	public VentanaSparkLine() {
		sl = new SparkLine();
		sl.addValue(10);
		sl.addValue(15);
		sl.addValue(10);
		sl.addValue(18);
		sl.addValue(23);
		sl.addValue(5);
		sl.setForeground(Color.BLUE);
		sl.setBackground(Color.WHITE);
		sl.repaint();
		this.add(sl, BorderLayout.SOUTH);
		
		button = new JButton("Add point");
		button.addActionListener(this);
		add(button);
		
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String value = JOptionPane.showInputDialog("Insert a number");
		if(value != null) {
			int number = Integer.parseInt(value);
			sl.addValue(number);
			sl.repaint();
		}
	}
	
	public static void main(String[] args) {
		new VentanaSparkLine();
	}
}
