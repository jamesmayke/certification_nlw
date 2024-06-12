package br.com.jamesmayke.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class PrimeiraController {

    @GetMapping("/")
    public String primeiraRota() {
        return "Acessando a rota get de [students] da aplicação.";
    }
}
