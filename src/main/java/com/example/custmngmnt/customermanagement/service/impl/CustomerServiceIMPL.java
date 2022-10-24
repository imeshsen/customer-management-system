package com.example.custmngmnt.customermanagement.service.impl;

import com.example.custmngmnt.customermanagement.dto.CustomerDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerSaveRequestDTO;
import com.example.custmngmnt.customermanagement.dto.request.CustomerUpdateRequestDTO;
import com.example.custmngmnt.customermanagement.entity.Customer;
import com.example.custmngmnt.customermanagement.repo.CustomerRepo;
import com.example.custmngmnt.customermanagement.service.CustomerService;
import com.example.custmngmnt.customermanagement.util.mappers.CustomerMapper;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public String addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO) {
        Customer customer = new Customer(
                customerSaveRequestDTO.getName(),
                customerSaveRequestDTO.getCustomerAddress(),
                customerSaveRequestDTO.getCustomerSalary(),
                customerSaveRequestDTO.getContactNumbers(),
                customerSaveRequestDTO.getNic(),
                false
        );

        if (!customerRepo.existsById(customer.getId())) {
            customerRepo.save(customer);
            return customer.getName() + " saved";
        } else {
            return "Customer is already exist";
        }


    }

    @Override
    public String updateCustomer(CustomerUpdateRequestDTO customerUpdateRequestDTO) {
        if (customerRepo.existsById(customerUpdateRequestDTO.getId())) {
            Customer customer = customerRepo.getReferenceById(customerUpdateRequestDTO.getId());
            customer.setName(customerUpdateRequestDTO.getName());
            customer.setCustomerAddress((customerUpdateRequestDTO.getCustomerAddress()));
            customer.setCustomerSalary(customerUpdateRequestDTO.getCustomerSalary());
            customer.setContactNumbers(customerUpdateRequestDTO.getContactNumbers());
            customer.setNic(customerUpdateRequestDTO.getNic());
            customer.setActiveState(customerUpdateRequestDTO.isActiveState());

            customerRepo.save(customer);
            return customer.getName() + " updated";
        } else {
            return "Customer not found";
        }

    }

    @Override
    public CustomerDTO getCustomerById(int customerId) {
        Optional<Customer> customer = customerRepo.findById(customerId);
        if (customer.isPresent()) {
//            CustomerDTO customerDTO = new CustomerDTO(
//                    customer.get().getId(),
//                    customer.get().getName(),
//                    customer.get().getCustomerAddress(),
//                    customer.get().getCustomerSalary(),
//                    customer.get().getContactNumbers(),
//                    customer.get().getNic(),
//                    customer.get().isActiveState()
//            );
//            return customerDTO;

//            CustomerDTO customerDTO = modelMapper.map(customer.get(), CustomerDTO.class);
            CustomerDTO customerDTO =customerMapper.entityToDto(customer.get());
            return customerDTO;
        } else {
            return null;
        }

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> getCustomers = customerRepo.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
//        for (Customer c:getCustomers){
//            CustomerDTO customerDTO = new CustomerDTO(
//                    c.getId(),
//                    c.getName(),
//                    c.getCustomerAddress(),
//                    c.getCustomerSalary(),
//                    c.getContactNumbers(),
//                    c.getNic(),
//                    c.isActiveState()
//            );
//            customerDTOList.add(customerDTO);
//        }

        List<CustomerDTO> customerDTOS = modelMapper.
                map(getCustomers, new TypeToken<List<CustomerDTO>>() {
                }.getType());
        return customerDTOS;
    }

    @Override
    public boolean deleteCustomer(int id) throws NotFoundException {
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }else{
            throw new NotFoundException("Not found customer for this id");
        }
        return true;
    }

    @Override
    public List<CustomerDTO> getByName(String customerName) throws NotFoundException {
        List<Customer>customers = customerRepo.findAllByNameEquals(customerName);
        if (customers.size() !=0){
            List<CustomerDTO> customerDTOS = modelMapper.
                    map(customers, new TypeToken<List<CustomerDTO>>() {
                    }.getType());
            return customerDTOS;
        }else{
            throw new NotFoundException("No results");
        }

    }


}
