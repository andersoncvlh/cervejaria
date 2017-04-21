package br.com.oak.controlefinanceiro.controller.estilo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.oak.controlefinanceiro.controller.BasedController;

@Controller
public class EstiloController extends BasedController {

	@RequestMapping("estilo/novo")
	public String novo() {
		return "estilo/estiloCadastro";
	}
	
}
