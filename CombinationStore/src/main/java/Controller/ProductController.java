package Controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.hibernate.service.internal.ProvidedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProductController<ProductService>{
	private ProductController productController;
	private ProductController productService;
	

	@Autowired
    public void ProductService(ProductService productService) {
        this.productService = productService;
    }

	 @RequestMapping(value="/", method=RequestMethod.GET)
	    public void String (ProductController model)
	 {
	        model.addAttribute("SKU", productService.getSKU());
	        model.addAttribute("productName", productService.getproductName());
	        model.addAttribute("storeName", productService.getstoreName());
	        model.addAttribute("Quantity", productService.getQuantity());
	        model.addAttribute("totalsale", productService.gettotalsale());
	        model.ddAttribute(" weeklyQuantity", productService.getweeklyQuantity());
	        model.addAttribute("message", productService.getMessage());     
	        return index;
	 }

	@RequestMapping(value="/addProduct/{Quantiy}", method=RequestMethod.GET)
	    public String addProduct(@PathVariable String Quantiy) {
		 ((ProductController) productService).addProduct(Quantiy);
	        return "redirect:/";
	    }
	    
	    @RequestMapping(value="/getQuantity", method=RequestMethod.GET)
	    public String getQuantity() {
	    	((ProductController) productService).getQuantity();
	        return "redirect:/";
	    }
	    
	    @RequestMapping(value="/totalsale", method=RequestMethod.GET)
	    public String totalsale() {
	    	((ProductController) productService).totalsale();
	        return "redirect:/";
	    }
	    
	    @RequestMapping(value="/weeklyQuantity/{id}", method=RequestMethod.GET)
	    public String weeklyQuantity(@PathVariable("id") int id) {
	    	((ProductController) productService).weeklyQuantity(id);
	        return "redirect:/";
	    }
	}
