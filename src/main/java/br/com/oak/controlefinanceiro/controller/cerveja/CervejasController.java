package br.com.oak.controlefinanceiro.controller.cerveja;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.oak.controlefinanceiro.controller.BasedController;
import br.com.oak.controlefinanceiro.model.cerveja.Cerveja;

@Controller
public class CervejasController extends BasedController {

	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		return "/cervejas/cadastro-cervejas";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			model.addAttribute(cerveja);
			return novo(cerveja);
		}
		
//		cadastrar no banco
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso.");
		
		System.out.println(cerveja.getSku());
		return "redirect:/cervejas/novo";
	}
	
	
}
