package com.eazytutorial.loans.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "loan_data")
public class LoanModel {

    @Id
    private String loanId;
    private Integer loanNumber;
    private String name;
    private Double amount;

}
