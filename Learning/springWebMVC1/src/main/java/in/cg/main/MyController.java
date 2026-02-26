package in.cg.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/homePage")
	public ModelAndView openHomePage() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
}
