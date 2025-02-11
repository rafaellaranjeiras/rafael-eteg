package br.com.eteg.rafael.rafaeleteg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "fiscal_id", nullable = false, length = 11)
    private String fiscalId;

    @Column(name = "color_code", nullable = false, length = 7)
    private String colorCode;

    @Column(name = "notes", nullable = false, length = 1000)
    private String notes;

}
