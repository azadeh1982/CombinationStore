package ProductName;
import java.util.List;

public interface ProductNameDao {
    		
	public ProductName getProductBySKU(int SKU);
    public List<ProductName> getProducts();
}
