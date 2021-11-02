package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErroController {

	@GetMapping("/erro")
	public String erro(Model model) {
		model.addAttribute("texto", "Erro Padr�o!");
		return "modules/error/view/erro";
	}
}