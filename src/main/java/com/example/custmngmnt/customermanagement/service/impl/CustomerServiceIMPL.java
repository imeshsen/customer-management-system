package com.example.custmngmnt.customermanagement.service.impl;

import com.example.custmngmnt.customermanagement.dto.request.CustomerSaveRequestDTO;
import com.example.custmngmnt.customermanagement.entity.Customer;
import com.example.custmngmnt.customermanagement.repo.CustomerRepo;
import com.example.custmngmnt.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO) {
        Customer customer = new Customer(
                customerSaveRequestDTO.getName(),
                customerSaveRequestDTO.getCustomerAddress(),
                customerSaveRequestDTO.getCustomerSalary(),
                customerSaveRequestDTO.getContactNumbers(),
                customerSaveRequestDTO.getNic(),
               true
        );

        if(!customerRepo.existsById(customer.getId())){
            customerRepo.save(customer);
            return customer.getName()+" saved";
        }else{
            return "Customer is already exist";
        }


    }
}
