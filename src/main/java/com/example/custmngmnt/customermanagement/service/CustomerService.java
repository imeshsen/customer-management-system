package com.example.custmngmnt.customermanagement.service;

import com.example.custmngmnt.customermanagement.dto.request.CustomerSaveRequestDTO;

public interface CustomerService {

    String addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);
}
