package com.example.custmngmnt.customermanagement.service;

import com.example.custmngmnt.customermanagement.dto.CustomerDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerSaveRequestDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerUpdateRequestDTO;

public interface CustomerService {

    String addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    String updateCustomer(CustomerUpdateRequestDTO customerUpdateRequestDTO);


    CustomerDTO getCustomerById(int customerId);
}
