package it.alfasoft.gruppo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerRubrica {
	
	@RequestMapping("/rubrica.html")
	public ModelAndView ilMiotodoPrimo(){
		
		ModelAndView model=new ModelAndView("cartella/file.jsp ");
		
		return model;
		
	}
}
