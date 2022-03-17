package com.eazytutorial.accounts.controller;

import com.eazytutorial.accounts.model.AccountsModel;
import com.eazytutorial.accounts.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @GetMapping(path = "/accounts")
    public List<AccountsModel> getAccounts() {
        return accountsService.getAccounts();
    }

    @PostMapping(path = "/save")
    public AccountsModel saveAccount(@RequestBody AccountsModel accountsModel) {
        return accountsService.saveAccount(accountsModel);
    }
}
