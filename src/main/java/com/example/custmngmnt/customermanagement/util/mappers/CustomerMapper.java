package com.example.custmngmnt.customermanagement.util.mappers;

import com.example.custmngmnt.customermanagement.dto.CustomerDTO;
import com.example.custmngmnt.customermanagement.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO entityToDto(Customer customer);
}
