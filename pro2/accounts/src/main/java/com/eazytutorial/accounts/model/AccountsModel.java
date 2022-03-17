package com.eazytutorial.accounts.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "accounts_data")
public class AccountsModel {
    @Id
    private Integer customerId;
    private String name;
    private Long accountNumber;
    private LocalDate createdDate;


}
