package ProductName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import Model.Product;
public abstract class ProductNameDaoImpl implements ProductNameDao{
   
	@Autowired
	private ProductName productName;
	
	private List<Product> product= new Arrays.list
	new Topic(001,"Lamer Creme", "Neiman Marcus", 12),
	new Topic(002, "Lamer Creme", "Saks Fifth Avenu",13),
	new Topic(003, "Lamer Creme", "Nordstrom",14),
	new Topic(004, "Lamer Creme", "Macy's",15),

	}	
		public List<ProductName> getAllProducts(){
			List<ProductName>productName =new ArrayList<>();
			ProductNameRepo();
			.forEach(productName::add);
			return productName;
					
					}
		protected abstract void ProductNameRepo();
		public ProductName getProductName(int SKU) {
			return ProductNameRepo.findOne(SkU);
			
		}
		public void addProductName(ProductName productName) {
			ProductNameRepo.save(ProductName);
		}
	public void updateProductName(int SKU, ProductName productName) {
		ProductName.save(ProductName);
	}
	
	public void deletProductName(int SKU) {
		ProductNameRepo.Delet(SKU);
	}
