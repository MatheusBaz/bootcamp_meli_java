package com.meli.obterdiploma.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
public class StudentDTO {
    @NotBlank(message= "O nome do aluno não pode ficar vazio.")
    @Size(max = 50, message = "O comprimento do nome do aluno não pode exceder 50 caracteres")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do aluno deve começar com letra maiúscula.")
    private String studentName;
    private String message;
    private Double averageScore;

    @Valid
    @NotEmpty(message = "A lista não pode estar vazia.")
    private List<SubjectDTO> subjects;
}
