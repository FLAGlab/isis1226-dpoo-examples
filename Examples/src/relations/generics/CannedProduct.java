package relations.generics;

import java.util.Date;

/**
 * Generics
 * Canned product
 * @author ISIS1126
 */
public class CannedProduct implements IProduct {

	private String name;
	private double temperature;
	private Date expirationDate;
	
	public CannedProduct(String name, double temperature, Date expDate) {
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
