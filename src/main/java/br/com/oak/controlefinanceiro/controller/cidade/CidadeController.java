package br.com.oak.controlefinanceiro.controller.cidade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.oak.controlefinanceiro.controller.BasedController;
import br.com.oak.controlefinanceiro.model.cidade.Cidade;

@Controller
public class CidadeController extends BasedController {
	
	@RequestMapping("cidade/novo")
	public String novo(Cidade cidade) {
		return "cidade/cidadeCadastro";
	}

}
