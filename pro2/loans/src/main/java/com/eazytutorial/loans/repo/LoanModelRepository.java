package com.eazytutorial.loans.repo;

import com.eazytutorial.loans.model.LoanModel;
import org.springframework.data.repository.CrudRepository;

public interface LoanModelRepository extends CrudRepository<LoanModel, String> {
}
