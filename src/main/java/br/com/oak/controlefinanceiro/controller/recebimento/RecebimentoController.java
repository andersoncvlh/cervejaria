package br.com.oak.controlefinanceiro.controller.recebimento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.oak.controlefinanceiro.controller.BasedController;
import br.com.oak.controlefinanceiro.model.recebimento.Recebimento;

@Controller
public class RecebimentoController extends BasedController {

	@RequestMapping("/recebimento/novo")
	public String novo() {
		return "/recebimento/recebimentoCadastro";
	}
	
	@RequestMapping(value = "/recebimento/novo", method = RequestMethod.POST)
	public String cadastrar(Recebimento recebimento) {
		System.out.println(recebimento.getDescricao());
		return "/recebimento/recebimentoCadastro";
	}
	
}
