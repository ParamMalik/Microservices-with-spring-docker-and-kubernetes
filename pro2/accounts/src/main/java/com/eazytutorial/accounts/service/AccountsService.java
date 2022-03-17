package com.eazytutorial.accounts.service;

import com.eazytutorial.accounts.model.AccountsModel;
import com.eazytutorial.accounts.repo.AccountsModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {
    @Autowired
    private AccountsModelRepository accountsModelRepository;

    // Save New Account
    public AccountsModel saveAccount(AccountsModel account) {
        return accountsModelRepository.save(account);
    }

    // Find all account
    public List<AccountsModel> getAccounts() {
        return accountsModelRepository.findAll();
    }

}
