package br.com.jamesmayke.certification_nlw.modules.student.controllers;

import br.com.jamesmayke.certification_nlw.modules.student.dto.VerifyHasCertificationDTO;
import br.com.jamesmayke.certification_nlw.modules.student.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        // email e technology
        var result = verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if (result) {
            return "Usuário não pode fazer a prova!";
        }
        return "Usuário pode fazer a prova!";
    }
}
