package br.org.arthurhoengen.api.api_java;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class ApiJavaApplication {

	@RequestMapping(value = "/receita", method = RequestMethod.GET)
	public ModelAndView receita() {
		return new ModelAndView("receita", "command", new Receita());
	}

	@RequestMapping(value = "/addReceita", method = RequestMethod.POST)
	public String adicionarReceita(
			@ModelAttribute("SpringWeb") Receita receita, ModelMap model,
			HttpServletRequest request) {

		model.addAttribute("nome", receita.getNome());
		model.addAttribute("ingredientes", receita.getIngredientes());
		model.addAttribute("precoEstimado", receita.getPrecoEstimado());
		model.addAttribute("categorias", receita.getCategorias());

		List<Receita> receitas = (List<Receita>) request.getSession().getAttribute("receitas");
		if (receitas == null) {
			receitas = new ArrayList<Receita>();
		}
		receitas.add(receita);
		request.getSession().setAttribute("receitas", receitas);

		return "exibeReceita";
	}

	@RequestMapping(value = "/listaReceitas", method = RequestMethod.GET)
	public String listarReceitas(
			@ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {

		List<Receita> receitas =(List<Receita>) request.getAttribute("receitas");

		model.addAttribute("receitas", receitas);

		return "listaReceitas";
	}

}
