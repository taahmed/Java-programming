package ch08;

//This is the Class GenericProduct

import java.text.NumberFormat;

public class GenericProducts {

	// fields set to private so that now one will change it
	private String product;
	private double price;
	private String description;
	private int productCount;

	// creating a construtor method

	public GenericProducts(String inputProduct, double inputPrice, String inputDescription, int iptProductCount) {

		this.product = inputProduct;
		this.price = inputPrice;
		this.description = inputDescription;
		this.productCount = iptProductCount;
	}

	// product getter and setter method
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	// creating getter and formatted output of the price
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}

	public void setPriceFormatted(double price) {

		this.price = price;

	}

	// creating Description getter and setter method

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// creating Getter and Setter methods
	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	// Tostring
	@Override
		public String toString(){
		return "Product Name: " + product + "Price: " + price +
		"Description: " + description + "Count Number: " + productCount;

		}
}