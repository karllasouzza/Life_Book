package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MensagemController {

	@GetMapping("/mensagem")
	public String mensagem(Model model) {
		model.addAttribute("texto", "Bem-vindo!");
		return "mensagem";
	}
}
