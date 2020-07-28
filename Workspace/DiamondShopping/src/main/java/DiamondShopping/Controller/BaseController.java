package DiamondShopping.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DiamondShopping.Service.HomeServiceImp;

@Controller
public class BaseController {

	@Autowired
	protected HomeServiceImp homeService;
	
	protected ModelAndView modelAndView = new ModelAndView();
	
	@PostConstruct
	protected ModelAndView initialize() {
		modelAndView.addObject("navigationBarList", homeService.getDataNavigationBarList());
		return modelAndView;
	}
	
}
