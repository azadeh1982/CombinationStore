package Model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
public abstract class ProductDaoImpl implements ProductDao{
   
	@Autowired
	private ModelRepo modelRepo;
	
	private List<Product> product= new Arrays.list
	new Topic(001,"Lamer Creme", "Neiman Marcus", 12),
	new Topic(002, "Lamer Creme", "Saks Fifth Avenu",13),
	new Topic(003, "Lamer Creme", "Nordstrom",14),
	new Topic(004, "Lamer Creme", "Macy's",15),

	}	
		public List<Product> getAllProducts(){
			List<Product>products =new ArrayList<>();
			ModelRepo()
			.forEach(products::add);
			return products;
			
		}
		public Product getProduct(int SKU) {
			return ProductRepo.findOne(SkU);
			
		}
		public void addProduct(Product product) {
			productRepo.save(product);
		}
	public void updateProduct(int SKU, Product product) {
		Product.save(product);
	}
	
	public void deletProduct(int SKU) {
		productRepo.Delet(SKU);
	}
