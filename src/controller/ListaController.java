package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/lista")
public class ListaController {

	@GetMapping
	public String lista(Model model) {
		List<String> telefones = new ArrayList<>();
		telefones.add("16-3252-1111");
		telefones.add("16-3252-2222");
		telefones.add("16-99999-9999");
		telefones.add("16-99999-1111");
		model.addAttribute("telefones", telefones);
		return "lista";
	}
}
