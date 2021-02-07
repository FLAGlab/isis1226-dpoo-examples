package relations.generics;

import java.util.Date;

/**
 * Generics
 * Frozen Product
 * @author ISIS1126
 */
public class FrozenProduct implements IProduct {
	private String name;
	private double temperature;
	private Date expirationDate;

	public FrozenProduct(String name, double temperature, Date expDate) {
		this.name = name;
		this.temperature = temperature;
		this.expirationDate = expDate;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double getTemperature() {
		return this.temperature;
	}

	@Override
	public Date expirationDate() {
		return this.expirationDate;
	}
}
