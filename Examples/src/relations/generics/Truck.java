package relations.generics;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Generics example. A Truck holding different types of products
 * @author ISIS1126
 */
public class Truck<T extends IProduct> {

	private LinkedList<T> products;
	
	public Truck() {
		this.products = new LinkedList<T>();
	}
	
	public void loadProduct(T product) {
		this.products.add(product);
	}
	
	public void loadProducts(List<T> products) {
		//TODO
	}
	
	public T unloadProduct(String productName) {
		for(T p : this.products) {
			if(p.getName().equals(productName)) {
				this.products.remove(p);
				return p;
			}
		}
		return null;
	}
	
	public List<T> unloadProducts(String productName) {
		//TODO
		return new LinkedList<T>();
	}
	
	public double getMaxTemperature(List<T> products) {
		double maxTemp = Double.NEGATIVE_INFINITY;
		for(T p : products) {
			maxTemp = Math.max(maxTemp, p.getTemperature());
		}
		return maxTemp;
	}

	public static void main(String[] args) {
		Truck<FrozenProduct> frozenTruck = new Truck<FrozenProduct>();
		Truck<CannedProduct> cannedTruck = new Truck<CannedProduct>();
		CannedProduct can = new CannedProduct("beans", 26.0, new Date());
		FrozenProduct bag = new FrozenProduct("fries", 0.0, new Date());

		frozenTruck.loadProduct(bag);
		cannedTruck.loadProduct(can);
	}
}
