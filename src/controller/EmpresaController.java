package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpresaController {

	@GetMapping("/empresa")
	public String empresa(Model model) {
		String colaboradora = "Maria";
		model.addAttribute("colaboradora", colaboradora);
		return "modules/empresa/view/empresa";
	}
}
