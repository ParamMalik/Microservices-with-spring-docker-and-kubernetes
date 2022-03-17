package com.eazytutorial.accounts.repo;

import com.eazytutorial.accounts.model.AccountsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountsModelRepository extends JpaRepository<AccountsModel, Integer> {
}