package br.com.jamesmayke.certification_nlw.modules.student.useCases;

import br.com.jamesmayke.certification_nlw.modules.student.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {


    public boolean execute(VerifyHasCertificationDTO dto) {
        return dto.getEmail().equals("jamezmayke@gmail.com")
                &&
                dto.getTechnology().equalsIgnoreCase("JAVA");
    }
}
