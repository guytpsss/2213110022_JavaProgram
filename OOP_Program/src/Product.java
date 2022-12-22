
public class Product{
	private String id;
	private int unit;
	private double price;

	public void setID(String ID) {
		id = ID;
	}
	public String getID() {
		return id;
	}
	public void setUnit(int UNIT) {
		unit = UNIT;
	}
	public int getUnit() {
		return unit;
	}
	public void setPrice(double Price) {
		price = Price;
	}
	public double getPrive() {
		return price;
	}
	public double calculate() {
		return unit*price;
	}
}

