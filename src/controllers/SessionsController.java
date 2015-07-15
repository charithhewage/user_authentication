package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SessionsController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
		public ModelAndView user() {
	    	return new ModelAndView("index", "show", new models.User());
		}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView newSession() {
 
		ModelAndView modelandview = new ModelAndView("users/index");
		modelandview.addObject("message", "Hello Charith hewage");
  
        return modelandview;
    }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("user1") models.User user) {

		
		ModelAndView model = new ModelAndView("users/show");
		model.addObject("hello", "hello Message");
	      
	      return model;
	}

}
