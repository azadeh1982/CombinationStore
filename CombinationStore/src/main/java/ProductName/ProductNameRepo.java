package ProductName;
import org.springframework.data.repository.CrudeRepository;
public interface ProductNameRepo extends CrudeRepository <Product,int> {
	public List<ProductName>findByTopicId(String topicId);
	public List<ProductName>findByStoreName(String StoreName);
	
	
}	




