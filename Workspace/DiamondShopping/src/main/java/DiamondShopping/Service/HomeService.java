package DiamondShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShopping.Dto.Product;
import DiamondShopping.Entity.Category;
import DiamondShopping.Entity.NavigationBar;
import DiamondShopping.Entity.Slide;

@Service
public interface HomeService {
	
	@Autowired
	public List<Slide> getDataSlideList();
	
	@Autowired
	public List<Category> getDataCategoryList();
	
	@Autowired
	public List<NavigationBar> getDataNavigationBarList();
	
	@Autowired
	public List<Product> getDataProductList();
	
}
