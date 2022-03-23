package com.eazytutorial.accounts.controller;

import com.eazytutorial.accounts.config.AccountsServiceConfig;
import com.eazytutorial.accounts.model.AccountsModel;
import com.eazytutorial.accounts.model.Properties;
import com.eazytutorial.accounts.service.AccountsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
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

    @Autowired
    private AccountsServiceConfig accountsServiceConfig;

    @GetMapping(path = "/accounts")
    public List<AccountsModel> getAccounts() {
        return accountsService.getAccounts();
    }

    @PostMapping(path = "/save")
    public AccountsModel saveAccount(@RequestBody AccountsModel accountsModel) {
        return accountsService.saveAccount(accountsModel);
    }

    @GetMapping("/account/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(accountsServiceConfig.getMsg(), accountsServiceConfig.getBuildVersion(), accountsServiceConfig.getMailDetails(), accountsServiceConfig.getActiveBranches());
        String s = objectWriter.writeValueAsString(properties);
        return s;


    }
}
