package br.com.SellControl.model.entities;

public class ItemSell {

	private Integer id;
	private Sell sell;
	private Product product;
	private Integer quantity;
	private Double subtotal;
	@SuppressWarnings("unused")
	private String productName;
	@SuppressWarnings("unused")
	private Double productPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sell getSell() {
		return sell;
	}

	public void setSell(Sell sell) {
		this.sell = sell;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProductName() {
		return product.getDescription();
	}

	public Double getProductPrice() {
		return product.getPrice();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

}
