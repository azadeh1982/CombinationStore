package Model;

import java.util.List;



public interface ProductDao {
    		
	public Product getProductBySKU(int SKU);
    public List<Product> getProducts();
}
