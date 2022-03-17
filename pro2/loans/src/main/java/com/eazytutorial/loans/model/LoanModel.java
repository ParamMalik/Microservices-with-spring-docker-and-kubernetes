package com.eazytutorial.loans.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "loan_data")
public class LoanModel {
    @Id
    private String loanId;
    private Integer loanNumber;
    private String name;
    private Double amount;

}
