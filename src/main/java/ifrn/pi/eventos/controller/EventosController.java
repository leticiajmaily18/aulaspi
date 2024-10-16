package ifrn.pi.eventos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

    @RequestMapping("/eventos/form")
    public String form() {
        return "formEvento";
    }

    @PostMapping("/eventos/submeter")
    public String submetido() {
        System.out.println("O formulário foi submetido com sucesso!");
        return "formSubmitSuccess";
    }
}
