package com.example.custmngmnt.customermanagement.dto.request;

import java.util.ArrayList;

public class CustomerSaveRequestDTO {
    private String name;
    private String customerAddress;
    private double customerSalary;
    private ArrayList contactNumbers;
    private String nic;

    public CustomerSaveRequestDTO() {
    }

    public CustomerSaveRequestDTO(String name, String customerAddress, double customerSalary, ArrayList contactNumbers, String nic) {
        this.name = name;
        this.customerAddress = customerAddress;
        this.customerSalary = customerSalary;
        this.contactNumbers = contactNumbers;
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(double customerSalary) {
        this.customerSalary = customerSalary;
    }

    public ArrayList getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ArrayList contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "CustomerSaveRequestDTO{" +
                "name='" + name + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerSalary=" + customerSalary +
                ", contactNumbers=" + contactNumbers +
                ", nic='" + nic + '\'' +
                '}';
    }
}
