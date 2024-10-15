package ifrn.pi.eventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	public String submetido() {
		System.out.println("O formulário foi submetido corretamente!");
	}
}
