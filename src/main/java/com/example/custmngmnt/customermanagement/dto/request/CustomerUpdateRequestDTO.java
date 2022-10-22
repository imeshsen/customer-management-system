package com.example.custmngmnt.customermanagement.dto.request;

import lombok.*;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data //getter,setter and toString together
public class CustomerUpdateRequestDTO {
    private int id;
    private String name;
    private String customerAddress;
    private double customerSalary;
    private ArrayList contactNumbers;
    private String nic;
    private boolean activeState;
}
