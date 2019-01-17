package glo.springframework.ggpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController
{
<<<<<<< HEAD
	@RequestMapping( { "", "/", "/index", "/index.html" } )
=======
	@RequestMapping( { "/owners", "/owners/index", "/owners/index.html" } )
>>>>>>> ac6e73e2667cefa2828aab0ae403f057ad5f7593
	public String listOwners()
	{
		return "owners/index";
	}

}
