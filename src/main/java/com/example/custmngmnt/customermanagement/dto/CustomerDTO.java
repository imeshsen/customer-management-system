package com.example.custmngmnt.customermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private int id;
    private String name;
    private String customerAddress;
    private double customerSalary;
    private ArrayList contactNumbers;
    private String nic;
    private boolean activeState;

//    public CustomerDTO() {
//    }
//
//    public CustomerDTO(int id, String name, String customerAddress, double customerSalary, ArrayList contactNumbers, String nic, boolean activeState) {
//        this.id = id;
//        this.name = name;
//        this.customerAddress = customerAddress;
//        this.customerSalary = customerSalary;
//        this.contactNumbers = contactNumbers;
//        this.nic = nic;
//        this.activeState = activeState;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCustomerAddress() {
//        return customerAddress;
//    }
//
//    public void setCustomerAddress(String customerAddress) {
//        this.customerAddress = customerAddress;
//    }
//
//    public double getCustomerSalary() {
//        return customerSalary;
//    }
//
//    public void setCustomerSalary(double customerSalary) {
//        this.customerSalary = customerSalary;
//    }
//
//    public ArrayList getContactNumbers() {
//        return contactNumbers;
//    }
//
//    public void setContactNumbers(ArrayList contactNumbers) {
//        this.contactNumbers = contactNumbers;
//    }
//
//    public String getNic() {
//        return nic;
//    }
//
//    public void setNic(String nic) {
//        this.nic = nic;
//    }
//
//    public boolean isActiveState() {
//        return activeState;
//    }
//
//    public void setActiveState(boolean activeState) {
//        this.activeState = activeState;
//    }
//
//    @Override
//    public String toString() {
//        return "CustomerDTO{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", customerAddress='" + customerAddress + '\'' +
//                ", customerSalary=" + customerSalary +
//                ", contactNumbers=" + contactNumbers +
//                ", nic='" + nic + '\'' +
//                ", activeState=" + activeState +
//                '}';
//    }
}
