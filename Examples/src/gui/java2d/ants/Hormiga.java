package gui.java2d.ants;


public class Hormiga {
	private static int cantidad = 0;
	private int num;
	private int x;
	private int y;
	private int velX;
	private int velY;

	public Hormiga(int maxX, int maxY) {
		num = cantidad;
		cantidad += 1;
		x = (int) (Math.random() * maxX);
		y = (int) (Math.random() * maxY);
		velX = (int) (Math.random() * 8 - 4);
		velY = (int) (Math.random() * 8 - 4);
	}

	public void moverHormiga() {
		x += velX;
		y += velY;
		if (x < 0 || x > 400)
			velX = -velX;
		if (y < 0 || y > 400)
			velY = -velY;
	}

	public int[] darInfo()	{
		return new int[] { num, x, y, velX, velY };
	}
}