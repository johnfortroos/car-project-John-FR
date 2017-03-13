package tech.tarragona.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tech.tarragona.spring.repository.ProductRepository;
import tech.tarragona.spring.service.ProductsService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductsService productsService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		long productCount = productRepository.count();
		logger.info("productCount: " + productCount);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@GetMapping(value = "/tabla")
	public String findAllProducts(Model model) {
		model.addAttribute("products", productsService.getProducts());
		return "mostrarProductos";
				
	}
	
	
	
	
}