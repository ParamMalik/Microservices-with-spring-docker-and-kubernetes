package com.eazytutorial.loans.service;

import com.eazytutorial.loans.model.LoanModel;
import com.eazytutorial.loans.repo.LoanModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired
    private LoanModelRepository loanModelRepository;

    public Iterable<LoanModel> getLoans() {
        return loanModelRepository.findAll();
    }

    public LoanModel addLoan(LoanModel loanModel) {
        return loanModelRepository.save(loanModel);
    }
}
