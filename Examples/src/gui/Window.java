package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = -9212399885368612884L;

	public Window() {
		this.setLayout(new BorderLayout());
		
		this.setTitle("Swing Window");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 350);
		
		JLabel left = new JLabel("Left");
		left.setBackground(Color.CYAN);
		left.setOpaque(true);
		
		JLabel center = new JLabel("Center");
		center.setBackground(Color.YELLOW);
		center.setOpaque(true);
		
		JTextField top = new JTextField("Top");
		JButton bottom = new JButton("Bottom");
		
		this.add(left, BorderLayout.WEST);
		this.add(center, BorderLayout.CENTER);
		this.add(top, BorderLayout.NORTH);
		this.add(bottom, BorderLayout.SOUTH);
		
		bottom.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	
	public static void main(String[] args) {
		new Window();
	}
}
