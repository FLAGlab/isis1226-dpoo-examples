package gui.java2d.sparkline;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class SparkLine extends JComponent {
	
	private ArrayList<Integer> values;
	private int min;
	private int max;
	
	public SparkLine() {
		this.min = 0;
		this.max = 0;
		this.values = new ArrayList<Integer>();
	}
	
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(100, 60);
	}
	
	public void addValue(int value) {
		this.values.add(value);
		this.min = Math.min(value, min);
		this.max = Math.max(value, max);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(getBackground());
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setColor(getForeground());
		g2d.drawRect(0, 0, getWidth(), getHeight());
		if(this.values.size() >1) {
			double proportion = getHeight()/(max - min);
			int last = this.values.get(0) - min;
			int x = 0;
			int deltaX = getWidth()/(values.size() -1);
			g2d.setColor(Color.RED);
			for(int i=1; i<values.size(); i++) {
				int next = this.values.get(i) - min;
				g2d.drawLine(x, getHeight() - (int)(last*proportion), x + deltaX, getHeight() - (int)(next*proportion));
				last = next;
				x += deltaX;
			}
		}
	}
}
