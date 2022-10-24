package com.example.custmngmnt.customermanagement.service;

import com.example.custmngmnt.customermanagement.dto.CustomerDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerSaveRequestDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerUpdateRequestDTO;
import javassist.NotFoundException;

import java.util.List;

public interface CustomerService {

    String addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    String updateCustomer(CustomerUpdateRequestDTO customerUpdateRequestDTO);


    CustomerDTO getCustomerById(int customerId);

    List<CustomerDTO> getAllCustomers();

    boolean deleteCustomer(int id) throws NotFoundException;

    List<CustomerDTO> getByName(String customerName) throws NotFoundException;
}
