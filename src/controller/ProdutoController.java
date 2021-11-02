package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ProdutoDAO;
import model.Produto;

@Controller
public class ProdutoController {

	@GetMapping("/cadastroproduto")
	public String cadastroProduto(Model model) {
		return "modules/produto/view/cadastroproduto";
	}

	@PostMapping("/cadastrarproduto")
	public String cadastrarProduto(HttpServletRequest req, Model model) {
		String descricao = req.getParameter("descricao");
		Double valor = Double.parseDouble(req.getParameter("valor"));
		Produto produto = new Produto();
		produto.setDescricao(descricao);
		produto.setValor(valor);
		ProdutoDAO dao = new ProdutoDAO();
		String mensagem = dao.salvar(produto);
		model.addAttribute("texto", mensagem);
		return "mensagem";
	}

	@GetMapping("/listarprodutos")
	public String listarProdutos(Model model) {
		ProdutoDAO dao = new ProdutoDAO();
		// List<Produto> listaProdutos = dao.listarTodos();
		// model.addAttribute("listaProdutos", listaProdutos);
		model.addAttribute("listaProdutos", dao.listarTodos());
		return "modules/produto/view/listagemprodutos";
	}

	@GetMapping("/alteracaoproduto")
	public String alteracaoProduto(HttpServletRequest req, Model model) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("produto", dao.getProdutoPorCodigo(codigo));
		return "modules/produto/view/alteracaoproduto";
	}

	@PostMapping("/alterarproduto")
	public String alterarProduto(HttpServletRequest req, Model model) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String descricao = req.getParameter("descricao");
		Double valor = Double.parseDouble(req.getParameter("valor"));
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		produto.setDescricao(descricao);
		produto.setValor(valor);
		ProdutoDAO dao = new ProdutoDAO();
		model.addAttribute("texto", dao.alterar(produto));
		return "mensagemalterar";
	}
}
