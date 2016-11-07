package it.alfasoft.gruppo.controller;

import it.alfasoft.gruppo.dao.VoceDao;
import it.alfasoft.gruppo.model.Voce;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerRubrica {
	
	@RequestMapping("/rubrica.html")
	public ModelAndView ilMiotodoPrimo(){
		
		ModelAndView model=new ModelAndView("home2");
		
		return model;	
	}
	
	@RequestMapping("/aggiungiVoce.html")
	public ModelAndView addVoce(@ModelAttribute("voce") Voce voce,BindingResult bind){
			
			
			if(bind.hasErrors()){
			
			ModelAndView model=new ModelAndView("home2");

		  
			return  model;
			
			}
			
			ModelAndView model=new ModelAndView("rubrica");
			VoceDao vdao= new VoceDao();
			vdao.insertVoce(voce);

			
			return  model;
			
	}	
}
