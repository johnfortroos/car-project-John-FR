package tech.tarragona.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.model.Cars;
import tech.tarragona.spring.service.CarsServise;

@Controller
@RequestMapping(value = {"/cars", "/"})
public class IndexController {
	@Autowired
	CarsServise carsServise;
	
	public static final String VIEW_CARS = "cars";
	public static final String VIEW_ADD_CARS = "addCars";
	public static final String VIEW_EDIT_CARS = "editCars";
	public static final String REDIRECT_CARS = "redirect:/" + VIEW_CARS;
	
	//mostrar todos en pag init
	@GetMapping
	public String getPeople(Model model) {
		model.addAttribute("Cars", carsServise.getCars());
		return VIEW_CARS;
	}
	@GetMapping("/add")
	public String addCars(Model model) {
		model.addAttribute("cars", new Cars());
		return VIEW_ADD_CARS;
	}
	
	@PostMapping("/add")
	public String addCars(@Valid @ModelAttribute("person") Cars cars, BindingResult result, Model model) {
		
			carsServise.saveCars(cars);
			return REDIRECT_CARS;	
		
	}

	
	@GetMapping("/{matricula}")
	public String getCars(@PathVariable String matricula, Model model) {
		Cars cars = carsServise.getCarsByMatricula(matricula);
		model.addAttribute("cars", cars);
		return VIEW_EDIT_CARS;
	}
	//edit
	@PostMapping("/{matricula}")
	public String updateCars(@Valid @ModelAttribute("cars") Cars cars, BindingResult result, @PathVariable String matricula, Model model) {
		
		carsServise.saveCars(cars);
		
		return REDIRECT_CARS;
	}
}
