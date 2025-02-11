package br.com.eteg.rafael.rafaeleteg.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private Long id;
    private String name;
    private String email;
    private String fiscalId;
    private String colorCode;
    private String notes;

}
