package br.com.oak.controlefinanceiro.controller.cliente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.oak.controlefinanceiro.controller.BasedController;

@Controller
public class ClienteController extends BasedController {

	@RequestMapping("/cliente/novo")
	public String novo() {
		return "cliente/clienteCadastro";
	}
	
}