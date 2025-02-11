package br.com.eteg.rafael.rafaeleteg.controller;

import br.com.eteg.rafael.rafaeleteg.dto.CustomerDto;
import br.com.eteg.rafael.rafaeleteg.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
@RequiredArgsConstructor
@Tag(name = "Costumer")
public class CustomerController {

    private final CustomerService customerService;

    @Operation(summary = "Create customer", description = "Create new customer.")
    @PostMapping
    public ResponseEntity<CustomerDto> newCustomer(@RequestBody CustomerDto customerDto) {
        return ResponseEntity.ok().body(customerService.save(customerDto));
    }

}
