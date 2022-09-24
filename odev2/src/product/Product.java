package product;

public class Product {

public Product() {}
	
	public Product(int id, String name, String description, double price, int stockAmount) {
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.stockAmount = stockAmount;
	
	if (this.name != null) {
		this.kod = this.name.substring(0, 1) + id;
	} else {
		this.kod = "N/A";
	}
}
	// attributes || fields
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		if (this.name != null) {
			this.kod = this.name.substring(0, 1) + id;
		} else {
			this.kod = "N/A";
		}
		
		return this.kod;
	}

	@Override
	public String toString() {
		if (this.name != null) {
			this.kod = this.name.substring(0, 1) + id;
		} else {
			this.kod = "N/A";
		}

		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", stockAmount=" + stockAmount + ", kod=" + kod + "]";
	}

}
