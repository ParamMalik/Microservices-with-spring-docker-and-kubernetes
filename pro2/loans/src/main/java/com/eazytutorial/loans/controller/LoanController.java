package com.eazytutorial.loans.controller;

import com.eazytutorial.loans.LoansApplication;
import com.eazytutorial.loans.config.LoansServiceConfig;
import com.eazytutorial.loans.model.LoanModel;
import com.eazytutorial.loans.model.Properties;
import com.eazytutorial.loans.service.LoanService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;
    @Autowired
    private LoansServiceConfig loansServiceConfig;

    @GetMapping("/loans")
    public Iterable<LoanModel> getLoans(){
        return loanService.getLoans();
    }

    @PostMapping("/add")
    public LoanModel addLoan(@RequestBody LoanModel loanModel){
        return loanService.addLoan(loanModel);
    }

    @GetMapping("/loans/properties")
    public String getServerDetails() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(loansServiceConfig.getMsg(),loansServiceConfig.getBuildVersion(),loansServiceConfig.getMailDetails(),loansServiceConfig.getActiveBranches());
        return objectWriter.writeValueAsString(properties);
    }
}
