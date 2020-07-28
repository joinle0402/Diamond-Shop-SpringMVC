package DiamondShopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	
	@RequestMapping(value = {"/", "/home-page"})
	public ModelAndView index() {
		
		modelAndView.addObject("slideList", homeService.getDataSlideList());
		modelAndView.addObject("categoryList", homeService.getDataCategoryList());
		modelAndView.addObject("productList", homeService.getDataProductList());
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
}
