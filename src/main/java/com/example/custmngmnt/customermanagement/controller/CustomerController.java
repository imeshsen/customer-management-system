package com.example.custmngmnt.customermanagement.controller;

import com.example.custmngmnt.customermanagement.dto.CustomerDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerSaveRequestDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerUpdateRequestDTO;
import com.example.custmngmnt.customermanagement.service.CustomerService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO) {
        String id = customerService.addCustomer(customerSaveRequestDTO);
        return id;
    }

    @PutMapping(path = "/update")
    public String updateCustomer(@RequestBody CustomerUpdateRequestDTO customerUpdateRequestDTO) {
        String updated = customerService.updateCustomer(customerUpdateRequestDTO);
        return updated;
    }

    @GetMapping(
            path = "/get-by-id",
            params = "id"
    )
    public CustomerDTO getCustomerById(@RequestParam(value = "id") int customerId) {
        CustomerDTO customerDTO = customerService.getCustomerById(customerId);
        return customerDTO;
    }

    @GetMapping(
            path = "/get-all-customer"
    )
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }

    @DeleteMapping(
            path = {"/delete-customer/{id}"}
    )
    public String deleteCustomer(@PathVariable(value = "id")int id) throws NotFoundException {
        boolean deletedCustomer = customerService.deleteCustomer(id);
        return "deleted";
    }

    @GetMapping(
            path = {"/get-by-name"},
            params = {"name"}
    )
    public List<CustomerDTO> getCustomerByName(@RequestParam(value = "name")String customerName) throws NotFoundException {
        List<CustomerDTO>getCustomer = customerService.getByName(customerName);
        return getCustomer;
    }
}
