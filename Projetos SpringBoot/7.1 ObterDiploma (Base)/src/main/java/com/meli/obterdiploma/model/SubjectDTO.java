package com.meli.obterdiploma.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@Valid
public class SubjectDTO {
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Size(max = 30, message = "O comprimento do assunto não pode exceder 30 caracteres")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do assunto deve começar com letra maiúscula.")
    private String name;

    @NotNull(message = "A nota não pode estar vazia.")
    @Min(value = 0)
    @Max(value = 10)
    private Double score;
}
