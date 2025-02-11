package br.com.eteg.rafael.rafaeleteg.service.impl;

import br.com.eteg.rafael.rafaeleteg.dto.CustomerDto;
import br.com.eteg.rafael.rafaeleteg.model.Customer;
import br.com.eteg.rafael.rafaeleteg.repository.CustomerRepository;
import br.com.eteg.rafael.rafaeleteg.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        Customer customer = toEntity(customerDto);
        return toDto(customerRepository.save(customer));
    }

    private Customer toEntity(CustomerDto dto) {
        return Customer.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .colorCode(dto.getColorCode())
                .fiscalId(dto.getFiscalId())
                .notes(dto.getNotes())
                .build();
    }

    private CustomerDto toDto(Customer entity) {
        return CustomerDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .colorCode(entity.getColorCode())
                .fiscalId(entity.getFiscalId())
                .notes(entity.getNotes())
                .build();
    }

}
