package br.com.jamesmayke.certification_nlw.modules.student.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
    private UUID studentID;
    private UUID id;
    private String technology;
    private int grate;
    private List<AnswersCertificationsEntity> answersCertificationsEntity;
}
