package br.com.oak.controlefinanceiro.controller.usuario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.oak.controlefinanceiro.controller.BasedController;
import br.com.oak.controlefinanceiro.model.Usuario;

@Controller
public class UsuarioController extends BasedController {

	@RequestMapping(value = "/usuario/novo")
	public String novo(Usuario usuario) {
		return "usuario/usuarioCadastro";
	}
	
}
