package com.eazytutorial.loans.controller;

import com.eazytutorial.loans.model.LoanModel;
import com.eazytutorial.loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping("/loans")
    public Iterable<LoanModel> getLoans(){
        return loanService.getLoans();
    }

    @PostMapping("/add")
    public LoanModel addLoan(@RequestBody LoanModel loanModel){
        return loanService.addLoan(loanModel);
    }

}
