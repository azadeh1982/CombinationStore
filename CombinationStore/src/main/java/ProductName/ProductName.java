package ProductName;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.ui.Model;

@Entity
public class ProductName {
	@Id
private int SKU;  //Primary key
private String storeName;
private String productName;
private int Quantity;
@ManyToOne
private Model model;
public ProductName(Model model) {
	super();
	this.model = model;
}
private Model getModel() {
	return model;
}
private void setModel(Model model) {
	
}
public ProductName() {
}
public ProductName(int SKU, String productName, String storeName,int quantity, int Quantity,String model) {
	super();
	this.SKU = SKU;
	this.productName = productName;
	this.storeName = storeName;
	this.Quantity = Quantity;
	this.model = new Model;
	
}
private int getSKU() {
	return SKU;
}
private void setSKU(int sKU) {
	SKU = sKU;
}
private String getProductName() {
	return productName;
}
private void setProductName(String productName) {
	this.productName = productName;
}
private String getStoreName() {
	return storeName;
}
private void setStoreName(String storeName) {
	this.storeName = storeName;
}
private int getQuantity() {
	return Quantity;
}
private void setQuantity(int quantity) {
	Quantity = quantity;
}
}


